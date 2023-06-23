package com.revature.Revature_ERS_Backend.security;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.revature.Revature_ERS_Backend.entity.User;
import io.jsonwebtoken.Claims;

import java.util.HashMap;
import java.util.Map;

import java.util.function.Function;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {JwtService.class})
@ExtendWith(SpringExtension.class)
class JwtServiceTest {
    @Autowired
    private JwtService jwtService;

    /**
     * Method under test: {@link JwtService#extractUsername(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExtractUsername() {
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

        jwtService.extractUsername("Jwt");
    }

    /**
     * Method under test: {@link JwtService#generateToken(User)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGenerateToken() {
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
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        JwtService jwtService = new JwtService();
        jwtService.generateToken(new User());
    }

    /**
     * Method under test: {@link JwtService#generateToken(User)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGenerateToken2() {
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
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        JwtService jwtService = new JwtService();

        User userDetails = new User();
        userDetails.setEmail("jane.doe@example.org");
        jwtService.generateToken(userDetails);
    }

    /**
     * Method under test: {@link JwtService#generateToken(User)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGenerateToken3() {
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
        //   java.lang.NullPointerException: Cannot invoke "com.revature.Revature_ERS_Backend.entity.User.getUsername()" because "userDetails" is null
        //       at com.revature.Revature_ERS_Backend.security.JwtService.generateToken(JwtService.java:38)
        //       at com.revature.Revature_ERS_Backend.security.JwtService.generateToken(JwtService.java:27)
        //   See https://diff.blue/R013 to resolve this issue.

        (new JwtService()).generateToken(null);
    }

    /**
     * Method under test: {@link JwtService#generateToken(User)}
     */
    @Test
    void testGenerateToken4() {
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

        JwtService jwtService = new JwtService();
        User userDetails = mock(User.class);
        when(userDetails.getUsername()).thenReturn("janedoe");
        jwtService.generateToken(userDetails);
        verify(userDetails).getUsername();
    }

    /**
     * Method under test: {@link JwtService#generateToken(Map, User)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGenerateToken5() {
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
        //   Reason: R031 Method may be time-sensitive.
        //   Diffblue Cover was only able to write tests which were time-sensitive.
        //   The assertions no longer passed when run at an alternate date, time and
        //   timezone. Try refactoring the method to take a java.time.Clock instance so
        //   that the time can be parameterized during testing.
        //   Please see https://diff.blue/R031

        JwtService jwtService = new JwtService();
        HashMap<String, Object> extractClaims = new HashMap<>();
        jwtService.generateToken(extractClaims, new User());
    }

    /**
     * Method under test: {@link JwtService#generateToken(Map, User)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGenerateToken6() {
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
        //   java.lang.NullPointerException: Cannot invoke "com.revature.Revature_ERS_Backend.entity.User.getUsername()" because "userDetails" is null
        //       at com.revature.Revature_ERS_Backend.security.JwtService.generateToken(JwtService.java:38)
        //   See https://diff.blue/R013 to resolve this issue.

        JwtService jwtService = new JwtService();
        jwtService.generateToken(new HashMap<>(), null);
    }

    /**
     * Method under test: {@link JwtService#generateToken(Map, User)}
     */
    @Test
    void testGenerateToken7() {
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

        JwtService jwtService = new JwtService();
        HashMap<String, Object> extractClaims = new HashMap<>();
        User userDetails = mock(User.class);
        when(userDetails.getUsername()).thenReturn("janedoe");
        jwtService.generateToken(extractClaims, userDetails);
        verify(userDetails).getUsername();
    }

    /**
     * Method under test: {@link JwtService#isTokenValid(String, UserDetails)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testIsTokenValid() {
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

        jwtService.isTokenValid("Jwt", new User());
    }

    /**
     * Method under test: {@link JwtService#extractClaim(String, Function)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExtractClaim() {
        // TODO: Complete this test.
        //   Reason: R005 Unable to load class.
        //   Class: reactor.netty.http.server.HttpServer
        //   Please check that the class is available on your test runtime classpath.
        //   See https://diff.blue/R005 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        String jwt = "";
        Function<Claims, Object> claimsResolver = null;

        // Act
        Object actualExtractClaimResult = this.jwtService.extractClaim(jwt, claimsResolver);

        // Assert
        // TODO: Add assertions on result
    }
}

