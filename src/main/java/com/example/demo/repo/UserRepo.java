package com.example.demo.repo;


import com.example.demo.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//jpaRepository use to my sql data type
@Repository //assign that repository
public interface UserRepo extends JpaRepository<UserEntity,Integer> {
    boolean existsByEmail(String email);
}
