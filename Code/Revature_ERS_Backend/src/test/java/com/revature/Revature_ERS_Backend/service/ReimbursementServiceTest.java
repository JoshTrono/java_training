package com.revature.Revature_ERS_Backend.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.revature.Revature_ERS_Backend.entity.Reimbursement;
import com.revature.Revature_ERS_Backend.entity.Role;
import com.revature.Revature_ERS_Backend.entity.User;
import com.revature.Revature_ERS_Backend.repository.ReimbursementRepository;
import com.revature.Revature_ERS_Backend.repository.UserRepository;
import com.revature.Revature_ERS_Backend.security.JwtService;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ReimbursementService.class})
@ExtendWith(SpringExtension.class)
class ReimbursementServiceTest {
    @MockBean
    private JwtService jwtService;

    @MockBean
    private ReimbursementRepository reimbursementRepository;

    @Autowired
    private ReimbursementService reimbursementService;

    @MockBean
    private UserService userService;

    /**
     * Method under test: {@link ReimbursementService#getReimbursements()}
     */
    @Test
    void testGetReimbursements() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        ArrayList<Reimbursement> reimbursementList = new ArrayList<>();
        when(reimbursementRepository.findAll()).thenReturn(reimbursementList);
        JwtService jwtService = new JwtService();
        List<Reimbursement> actualReimbursements = (new ReimbursementService(reimbursementRepository, jwtService,
                new UserService(mock(UserRepository.class)))).getReimbursements();
        assertSame(reimbursementList, actualReimbursements);
        assertTrue(actualReimbursements.isEmpty());
        verify(reimbursementRepository).findAll();
    }

    /**
     * Method under test: {@link ReimbursementService#createReimbursement(int, String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreateReimbursement() {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        reimbursementService.createReimbursement(10, "The characteristics of someone or something", "ABC123");
    }

    /**
     * Method under test: {@link ReimbursementService#getReimbursementsFromUser(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetReimbursementsFromUser() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

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
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.getReimbursementsFromUser(ReimbursementService.java:51)
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        JwtService jwtService = new JwtService();
        (new ReimbursementService(reimbursementRepository, jwtService, new UserService(mock(UserRepository.class))))
                .getReimbursementsFromUser("ABC123");
    }

    /**
     * Method under test: {@link ReimbursementService#getReimbursementsFromUser(String)}
     */
    @Test
    void testGetReimbursementsFromUser2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        ArrayList<Reimbursement> reimbursementList = new ArrayList<>();
        when(reimbursementRepository.findAllByUser(Mockito.<User>any())).thenReturn(reimbursementList);
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        List<Reimbursement> actualReimbursementsFromUser = (new ReimbursementService(reimbursementRepository, jwtService,
                new UserService(userRepository))).getReimbursementsFromUser("ABC123");
        assertSame(reimbursementList, actualReimbursementsFromUser);
        assertTrue(actualReimbursementsFromUser.isEmpty());
        verify(reimbursementRepository).findAllByUser(Mockito.<User>any());
        verify(jwtService).extractUsername(Mockito.<String>any());
        verify(userRepository).findByEmail(Mockito.<String>any());
        verify(userRepository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link ReimbursementService#getReimbursementsFromUser(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetReimbursementsFromUser3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.util.Optional.orElseThrow(Optional.java:377)
        //       at com.revature.Revature_ERS_Backend.service.UserService.getUserById(UserService.java:37)
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.getReimbursementsFromUser(ReimbursementService.java:53)
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findAllByUser(Mockito.<User>any())).thenReturn(new ArrayList<>());
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        (new ReimbursementService(reimbursementRepository, jwtService, new UserService(userRepository)))
                .getReimbursementsFromUser("ABC123");
    }

    /**
     * Method under test: {@link ReimbursementService#getReimbursementsFromUser(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetReimbursementsFromUser4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.util.Optional.orElseThrow(Optional.java:377)
        //       at com.revature.Revature_ERS_Backend.service.UserService.getUserId(UserService.java:32)
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.getReimbursementsFromUser(ReimbursementService.java:52)
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findAllByUser(Mockito.<User>any())).thenReturn(new ArrayList<>());
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.empty());
        (new ReimbursementService(reimbursementRepository, jwtService, new UserService(userRepository)))
                .getReimbursementsFromUser("ABC123");
    }

    /**
     * Method under test: {@link ReimbursementService#getReimbursementsFromUser(String)}
     */
    @Test
    void testGetReimbursementsFromUser5() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        ArrayList<Reimbursement> reimbursementList = new ArrayList<>();
        when(reimbursementRepository.findAllByUser(Mockito.<User>any())).thenReturn(reimbursementList);
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserService userService = mock(UserService.class);
        when(userService.getUserById(Mockito.<Long>any())).thenReturn(new User());
        when(userService.getUserId(Mockito.<String>any())).thenReturn(1L);
        List<Reimbursement> actualReimbursementsFromUser = (new ReimbursementService(reimbursementRepository, jwtService,
                userService)).getReimbursementsFromUser("ABC123");
        assertSame(reimbursementList, actualReimbursementsFromUser);
        assertTrue(actualReimbursementsFromUser.isEmpty());
        verify(reimbursementRepository).findAllByUser(Mockito.<User>any());
        verify(jwtService).extractUsername(Mockito.<String>any());
        verify(userService).getUserById(Mockito.<Long>any());
        verify(userService).getUserId(Mockito.<String>any());
    }

    /**
     * Method under test: {@link ReimbursementService#updateReimbursement(Long, Reimbursement, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateReimbursement() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

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
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.updateReimbursement(ReimbursementService.java:58)
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        JwtService jwtService = new JwtService();
        ReimbursementService reimbursementService = new ReimbursementService(reimbursementRepository, jwtService,
                new UserService(mock(UserRepository.class)));
        reimbursementService.updateReimbursement(1L, new Reimbursement(), "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#updateReimbursement(Long, Reimbursement, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateReimbursement2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.revature.Revature_ERS_Backend.entity.User.getId()" because the return value of "com.revature.Revature_ERS_Backend.entity.Reimbursement.getUser()" is null
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.updateReimbursement(ReimbursementService.java:62)
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new Reimbursement()));
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        ReimbursementService reimbursementService = new ReimbursementService(reimbursementRepository, jwtService,
                new UserService(userRepository));
        reimbursementService.updateReimbursement(1L, new Reimbursement(), "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#updateReimbursement(Long, Reimbursement, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateReimbursement3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Long.equals(Object)" because the return value of "com.revature.Revature_ERS_Backend.entity.User.getId()" is null
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.updateReimbursement(ReimbursementService.java:62)
        //   See https://diff.blue/R013 to resolve this issue.

        Reimbursement reimbursement = new Reimbursement();
        reimbursement.setUser(new User());
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(reimbursement));
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        ReimbursementService reimbursementService = new ReimbursementService(reimbursementRepository, jwtService,
                new UserService(userRepository));
        reimbursementService.updateReimbursement(1L, new Reimbursement(), "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#updateReimbursement(Long, Reimbursement, String)}
     */
    @Test
    void testUpdateReimbursement4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        User user = new User();
        user.setId(1L);

        Reimbursement reimbursement = new Reimbursement();
        reimbursement.setUser(user);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(reimbursement));
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        ReimbursementService reimbursementService = new ReimbursementService(reimbursementRepository, jwtService,
                new UserService(userRepository));
        assertNull(reimbursementService.updateReimbursement(1L, new Reimbursement(), "foo"));
        verify(reimbursementRepository).findById(Mockito.<Long>any());
        verify(jwtService).extractUsername(Mockito.<String>any());
        verify(userRepository).findByEmail(Mockito.<String>any());
        verify(userRepository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link ReimbursementService#updateReimbursement(Long, Reimbursement, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateReimbursement5() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Long.equals(Object)" because the return value of "com.revature.Revature_ERS_Backend.entity.User.getId()" is null
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.updateReimbursement(ReimbursementService.java:62)
        //   See https://diff.blue/R013 to resolve this issue.

        User user = new User();
        user.setId(1L);
        Reimbursement reimbursement = mock(Reimbursement.class);
        when(reimbursement.getUser()).thenReturn(new User());
        doNothing().when(reimbursement).setUser(Mockito.<User>any());
        reimbursement.setUser(user);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(reimbursement));
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        ReimbursementService reimbursementService = new ReimbursementService(reimbursementRepository, jwtService,
                new UserService(userRepository));
        reimbursementService.updateReimbursement(1L, new Reimbursement(), "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#updateReimbursement(Long, Reimbursement, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateReimbursement6() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.util.Optional.orElseThrow(Optional.java:377)
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.updateReimbursement(ReimbursementService.java:61)
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        ReimbursementService reimbursementService = new ReimbursementService(reimbursementRepository, jwtService,
                new UserService(userRepository));
        reimbursementService.updateReimbursement(1L, new Reimbursement(), "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#updateReimbursement(Long, Reimbursement, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateReimbursement7() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.util.Optional.orElseThrow(Optional.java:377)
        //       at com.revature.Revature_ERS_Backend.service.UserService.getUserById(UserService.java:37)
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.updateReimbursement(ReimbursementService.java:60)
        //   See https://diff.blue/R013 to resolve this issue.

        User user = new User();
        user.setId(1L);
        Reimbursement reimbursement = mock(Reimbursement.class);
        when(reimbursement.getUser()).thenReturn(new User());
        doNothing().when(reimbursement).setUser(Mockito.<User>any());
        reimbursement.setUser(user);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(reimbursement));
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        ReimbursementService reimbursementService = new ReimbursementService(reimbursementRepository, jwtService,
                new UserService(userRepository));
        reimbursementService.updateReimbursement(1L, new Reimbursement(), "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#updateReimbursement(Long, Reimbursement, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateReimbursement8() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.util.Optional.orElseThrow(Optional.java:377)
        //       at com.revature.Revature_ERS_Backend.service.UserService.getUserId(UserService.java:32)
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.updateReimbursement(ReimbursementService.java:59)
        //   See https://diff.blue/R013 to resolve this issue.

        User user = new User();
        user.setId(1L);
        Reimbursement reimbursement = mock(Reimbursement.class);
        when(reimbursement.getUser()).thenReturn(new User());
        doNothing().when(reimbursement).setUser(Mockito.<User>any());
        reimbursement.setUser(user);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(reimbursement));
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.empty());
        ReimbursementService reimbursementService = new ReimbursementService(reimbursementRepository, jwtService,
                new UserService(userRepository));
        reimbursementService.updateReimbursement(1L, new Reimbursement(), "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#updateReimbursement(Long, Reimbursement, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateReimbursement9() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Long.equals(Object)" because the return value of "com.revature.Revature_ERS_Backend.entity.User.getId()" is null
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.updateReimbursement(ReimbursementService.java:62)
        //   See https://diff.blue/R013 to resolve this issue.

        User user = new User();
        user.setId(1L);
        Reimbursement reimbursement = mock(Reimbursement.class);
        when(reimbursement.getUser()).thenReturn(new User());
        doNothing().when(reimbursement).setUser(Mockito.<User>any());
        reimbursement.setUser(user);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(reimbursement));
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserService userService = mock(UserService.class);
        when(userService.getUserById(Mockito.<Long>any())).thenReturn(new User());
        when(userService.getUserId(Mockito.<String>any())).thenReturn(1L);
        ReimbursementService reimbursementService = new ReimbursementService(reimbursementRepository, jwtService,
                userService);
        reimbursementService.updateReimbursement(1L, new Reimbursement(), "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#updateReimbursement(Long, Reimbursement, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateReimbursement10() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.revature.Revature_ERS_Backend.entity.User.getId()" because "user" is null
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.updateReimbursement(ReimbursementService.java:62)
        //   See https://diff.blue/R013 to resolve this issue.

        User user = new User();
        user.setId(1L);
        Reimbursement reimbursement = mock(Reimbursement.class);
        when(reimbursement.getUser()).thenReturn(new User());
        doNothing().when(reimbursement).setUser(Mockito.<User>any());
        reimbursement.setUser(user);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(reimbursement));
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserService userService = mock(UserService.class);
        when(userService.getUserById(Mockito.<Long>any())).thenReturn(null);
        when(userService.getUserId(Mockito.<String>any())).thenReturn(1L);
        ReimbursementService reimbursementService = new ReimbursementService(reimbursementRepository, jwtService,
                userService);
        reimbursementService.updateReimbursement(1L, new Reimbursement(), "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#updateReimbursement(Long, Reimbursement, String)}
     */
    @Test
    void testUpdateReimbursement11() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        User user = new User();
        user.setId(1L);

        User user2 = new User();
        user2.setId(1L);
        Reimbursement reimbursement = mock(Reimbursement.class);
        when(reimbursement.getUser()).thenReturn(user2);
        doNothing().when(reimbursement).setUser(Mockito.<User>any());
        reimbursement.setUser(user);
        Optional<Reimbursement> ofResult = Optional.of(reimbursement);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        Reimbursement reimbursement2 = new Reimbursement();
        when(reimbursementRepository.save(Mockito.<Reimbursement>any())).thenReturn(reimbursement2);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(ofResult);
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserService userService = mock(UserService.class);
        when(userService.getUserById(Mockito.<Long>any()))
                .thenReturn(new User(1L, "jane.doe@example.org", "iloveyou", Role.USER));
        when(userService.getUserId(Mockito.<String>any())).thenReturn(1L);
        ReimbursementService reimbursementService = new ReimbursementService(reimbursementRepository, jwtService,
                userService);
        assertSame(reimbursement2, reimbursementService.updateReimbursement(1L, new Reimbursement(), "foo"));
        verify(reimbursementRepository).save(Mockito.<Reimbursement>any());
        verify(reimbursementRepository).findById(Mockito.<Long>any());
        verify(reimbursement).getUser();
        verify(reimbursement).setUser(Mockito.<User>any());
        verify(jwtService).extractUsername(Mockito.<String>any());
        verify(userService).getUserById(Mockito.<Long>any());
        verify(userService).getUserId(Mockito.<String>any());
    }

    /**
     * Method under test: {@link ReimbursementService#updateReimbursement(Long, Reimbursement, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateReimbursement12() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.revature.Revature_ERS_Backend.entity.Reimbursement.getAmount()" because "reimbursement" is null
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.updateReimbursement(ReimbursementService.java:63)
        //   See https://diff.blue/R013 to resolve this issue.

        User user = new User();
        user.setId(1L);

        User user2 = new User();
        user2.setId(1L);
        Reimbursement reimbursement = mock(Reimbursement.class);
        when(reimbursement.getUser()).thenReturn(user2);
        doNothing().when(reimbursement).setUser(Mockito.<User>any());
        reimbursement.setUser(user);
        Optional<Reimbursement> ofResult = Optional.of(reimbursement);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.save(Mockito.<Reimbursement>any())).thenReturn(new Reimbursement());
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(ofResult);
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserService userService = mock(UserService.class);
        when(userService.getUserById(Mockito.<Long>any()))
                .thenReturn(new User(1L, "jane.doe@example.org", "iloveyou", Role.USER));
        when(userService.getUserId(Mockito.<String>any())).thenReturn(1L);
        (new ReimbursementService(reimbursementRepository, jwtService, userService)).updateReimbursement(1L, null, "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#updateReimbursement(Long, Reimbursement, String)}
     */
    @Test
    void testUpdateReimbursement13() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        User user = new User();
        user.setId(1L);

        User user2 = new User();
        user2.setId(1L);
        Reimbursement reimbursement = mock(Reimbursement.class);
        doNothing().when(reimbursement).setAmount(anyInt());
        doNothing().when(reimbursement).setDescription(Mockito.<String>any());
        when(reimbursement.getUser()).thenReturn(user2);
        doNothing().when(reimbursement).setUser(Mockito.<User>any());
        reimbursement.setUser(user);
        Optional<Reimbursement> ofResult = Optional.of(reimbursement);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        Reimbursement reimbursement2 = new Reimbursement();
        when(reimbursementRepository.save(Mockito.<Reimbursement>any())).thenReturn(reimbursement2);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(ofResult);
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserService userService = mock(UserService.class);
        when(userService.getUserById(Mockito.<Long>any()))
                .thenReturn(new User(1L, "jane.doe@example.org", "iloveyou", Role.USER));
        when(userService.getUserId(Mockito.<String>any())).thenReturn(1L);
        ReimbursementService reimbursementService = new ReimbursementService(reimbursementRepository, jwtService,
                userService);
        assertSame(reimbursement2, reimbursementService.updateReimbursement(1L,
                new Reimbursement(1L, 10, "The characteristics of someone or something", "Status", new User()), "foo"));
        verify(reimbursementRepository).save(Mockito.<Reimbursement>any());
        verify(reimbursementRepository).findById(Mockito.<Long>any());
        verify(reimbursement).getUser();
        verify(reimbursement).setAmount(anyInt());
        verify(reimbursement).setDescription(Mockito.<String>any());
        verify(reimbursement).setUser(Mockito.<User>any());
        verify(jwtService).extractUsername(Mockito.<String>any());
        verify(userService).getUserById(Mockito.<Long>any());
        verify(userService).getUserId(Mockito.<String>any());
    }

    /**
     * Method under test: {@link ReimbursementService#updateReimbursement(Long, Reimbursement, String)}
     */
    @Test
    void testUpdateReimbursement14() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        User user = new User();
        user.setId(1L);

        User user2 = new User();
        user2.setId(1L);
        Reimbursement reimbursement = mock(Reimbursement.class);
        doNothing().when(reimbursement).setStatus(Mockito.<String>any());
        doNothing().when(reimbursement).setAmount(anyInt());
        doNothing().when(reimbursement).setDescription(Mockito.<String>any());
        when(reimbursement.getUser()).thenReturn(user2);
        doNothing().when(reimbursement).setUser(Mockito.<User>any());
        reimbursement.setUser(user);
        Optional<Reimbursement> ofResult = Optional.of(reimbursement);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        Reimbursement reimbursement2 = new Reimbursement();
        when(reimbursementRepository.save(Mockito.<Reimbursement>any())).thenReturn(reimbursement2);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(ofResult);
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserService userService = mock(UserService.class);
        when(userService.getUserById(Mockito.<Long>any()))
                .thenReturn(new User(1L, "jane.doe@example.org", "iloveyou", Role.USER));
        when(userService.getUserId(Mockito.<String>any())).thenReturn(1L);
        ReimbursementService reimbursementService = new ReimbursementService(reimbursementRepository, jwtService,
                userService);
        assertSame(reimbursement2, reimbursementService.updateReimbursement(1L,
                new Reimbursement(1L, 10, "The characteristics of someone or something", "Pending", new User()), "foo"));
        verify(reimbursementRepository).save(Mockito.<Reimbursement>any());
        verify(reimbursementRepository).findById(Mockito.<Long>any());
        verify(reimbursement).getUser();
        verify(reimbursement).setAmount(anyInt());
        verify(reimbursement).setDescription(Mockito.<String>any());
        verify(reimbursement).setStatus(Mockito.<String>any());
        verify(reimbursement).setUser(Mockito.<User>any());
        verify(jwtService).extractUsername(Mockito.<String>any());
        verify(userService).getUserById(Mockito.<Long>any());
        verify(userService).getUserId(Mockito.<String>any());
    }

    /**
     * Method under test: {@link ReimbursementService#updateReimbursement(Long, Reimbursement, String)}
     */
    @Test
    void testUpdateReimbursement15() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        User user = new User();
        user.setId(1L);

        User user2 = new User();
        user2.setId(1L);
        Reimbursement reimbursement = mock(Reimbursement.class);
        doNothing().when(reimbursement).setAmount(anyInt());
        doNothing().when(reimbursement).setDescription(Mockito.<String>any());
        when(reimbursement.getUser()).thenReturn(user2);
        doNothing().when(reimbursement).setUser(Mockito.<User>any());
        reimbursement.setUser(user);
        Optional<Reimbursement> ofResult = Optional.of(reimbursement);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        Reimbursement reimbursement2 = new Reimbursement();
        when(reimbursementRepository.save(Mockito.<Reimbursement>any())).thenReturn(reimbursement2);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(ofResult);
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserService userService = mock(UserService.class);
        when(userService.getUserById(Mockito.<Long>any()))
                .thenReturn(new User(1L, "jane.doe@example.org", "iloveyou", Role.USER));
        when(userService.getUserId(Mockito.<String>any())).thenReturn(1L);
        ReimbursementService reimbursementService = new ReimbursementService(reimbursementRepository, jwtService,
                userService);
        Reimbursement reimbursement3 = mock(Reimbursement.class);
        when(reimbursement3.getAmount()).thenReturn(10);
        when(reimbursement3.getDescription()).thenReturn("The characteristics of someone or something");
        when(reimbursement3.getStatus()).thenReturn("Status");
        assertSame(reimbursement2, reimbursementService.updateReimbursement(1L, reimbursement3, "foo"));
        verify(reimbursementRepository).save(Mockito.<Reimbursement>any());
        verify(reimbursementRepository).findById(Mockito.<Long>any());
        verify(reimbursement).getUser();
        verify(reimbursement).setAmount(anyInt());
        verify(reimbursement).setDescription(Mockito.<String>any());
        verify(reimbursement).setUser(Mockito.<User>any());
        verify(jwtService).extractUsername(Mockito.<String>any());
        verify(userService).getUserById(Mockito.<Long>any());
        verify(userService).getUserId(Mockito.<String>any());
        verify(reimbursement3, atLeast(1)).getAmount();
        verify(reimbursement3, atLeast(1)).getDescription();
        verify(reimbursement3, atLeast(1)).getStatus();
    }

    /**
     * Method under test: {@link ReimbursementService#deleteReimbursement(Long, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteReimbursement() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

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
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.deleteReimbursement(ReimbursementService.java:78)
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        JwtService jwtService = new JwtService();
        (new ReimbursementService(reimbursementRepository, jwtService, new UserService(mock(UserRepository.class))))
                .deleteReimbursement(1L, "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#deleteReimbursement(Long, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteReimbursement2() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.revature.Revature_ERS_Backend.entity.User.getId()" because the return value of "com.revature.Revature_ERS_Backend.entity.Reimbursement.getUser()" is null
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.deleteReimbursement(ReimbursementService.java:82)
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new Reimbursement()));
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        (new ReimbursementService(reimbursementRepository, jwtService, new UserService(userRepository)))
                .deleteReimbursement(1L, "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#deleteReimbursement(Long, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteReimbursement3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Long.equals(Object)" because the return value of "com.revature.Revature_ERS_Backend.entity.User.getId()" is null
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.deleteReimbursement(ReimbursementService.java:82)
        //   See https://diff.blue/R013 to resolve this issue.

        Reimbursement reimbursement = new Reimbursement();
        reimbursement.setUser(new User());
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(reimbursement));
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        (new ReimbursementService(reimbursementRepository, jwtService, new UserService(userRepository)))
                .deleteReimbursement(1L, "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#deleteReimbursement(Long, String)}
     */
    @Test
    void testDeleteReimbursement4() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        User user = new User();
        user.setId(1L);

        Reimbursement reimbursement = new Reimbursement();
        reimbursement.setUser(user);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(reimbursement));
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        ResponseEntity actualDeleteReimbursementResult = (new ReimbursementService(reimbursementRepository, jwtService,
                new UserService(userRepository))).deleteReimbursement(1L, "foo");
        assertNull(actualDeleteReimbursementResult.getBody());
        assertEquals(400, actualDeleteReimbursementResult.getStatusCodeValue());
        assertTrue(actualDeleteReimbursementResult.getHeaders().isEmpty());
        verify(reimbursementRepository).findById(Mockito.<Long>any());
        verify(jwtService).extractUsername(Mockito.<String>any());
        verify(userRepository).findByEmail(Mockito.<String>any());
        verify(userRepository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link ReimbursementService#deleteReimbursement(Long, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteReimbursement5() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Long.equals(Object)" because the return value of "com.revature.Revature_ERS_Backend.entity.User.getId()" is null
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.deleteReimbursement(ReimbursementService.java:82)
        //   See https://diff.blue/R013 to resolve this issue.

        User user = new User();
        user.setId(1L);
        Reimbursement reimbursement = mock(Reimbursement.class);
        when(reimbursement.getUser()).thenReturn(new User());
        doNothing().when(reimbursement).setUser(Mockito.<User>any());
        reimbursement.setUser(user);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(reimbursement));
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        (new ReimbursementService(reimbursementRepository, jwtService, new UserService(userRepository)))
                .deleteReimbursement(1L, "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#deleteReimbursement(Long, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteReimbursement6() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.util.Optional.orElseThrow(Optional.java:377)
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.deleteReimbursement(ReimbursementService.java:81)
        //   See https://diff.blue/R013 to resolve this issue.

        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        (new ReimbursementService(reimbursementRepository, jwtService, new UserService(userRepository)))
                .deleteReimbursement(1L, "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#deleteReimbursement(Long, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteReimbursement7() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.util.Optional.orElseThrow(Optional.java:377)
        //       at com.revature.Revature_ERS_Backend.service.UserService.getUserById(UserService.java:37)
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.deleteReimbursement(ReimbursementService.java:80)
        //   See https://diff.blue/R013 to resolve this issue.

        User user = new User();
        user.setId(1L);
        Reimbursement reimbursement = mock(Reimbursement.class);
        when(reimbursement.getUser()).thenReturn(new User());
        doNothing().when(reimbursement).setUser(Mockito.<User>any());
        reimbursement.setUser(user);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(reimbursement));
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        (new ReimbursementService(reimbursementRepository, jwtService, new UserService(userRepository)))
                .deleteReimbursement(1L, "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#deleteReimbursement(Long, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteReimbursement8() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.util.NoSuchElementException: No value present
        //       at java.util.Optional.orElseThrow(Optional.java:377)
        //       at com.revature.Revature_ERS_Backend.service.UserService.getUserId(UserService.java:32)
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.deleteReimbursement(ReimbursementService.java:79)
        //   See https://diff.blue/R013 to resolve this issue.

        User user = new User();
        user.setId(1L);
        Reimbursement reimbursement = mock(Reimbursement.class);
        when(reimbursement.getUser()).thenReturn(new User());
        doNothing().when(reimbursement).setUser(Mockito.<User>any());
        reimbursement.setUser(user);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(reimbursement));
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.empty());
        (new ReimbursementService(reimbursementRepository, jwtService, new UserService(userRepository)))
                .deleteReimbursement(1L, "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#deleteReimbursement(Long, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteReimbursement9() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.lang.Long.equals(Object)" because the return value of "com.revature.Revature_ERS_Backend.entity.User.getId()" is null
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.deleteReimbursement(ReimbursementService.java:82)
        //   See https://diff.blue/R013 to resolve this issue.

        User user = new User();
        user.setId(1L);
        Reimbursement reimbursement = mock(Reimbursement.class);
        when(reimbursement.getUser()).thenReturn(new User());
        doNothing().when(reimbursement).setUser(Mockito.<User>any());
        reimbursement.setUser(user);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(reimbursement));
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserService userService = mock(UserService.class);
        when(userService.getUserById(Mockito.<Long>any())).thenReturn(new User());
        when(userService.getUserId(Mockito.<String>any())).thenReturn(1L);
        (new ReimbursementService(reimbursementRepository, jwtService, userService)).deleteReimbursement(1L, "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#deleteReimbursement(Long, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteReimbursement10() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.revature.Revature_ERS_Backend.entity.User.getId()" because "user" is null
        //       at com.revature.Revature_ERS_Backend.service.ReimbursementService.deleteReimbursement(ReimbursementService.java:82)
        //   See https://diff.blue/R013 to resolve this issue.

        User user = new User();
        user.setId(1L);
        Reimbursement reimbursement = mock(Reimbursement.class);
        when(reimbursement.getUser()).thenReturn(new User());
        doNothing().when(reimbursement).setUser(Mockito.<User>any());
        reimbursement.setUser(user);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(reimbursement));
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserService userService = mock(UserService.class);
        when(userService.getUserById(Mockito.<Long>any())).thenReturn(null);
        when(userService.getUserId(Mockito.<String>any())).thenReturn(1L);
        (new ReimbursementService(reimbursementRepository, jwtService, userService)).deleteReimbursement(1L, "foo");
    }

    /**
     * Method under test: {@link ReimbursementService#deleteReimbursement(Long, String)}
     */
    @Test
    void testDeleteReimbursement11() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   com.diffblue.fuzztest.shared.proxy.BeanInstantiationException: Could not instantiate bean: class org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not load CacheAwareContextLoaderDelegate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:104)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:224)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.NoClassDefFoundError: org/springframework/core/io/support/SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.ClassNotFoundException: org.springframework.core.io.support.SpringFactoriesLoader$FailureHandler
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:70)
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.<init>(DefaultCacheAwareContextLoaderDelegate.java:86)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:198)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:153)
        //       at org.springframework.beans.BeanUtils.instantiateClass(BeanUtils.java:172)
        //       at org.springframework.test.context.BootstrapUtils.createCacheAwareContextLoaderDelegate(BootstrapUtils.java:101)
        //       at org.springframework.test.context.BootstrapUtils.createBootstrapContext(BootstrapUtils.java:77)
        //       at org.springframework.test.context.BootstrapUtils.resolveTestContextBootstrapper(BootstrapUtils.java:126)
        //       at org.springframework.test.context.TestContextManager.<init>(TestContextManager.java:113)
        //       at java.util.Optional.map(Optional.java:260)
        //   See https://diff.blue/R026 to resolve this issue.

        User user = new User();
        user.setId(1L);

        User user2 = new User();
        user2.setId(1L);
        Reimbursement reimbursement = mock(Reimbursement.class);
        when(reimbursement.getUser()).thenReturn(user2);
        doNothing().when(reimbursement).setUser(Mockito.<User>any());
        reimbursement.setUser(user);
        Optional<Reimbursement> ofResult = Optional.of(reimbursement);
        ReimbursementRepository reimbursementRepository = mock(ReimbursementRepository.class);
        doNothing().when(reimbursementRepository).delete(Mockito.<Reimbursement>any());
        when(reimbursementRepository.findById(Mockito.<Long>any())).thenReturn(ofResult);
        JwtService jwtService = mock(JwtService.class);
        when(jwtService.extractUsername(Mockito.<String>any())).thenReturn("janedoe");
        UserService userService = mock(UserService.class);
        when(userService.getUserById(Mockito.<Long>any()))
                .thenReturn(new User(1L, "jane.doe@example.org", "iloveyou", Role.USER));
        when(userService.getUserId(Mockito.<String>any())).thenReturn(1L);
        ResponseEntity actualDeleteReimbursementResult = (new ReimbursementService(reimbursementRepository, jwtService,
                userService)).deleteReimbursement(1L, "foo");
        assertNull(actualDeleteReimbursementResult.getBody());
        assertEquals(200, actualDeleteReimbursementResult.getStatusCodeValue());
        assertTrue(actualDeleteReimbursementResult.getHeaders().isEmpty());
        verify(reimbursementRepository).findById(Mockito.<Long>any());
        verify(reimbursementRepository).delete(Mockito.<Reimbursement>any());
        verify(reimbursement).getUser();
        verify(reimbursement).setUser(Mockito.<User>any());
        verify(jwtService).extractUsername(Mockito.<String>any());
        verify(userService).getUserById(Mockito.<Long>any());
        verify(userService).getUserId(Mockito.<String>any());
    }
}

