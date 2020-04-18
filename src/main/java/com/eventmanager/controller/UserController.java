package com.eventmanager.controller;

import com.eventmanager.data.UserData;
import com.eventmanager.mapper.UserMapper;
import com.eventmanager.model.Event;
import com.eventmanager.model.User;
import com.eventmanager.repository.EventRepository;
import com.eventmanager.repository.UserRepository;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private UserMapper userMapper;

    @PostMapping("/user")
    public void createUser(@RequestBody final UserData user) {
        final User userModel = userMapper.map(user);
        final List<Event> events = userModel.getEvents();
        eventRepository.saveAll(events);//save all events before saving users
        userRepository.save(userModel);
    }

    @GetMapping
    public List<UserData> getUsers() {
        final List<User> users = IterableUtils.toList(userRepository.findAll());
        return userMapper.reverseMap(users);
    }
}
