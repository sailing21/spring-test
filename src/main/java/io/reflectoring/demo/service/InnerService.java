package io.reflectoring.demo.service;

import io.reflectoring.demo.model.User;
import io.reflectoring.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InnerService {

    @Autowired
    private UserRepository userRepository;

    public String getMessage(int a) {
        User user = new User("Test User " + a);
        userRepository.save(user);
        return "Saved user: " + user.getName();
    }
}
