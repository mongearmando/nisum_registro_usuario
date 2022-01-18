package com.nisum.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nisum.springboot.model.User;
import com.nisum.springboot.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User findByEmail(String email) {
        return repository.findByEmail(email);
    }
    
    public User findByName(String name) {
        return repository.findByName(name);
    }
    
    public User get(String userId) {
        return repository.findById(userId);
    }

    public List<User> list() {
        Iterable<User> users = repository.findAll();
        List<User> list = new ArrayList<User>();
        users.forEach(list::add);
        return list;
    }

    public User create(User user) {
        return repository.save(user);
    }
}
