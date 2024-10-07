package com.example.crud.repository;

import com.example.crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
//    tim trung username
    boolean existsByUsername(String username);
    Optional<User> findByUsername(String username); // co the ko tim thay -> tra ve rong
}
