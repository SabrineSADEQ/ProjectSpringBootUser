package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.EntityUser;

@Repository
public interface DaoUser extends JpaRepository<EntityUser, Long> {
    
}
