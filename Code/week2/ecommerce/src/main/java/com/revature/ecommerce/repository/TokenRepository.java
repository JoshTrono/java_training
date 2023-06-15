package com.revature.ecommerce.repository;

import com.revature.ecommerce.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {
    Token findByUserId(Long id);


}
