package com.revature.Revature_ERS_Backend.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.revature.Revature_ERS_Backend.entity.Reimbursement;
import com.revature.Revature_ERS_Backend.entity.User;
import com.revature.Revature_ERS_Backend.repository.ReimbursementRepository;
import com.revature.Revature_ERS_Backend.repository.UserRepository;
import com.revature.Revature_ERS_Backend.security.JwtService;
import com.revature.Revature_ERS_Backend.service.ReimbursementService;
import com.revature.Revature_ERS_Backend.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

class AdminControllerTest {
    /**
     * Method under test: {@link AdminController#getReimbursement()}
     */
    @Test
    void testGetReimbursement() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        ArrayList<Reimbursement> reimbursementList = new ArrayList<>();
        when(reimbursementRepository.findAll()).thenReturn(reimbursementList);
        JwtService jwtService = new JwtService();
        ReimbursementService reimbursementService = new ReimbursementService(reimbursementRepository, jwtService,
                new UserService(mock(UserRepository.class)));

        List<Reimbursement> actualReimbursement = (new AdminController(reimbursementService,
                new UserService(mock(UserRepository.class)))).getReimbursement();
        assertSame(reimbursementList, actualReimbursement);
        assertTrue(actualReimbursement.isEmpty());
        verify(reimbursementRepository).findAll();
    }

    /**
     * Method under test: {@link AdminController#getReimbursement()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetReimbursement2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.revature.Revature_ERS_Backend.service.ReimbursementService.getReimbursements()" because "this.reimbursementService" is null
        //       at com.revature.Revature_ERS_Backend.controller.AdminController.getReimbursement(AdminController.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        (new AdminController(null, new UserService(mock(UserRepository.class)))).getReimbursement();
    }

    /**
     * Method under test: {@link AdminController#getUser()}
     */
    @Test
    void testGetUser() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        UserRepository userRepository = mock(UserRepository.class);
        ArrayList<User> userList = new ArrayList<>();
        when(userRepository.findAll()).thenReturn(userList);
        UserService userService = new UserService(userRepository);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        JwtService jwtService = new JwtService();
        List<User> actualUser = (new AdminController(
                new ReimbursementService(reimbursementRepository, jwtService, new UserService(mock(UserRepository.class))),
                userService)).getUser();
        assertSame(userList, actualUser);
        assertTrue(actualUser.isEmpty());
        verify(userRepository).findAll();
    }

    /**
     * Method under test: {@link AdminController#getUser()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUser2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.revature.Revature_ERS_Backend.service.UserService.getUsers()" because "this.userService" is null
        //       at com.revature.Revature_ERS_Backend.controller.AdminController.getUser(AdminController.java:39)
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        JwtService jwtService = new JwtService();
        (new AdminController(
                new ReimbursementService(reimbursementRepository, jwtService, new UserService(mock(UserRepository.class))),
                null)).getUser();
    }

    /**
     * Method under test: {@link AdminController#getUser()}
     */
    @Test
    void testGetUser3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        UserService userService = mock(UserService.class);
        ArrayList<User> userList = new ArrayList<>();
        when(userService.getUsers()).thenReturn(userList);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        JwtService jwtService = new JwtService();
        List<User> actualUser = (new AdminController(
                new ReimbursementService(reimbursementRepository, jwtService, new UserService(mock(UserRepository.class))),
                userService)).getUser();
        assertSame(userList, actualUser);
        assertTrue(actualUser.isEmpty());
        verify(userService).getUsers();
    }

    /**
     * Method under test: {@link AdminController#updateUser(Long)}
     */
    @Test
    void testUpdateUser() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.save(Mockito.<User>any())).thenReturn(new User());
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        UserService userService = new UserService(userRepository);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        JwtService jwtService = new JwtService();
        ResponseEntity actualUpdateUserResult = (new AdminController(
                new ReimbursementService(reimbursementRepository, jwtService, new UserService(mock(UserRepository.class))),
                userService)).updateUser(1L);
        assertEquals("User updated", actualUpdateUserResult.getBody());
        assertEquals(200, actualUpdateUserResult.getStatusCodeValue());
        assertTrue(actualUpdateUserResult.getHeaders().isEmpty());
        verify(userRepository).save(Mockito.<User>any());
        verify(userRepository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link AdminController#updateUser(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateUser2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.util.Optional.orElseThrow(Optional.java:377)
        //       at com.revature.Revature_ERS_Backend.service.UserService.updateUser(UserService.java:20)
        //       at com.revature.Revature_ERS_Backend.controller.AdminController.updateUser(AdminController.java:50)
        //   See https://diff.blue/R013 to resolve this issue.

        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.save(Mockito.<User>any())).thenReturn(new User());
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        UserService userService = new UserService(userRepository);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        JwtService jwtService = new JwtService();
        (new AdminController(
                new ReimbursementService(reimbursementRepository, jwtService, new UserService(mock(UserRepository.class))),
                userService)).updateUser(1L);
    }

    /**
     * Method under test: {@link AdminController#updateUser(Long)}
     */
    @Test
    void testUpdateUser3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        UserService userService = mock(UserService.class);
        when(userService.updateUser(Mockito.<Long>any())).thenReturn(null);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        JwtService jwtService = new JwtService();
        assertNull((new AdminController(
                new ReimbursementService(reimbursementRepository, jwtService, new UserService(mock(UserRepository.class))),
                userService)).updateUser(1L));
        verify(userService).updateUser(Mockito.<Long>any());
    }
}

