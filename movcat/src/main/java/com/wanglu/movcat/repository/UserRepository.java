package com.wanglu.movcat.repository;

import com.wanglu.movcat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer>{

    User findByTelOrEmail(String tel, String email);

    User findByPasswordAndTelOrEmail(String password, String tel, String email);

    @Modifying
    @Query(value = "INSERT INTO user (tel, name, password) VALUES (?1, ?2, ?3)", nativeQuery = true)
    int saveTelUser(String tel, String name, String password);

}
