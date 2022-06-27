package com.example.springbootmapstruct.service;

import com.example.springbootmapstruct.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    List<User> findAll();

    Optional<User> findById( Long id) ;

    User save (User user);

    void deleteUser(Long id);

}
