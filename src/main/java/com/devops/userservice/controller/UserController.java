package com.devops.userservice.controller;
// Spring annotations
import org.springframework.web.bind.annotation.*;

// Your own classes
import com.devops.userservice.entity.User;
import com.devops.userservice.service.UserService;
import com.devops.userservice.controller.UserController;

// Java standard library
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @GetMapping("/all")
    public List<User> getUsers() {
        return service.getAllUsers();
    }

    @GetMapping("update/{id}")
    public User getUser(@PathVariable Long id) {
        return service.getUserById(id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
    }
}





