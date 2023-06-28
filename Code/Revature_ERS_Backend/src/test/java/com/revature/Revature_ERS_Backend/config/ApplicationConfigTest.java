package com.revature.Revature_ERS_Backend.config;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.revature.Revature_ERS_Backend.entity.User;
import com.revature.Revature_ERS_Backend.repository.UserRepository;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.cache.NullUserCache;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ApplicationConfig.class})
@ExtendWith(SpringExtension.class)
class ApplicationConfigTest {
    @Autowired
    private ApplicationConfig applicationConfig;

    @MockBean
    private UserRepository userRepository;

    /**
     * Method under test: {@link ApplicationConfig#userDetailsService()}
     */
    @Test
    void testUserDetailsService() throws UsernameNotFoundException {
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

        UserRepository userRepository = mock(UserRepository.class);
        User user = new User();
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(user));
        UserDetails actualLoadUserByUsernameResult = (new ApplicationConfig(userRepository)).userDetailsService()
                .loadUserByUsername("janedoe");
        verify(userRepository).findByEmail(Mockito.<String>any());
        assertSame(user, actualLoadUserByUsernameResult);
    }

    /**
     * Method under test: {@link ApplicationConfig#userDetailsService()}
     */
    @Test
    void testUserDetailsService2() throws UsernameNotFoundException {
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

        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.empty());
        assertThrows(UsernameNotFoundException.class,
                () -> (new ApplicationConfig(userRepository)).userDetailsService().loadUserByUsername("janedoe"));
        verify(userRepository).findByEmail(Mockito.<String>any());
    }

    /**
     * Method under test: {@link ApplicationConfig#userDetailsService()}
     */
    @Test
    void testUserDetailsService3() throws UsernameNotFoundException {
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

        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findByEmail(Mockito.<String>any()))
                .thenThrow(new UsernameNotFoundException("User not found"));
        assertThrows(UsernameNotFoundException.class,
                () -> (new ApplicationConfig(userRepository)).userDetailsService().loadUserByUsername("janedoe"));
        verify(userRepository).findByEmail(Mockito.<String>any());
    }

    /**
     * Method under test: {@link ApplicationConfig#authenticationProvider()}
     */
    @Test
    void testAuthenticationProvider() {
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

        assertTrue(
                ((DaoAuthenticationProvider) (new ApplicationConfig(mock(UserRepository.class))).authenticationProvider())
                        .getUserCache() instanceof NullUserCache);
        assertTrue(
                ((DaoAuthenticationProvider) (new ApplicationConfig(mock(UserRepository.class))).authenticationProvider())
                        .isHideUserNotFoundExceptions());
        assertFalse(
                ((DaoAuthenticationProvider) (new ApplicationConfig(mock(UserRepository.class))).authenticationProvider())
                        .isForcePrincipalAsString());
    }

    /**
     * Method under test: {@link ApplicationConfig#authenticationManager(AuthenticationConfiguration)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAuthenticationManager() throws Exception {
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

        applicationConfig.authenticationManager(new AuthenticationConfiguration());
    }

    /**
     * Method under test: {@link ApplicationConfig#passwordEncoder()}
     */
    @Test
    void testPasswordEncoder() {
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

        assertTrue(
                (new ApplicationConfig(mock(UserRepository.class))).passwordEncoder() instanceof BCryptPasswordEncoder);
    }
}

