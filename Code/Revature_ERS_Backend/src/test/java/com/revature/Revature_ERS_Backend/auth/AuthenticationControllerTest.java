package com.revature.Revature_ERS_Backend.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.revature.Revature_ERS_Backend.entity.User;
import com.revature.Revature_ERS_Backend.repository.UserRepository;
import com.revature.Revature_ERS_Backend.security.JwtService;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.intercept.RunAsImplAuthenticationProvider;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {AuthenticationController.class})
@ExtendWith(SpringExtension.class)
class AuthenticationControllerTest {
    @Autowired
    private AuthenticationController authenticationController;

    /**
     * Method under test: {@link AuthenticationController#register(AuthenticationRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRegister() {
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
        //   java.lang.IllegalArgumentException: A parent AuthenticationManager or a list of AuthenticationProviders is required
        //   See https://diff.blue/R013 to resolve this issue.

        UserRepository userRepository = mock(UserRepository.class);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        JwtService jwtService = new JwtService();
        AuthenticationController authenticationController = new AuthenticationController(
                new AuthenticationService(userRepository, passwordEncoder, jwtService, new ProviderManager(new ArrayList<>())));
        authenticationController.register(new AuthenticationRequest("jane.doe@example.org", "iloveyou"));
    }

    /**
     * Method under test: {@link AuthenticationController#register(AuthenticationRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRegister2() {
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
        //   org.springframework.security.authentication.ProviderNotFoundException: No AuthenticationProvider found for org.springframework.security.authentication.UsernamePasswordAuthenticationToken
        //       at com.revature.Revature_ERS_Backend.auth.AuthenticationService.authenticate(AuthenticationService.java:43)
        //       at com.revature.Revature_ERS_Backend.auth.AuthenticationController.register(AuthenticationController.java:25)
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<AuthenticationProvider> providers = new ArrayList<>();
        providers.add(new RunAsImplAuthenticationProvider());
        ProviderManager authenticationManager = new ProviderManager(providers);
        UserRepository userRepository = mock(UserRepository.class);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        AuthenticationController authenticationController = new AuthenticationController(
                new AuthenticationService(userRepository, passwordEncoder, new JwtService(), authenticationManager));
        authenticationController.register(new AuthenticationRequest("jane.doe@example.org", "iloveyou"));
    }

    /**
     * Method under test: {@link AuthenticationController#register(AuthenticationRequest)}
     */
    @Test
    void testRegister3() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        AuthenticationService authenticationService = mock(AuthenticationService.class);
        when(authenticationService.authenticate(Mockito.<AuthenticationRequest>any()))
                .thenReturn(new AuthenticationResponse("ABC123"));
        AuthenticationController authenticationController = new AuthenticationController(authenticationService);
        ResponseEntity<AuthenticationResponse> actualRegisterResult = authenticationController
                .register(new AuthenticationRequest("jane.doe@example.org", "iloveyou"));
        assertTrue(actualRegisterResult.hasBody());
        assertTrue(actualRegisterResult.getHeaders().isEmpty());
        assertEquals(200, actualRegisterResult.getStatusCodeValue());
        verify(authenticationService).authenticate(Mockito.<AuthenticationRequest>any());
    }

    /**
     * Method under test: {@link AuthenticationController#register(RegisterRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRegister4() {
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
        //   java.lang.IllegalArgumentException: A parent AuthenticationManager or a list of AuthenticationProviders is required
        //   See https://diff.blue/R013 to resolve this issue.

        UserRepository userRepository = mock(UserRepository.class);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        JwtService jwtService = new JwtService();
        AuthenticationController authenticationController = new AuthenticationController(new AuthenticationService(
                userRepository, passwordEncoder, jwtService, new ProviderManager(new ArrayList<>())));
        authenticationController.register(new RegisterRequest("jane.doe@example.org", "iloveyou"));
    }

    /**
     * Method under test: {@link AuthenticationController#register(RegisterRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRegister5() {
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
        //   com.revature.Revature_ERS_Backend.auth.UserAlreadyExistsException: User already exists
        //       at com.revature.Revature_ERS_Backend.auth.AuthenticationService.lambda$register$0(AuthenticationService.java:28)
        //       at java.util.Optional.ifPresent(Optional.java:178)
        //       at com.revature.Revature_ERS_Backend.auth.AuthenticationService.register(AuthenticationService.java:27)
        //       at com.revature.Revature_ERS_Backend.auth.AuthenticationController.register(AuthenticationController.java:20)
        //   See https://diff.blue/R013 to resolve this issue.

        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.save(Mockito.<User>any())).thenReturn(new User());
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));

        ArrayList<AuthenticationProvider> providers = new ArrayList<>();
        providers.add(new RunAsImplAuthenticationProvider());
        ProviderManager authenticationManager = new ProviderManager(providers);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        AuthenticationController authenticationController = new AuthenticationController(
                new AuthenticationService(userRepository, passwordEncoder, new JwtService(), authenticationManager));
        authenticationController.register(new RegisterRequest("jane.doe@example.org", "iloveyou"));
    }

    /**
     * Method under test: {@link AuthenticationController#register(RegisterRequest)}
     */
    @Test
    void testRegister6() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.save(Mockito.<User>any())).thenReturn(new User());
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.empty());

        ArrayList<AuthenticationProvider> providers = new ArrayList<>();
        providers.add(new RunAsImplAuthenticationProvider());
        ProviderManager authenticationManager = new ProviderManager(providers);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        AuthenticationController authenticationController = new AuthenticationController(
                new AuthenticationService(userRepository, passwordEncoder, new JwtService(), authenticationManager));
        ResponseEntity<AuthenticationResponse> actualRegisterResult = authenticationController
                .register(new RegisterRequest("jane.doe@example.org", "iloveyou"));
        assertTrue(actualRegisterResult.hasBody());
        assertTrue(actualRegisterResult.getHeaders().isEmpty());
        assertEquals(200, actualRegisterResult.getStatusCodeValue());
        verify(userRepository).save(Mockito.<User>any());
        verify(userRepository).findByEmail(Mockito.<String>any());
    }

    /**
     * Method under test: {@link AuthenticationController#register(RegisterRequest)}
     */
    @Test
    void testRegister7() {
        //   Diffblue Cover was unable to write a Spring test,
        //   so wrote a non-Spring test instead.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "Object.getClass()" because "bean" is null
        //   See https://diff.blue/R013 to resolve this issue.

        AuthenticationService authenticationService = mock(AuthenticationService.class);
        when(authenticationService.register(Mockito.<RegisterRequest>any()))
                .thenReturn(new AuthenticationResponse("ABC123"));
        AuthenticationController authenticationController = new AuthenticationController(authenticationService);
        ResponseEntity<AuthenticationResponse> actualRegisterResult = authenticationController
                .register(new RegisterRequest("jane.doe@example.org", "iloveyou"));
        assertTrue(actualRegisterResult.hasBody());
        assertTrue(actualRegisterResult.getHeaders().isEmpty());
        assertEquals(200, actualRegisterResult.getStatusCodeValue());
        verify(authenticationService).register(Mockito.<RegisterRequest>any());
    }

    /**
     * Method under test: {@link AuthenticationController#handleUserAlreadyExistsException(UserAlreadyExistsException)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testHandleUserAlreadyExistsException() {
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
        //   java.lang.IllegalArgumentException: A parent AuthenticationManager or a list of AuthenticationProviders is required
        //   See https://diff.blue/R013 to resolve this issue.

        UserRepository userRepository = mock(UserRepository.class);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        JwtService jwtService = new JwtService();
        AuthenticationController authenticationController = new AuthenticationController(new AuthenticationService(
                userRepository, passwordEncoder, jwtService, new ProviderManager(new ArrayList<>())));
        authenticationController.handleUserAlreadyExistsException(new UserAlreadyExistsException("An error occurred"));
    }

    /**
     * Method under test: {@link AuthenticationController#handleUserAlreadyExistsException(UserAlreadyExistsException)}
     */
    @Test
    void testHandleUserAlreadyExistsException2() {
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

        ArrayList<AuthenticationProvider> providers = new ArrayList<>();
        providers.add(new RunAsImplAuthenticationProvider());
        ProviderManager authenticationManager = new ProviderManager(providers);
        UserRepository userRepository = mock(UserRepository.class);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        AuthenticationController authenticationController = new AuthenticationController(
                new AuthenticationService(userRepository, passwordEncoder, new JwtService(), authenticationManager));
        ResponseEntity<String> actualHandleUserAlreadyExistsExceptionResult = authenticationController
                .handleUserAlreadyExistsException(new UserAlreadyExistsException("An error occurred"));
        assertEquals("An error occurred", actualHandleUserAlreadyExistsExceptionResult.getBody());
        assertEquals(400, actualHandleUserAlreadyExistsExceptionResult.getStatusCodeValue());
        assertTrue(actualHandleUserAlreadyExistsExceptionResult.getHeaders().isEmpty());
    }

    /**
     * Method under test: {@link AuthenticationController#handleUserAlreadyExistsException(UserAlreadyExistsException)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testHandleUserAlreadyExistsException3() {
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
        //   java.lang.NullPointerException: Cannot invoke "com.revature.Revature_ERS_Backend.auth.UserAlreadyExistsException.getMessage()" because "e" is null
        //       at com.revature.Revature_ERS_Backend.auth.AuthenticationController.handleUserAlreadyExistsException(AuthenticationController.java:30)
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<AuthenticationProvider> providers = new ArrayList<>();
        providers.add(new RunAsImplAuthenticationProvider());
        ProviderManager authenticationManager = new ProviderManager(providers);
        UserRepository userRepository = mock(UserRepository.class);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        (new AuthenticationController(
                new AuthenticationService(userRepository, passwordEncoder, new JwtService(), authenticationManager)))
                .handleUserAlreadyExistsException(null);
    }

    /**
     * Method under test: {@link AuthenticationController#handleUserAlreadyExistsException(UserAlreadyExistsException)}
     */
    @Test
    void testHandleUserAlreadyExistsException4() {
        // Arrange
        // TODO: Populate arranged inputs
        UserAlreadyExistsException e = null;

        // Act
        ResponseEntity<String> actualHandleUserAlreadyExistsExceptionResult = this.authenticationController
                .handleUserAlreadyExistsException(e);

        // Assert
        // TODO: Add assertions on result
    }
}

