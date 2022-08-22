package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    List<User> users = Arrays.asList(new User(310182L, "Rudraksh", "7678646018"),
            new User(310186L, "Ramdev", "7678646019"),
            new User(310185L, "Shishupal", "7678646020"));

    @Override
    public User getUser(Long userId) {
        return this.users.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
    }
}
