package com.example.GreetingApp.service;

import com.example.GreetingApp.entity.Greeting;
import com.example.GreetingApp.entity.User;

import java.util.List;
import java.util.Optional;

public interface IGreetingService {
    Greeting addGreeting(User user);

    List<Greeting> getAll();

    Greeting getGreetingById(long id);

    Greeting updateGreeting(Greeting greeting);
}
