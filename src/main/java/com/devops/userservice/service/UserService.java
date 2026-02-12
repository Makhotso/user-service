package com.devops.userservice.service;

import com.devops.userservice.entity.User;       // Class name must be User
import com.devops.userservice.repository.UserRepository;  // Import your repository
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    // Constructor injection
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    // Create a user
    public User createUser(User user) {
        return repository.save(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    // Get user by id
    public User getUserById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}


