package com.revature.Revature_ERS_Backend.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.revature.Revature_ERS_Backend.entity.User;
import com.revature.Revature_ERS_Backend.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

class UserServiceTest {
    /**
     * Method under test: {@link UserService#updateUser(Long)}
     */
    @Test
    void testUpdateUser() {
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
        when(userRepository.save(Mockito.<User>any())).thenReturn(new User());
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(new User()));
        ResponseEntity actualUpdateUserResult = (new UserService(userRepository)).updateUser(1L);
        assertEquals("User updated", actualUpdateUserResult.getBody());
        assertEquals(200, actualUpdateUserResult.getStatusCodeValue());
        assertTrue(actualUpdateUserResult.getHeaders().isEmpty());
        verify(userRepository).save(Mockito.<User>any());
        verify(userRepository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link UserService#updateUser(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateUser2() {
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
        //       at com.revature.Revature_ERS_Backend.service.UserService.updateUser(UserService.java:20)
        //   See https://diff.blue/R013 to resolve this issue.

        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.save(Mockito.<User>any())).thenReturn(new User());
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        (new UserService(userRepository)).updateUser(1L);
    }

    /**
     * Method under test: {@link UserService#getUsers()}
     */
    @Test
    void testGetUsers() {
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
        ArrayList<User> userList = new ArrayList<>();
        when(userRepository.findAll()).thenReturn(userList);
        List<User> actualUsers = (new UserService(userRepository)).getUsers();
        assertSame(userList, actualUsers);
        assertTrue(actualUsers.isEmpty());
        verify(userRepository).findAll();
    }

    /**
     * Method under test: {@link UserService#getUserId(String)}
     */
    @Test
    void testGetUserId() {
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
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.of(new User()));
        assertNull((new UserService(userRepository)).getUserId("janedoe"));
        verify(userRepository).findByEmail(Mockito.<String>any());
    }

    /**
     * Method under test: {@link UserService#getUserId(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUserId2() {
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
        //   See https://diff.blue/R013 to resolve this issue.

        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findByEmail(Mockito.<String>any())).thenReturn(Optional.empty());
        (new UserService(userRepository)).getUserId("janedoe");
    }

    /**
     * Method under test: {@link UserService#getUserById(Long)}
     */
    @Test
    void testGetUserById() {
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
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.of(user));
        assertSame(user, (new UserService(userRepository)).getUserById(1L));
        verify(userRepository).findById(Mockito.<Long>any());
    }

    /**
     * Method under test: {@link UserService#getUserById(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetUserById2() {
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
        //   See https://diff.blue/R013 to resolve this issue.

        UserRepository userRepository = mock(UserRepository.class);
        when(userRepository.findById(Mockito.<Long>any())).thenReturn(Optional.empty());
        (new UserService(userRepository)).getUserById(1L);
    }
}

