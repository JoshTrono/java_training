package com.revature.Revature_ERS_Backend.controller;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.revature.Revature_ERS_Backend.entity.Reimbursement;
import com.revature.Revature_ERS_Backend.entity.User;
import com.revature.Revature_ERS_Backend.models.CreateRepositoryRequest;
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

class ReimbursementControllerTest {
    /**
     * Method under test: {@link ReimbursementController#createReimbursement(CreateRepositoryRequest, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateReimbursement() {
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
        //   java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.createReimbursement(ReimbursementService.java:32)
        //       at com.revature.Revature_ERS_Backend.controller.ReimbursementController.createReimbursement(ReimbursementController.java:33)
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        JwtService jwtService = new JwtService();
        ReimbursementController reimbursementController = new ReimbursementController(
                new ReimbursementService(reimbursementRepository, jwtService, new UserService(mock(UserRepository.class))));

        CreateRepositoryRequest request = new CreateRepositoryRequest();
        request.setAmount(10);
        request.setDescription("The characteristics of someone or something");
        reimbursementController.createReimbursement(request, "ABC123");
    }

    /**
     * Method under test: {@link ReimbursementController#createReimbursement(CreateRepositoryRequest, String)}
     */
    @Test
    void testCreateReimbursement2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementService reimbursementService = mock(ReimbursementService.class);
        Reimbursement reimbursement = new Reimbursement();
        when(reimbursementService.createReimbursement(anyInt(), Mockito.<String>any(), Mockito.<String>any()))
                .thenReturn(reimbursement);
        ReimbursementController reimbursementController = new ReimbursementController(reimbursementService);

        CreateRepositoryRequest request = new CreateRepositoryRequest();
        request.setAmount(10);
        request.setDescription("The characteristics of someone or something");
        assertSame(reimbursement, reimbursementController.createReimbursement(request, "ABC123"));
        verify(reimbursementService).createReimbursement(anyInt(), Mockito.<String>any(), Mockito.<String>any());
    }

    /**
     * Method under test: {@link ReimbursementController#getReimbursements(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetReimbursements() {
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
        //   java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
        //       at com.revature.Revature_ERS_Backend.controller.ReimbursementController.extractToken(ReimbursementController.java:64)
        //       at com.revature.Revature_ERS_Backend.controller.ReimbursementController.getReimbursements(ReimbursementController.java:43)
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        JwtService jwtService = new JwtService();
        (new ReimbursementController(
                new ReimbursementService(reimbursementRepository, jwtService, new UserService(mock(UserRepository.class)))))
                .getReimbursements("ABC123");
    }

    /**
     * Method under test: {@link ReimbursementController#getReimbursements(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetReimbursements2() {
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
        //   io.jsonwebtoken.MalformedJwtException: JWT strings must contain exactly 2 period characters. Found: 0
        //       at io.jsonwebtoken.impl.DefaultJwtParser.parse(DefaultJwtParser.java:275)
        //       at io.jsonwebtoken.impl.DefaultJwtParser.parse(DefaultJwtParser.java:529)
        //       at io.jsonwebtoken.impl.DefaultJwtParser.parseClaimsJws(DefaultJwtParser.java:589)
        //       at io.jsonwebtoken.impl.ImmutableJwtParser.parseClaimsJws(ImmutableJwtParser.java:173)
        //       at com.revature.Revature_ERS_Backend.security.JwtService.extractAllClaims(JwtService.java:63)
        //       at com.revature.Revature_ERS_Backend.security.JwtService.extractClaim(JwtService.java:31)
        //       at com.revature.Revature_ERS_Backend.security.JwtService.extractUsername(JwtService.java:23)
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.getReimbursementsFromUser(ReimbursementService.java:50)
        //       at com.revature.Revature_ERS_Backend.controller.ReimbursementController.getReimbursements(ReimbursementController.java:43)
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        JwtService jwtService = new JwtService();
        (new ReimbursementController(
                new ReimbursementService(reimbursementRepository, jwtService, new UserService(mock(UserRepository.class)))))
                .getReimbursements(" ABC123");
    }

    /**
     * Method under test: {@link ReimbursementController#getReimbursements(String)}
     */
    @Test
    void testGetReimbursements3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        ArrayList<Reimbursement> reimbursementList = new ArrayList<>();
        when(reimbursementRepository.findAllByUser(Mockito.<User>any())).thenReturn(reimbursementList);
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        List<Reimbursement> actualReimbursements = (new ReimbursementController(
                new ReimbursementService(reimbursementRepository, jwtService, new UserService(userRepository))))
                .getReimbursements(" ABC123");
        assertSame(reimbursementList, actualReimbursements);
        assertTrue(actualReimbursements.isEmpty());
        verify(reimbursementRepository).findAllByUser(Mockito.<User>any());
        verify(jwtService).extractUsername(Mockito.<String>any());
        verify(userRepository).findByEmail(Mockito.<String>any());
        verify(userRepository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link ReimbursementController#getReimbursements(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetReimbursements4() {
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
        //       at com.revature.Revature_ERS_Backend.service.UserService.getUserById(UserService.java:37)
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.getReimbursementsFromUser(ReimbursementService.java:52)
        //       at com.revature.Revature_ERS_Backend.controller.ReimbursementController.getReimbursements(ReimbursementController.java:43)
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findAllByUser(Mockito.<User>any())).thenReturn(new ArrayList<>());
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        (new ReimbursementController(
                new ReimbursementService(reimbursementRepository, jwtService, new UserService(userRepository))))
                .getReimbursements(" ABC123");
    }

    /**
     * Method under test: {@link ReimbursementController#getReimbursements(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetReimbursements5() {
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
        //       at com.revature.Revature_ERS_Backend.service.UserService.getUserId(UserService.java:32)
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.getReimbursementsFromUser(ReimbursementService.java:51)
        //       at com.revature.Revature_ERS_Backend.controller.ReimbursementController.getReimbursements(ReimbursementController.java:43)
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findAllByUser(Mockito.<User>any())).thenReturn(new ArrayList<>());
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.empty());
        (new ReimbursementController(
                new ReimbursementService(reimbursementRepository, jwtService, new UserService(userRepository))))
                .getReimbursements(" ABC123");
    }

    /**
     * Method under test: {@link ReimbursementController#getReimbursements(String)}
     */
    @Test
    void testGetReimbursements6() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        ArrayList<Reimbursement> reimbursementList = new ArrayList<>();
        when(reimbursementRepository.findAllByUser(Mockito.<User>any())).thenReturn(reimbursementList);
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserService userService = mock(UserService.class);
        when(userService.getUserById(Mockito.<Long>any())).thenReturn(new User());
        when(userService.getUserId(Mockito.<String>any())).thenReturn(1L);
        List<Reimbursement> actualReimbursements = (new ReimbursementController(
                new ReimbursementService(reimbursementRepository, jwtService, userService))).getReimbursements(" ABC123");
        assertSame(reimbursementList, actualReimbursements);
        assertTrue(actualReimbursements.isEmpty());
        verify(reimbursementRepository).findAllByUser(Mockito.<User>any());
        verify(jwtService).extractUsername(Mockito.<String>any());
        verify(userService).getUserById(Mockito.<Long>any());
        verify(userService).getUserId(Mockito.<String>any());
    }

    /**
     * Method under test: {@link ReimbursementController#getReimbursements(String)}
     */
    @Test
    void testGetReimbursements7() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementService reimbursementService = mock(ReimbursementService.class);
        ArrayList<Reimbursement> reimbursementList = new ArrayList<>();
        when(reimbursementService.getReimbursementsFromUser(Mockito.<String>any())).thenReturn(reimbursementList);
        List<Reimbursement> actualReimbursements = (new ReimbursementController(reimbursementService))
                .getReimbursements(" ABC123");
        assertSame(reimbursementList, actualReimbursements);
        assertTrue(actualReimbursements.isEmpty());
        verify(reimbursementService).getReimbursementsFromUser(Mockito.<String>any());
    }
}

