package com.example.springbootmapstruct.repository;

import com.example.springbootmapstruct.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}
