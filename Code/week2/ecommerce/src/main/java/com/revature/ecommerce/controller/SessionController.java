package com.revature.ecommerce.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.ecommerce.entity.User;
import com.revature.ecommerce.repository.UserRepository;
import com.revature.ecommerce.dto.registerDTO;
import com.revature.ecommerce.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class SessionController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    AuthenticationService authenticationService;



    ObjectMapper objectMapper = new ObjectMapper();


    @PostMapping("/login")
    @ResponseBody
    @JsonFormat
    public String login(@RequestParam String username, @RequestParam String password) throws JsonProcessingException {

        User user = userRepository.findByUsernameAndPassword(username, password); //
        if ( user != null) { // if user is not null, then we can login
            String token =  authenticationService.login(username, password, user.getId(), user.getRole()); // return the token
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(Collections.singletonMap("token", token));
        } else { // if user is null, then we cannot login
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(Collections.singletonMap("token", "login failed"));
            //return "login failed";
        }
    }

    @GetMapping("/auth")
    @ResponseBody
    public String validateToken(@RequestParam String token) {
        return authenticationService.validateToken(token);
    }

    @PostMapping(value = "/register", produces = "application/json")
    @ResponseBody
    public String register(@RequestBody registerDTO registerdto) throws JsonProcessingException {
        // todo: check if username is already taken
        String username = registerdto.getUsername();
        String password = registerdto.getPassword();
        String firstName = registerdto.getFirstName();
        String lastName = registerdto.getLastName();
        String role = "user";
        try {
            userRepository.save(new User(username, password, firstName, lastName, role));
        } catch (Exception e) {
            return objectMapper.writeValueAsString(Collections.singletonMap("Error", "Username already taken or invalid input"));
        }
        // save the user to the database
        return objectMapper.writeValueAsString(Collections.singletonMap("register", "success"));
    }
}
