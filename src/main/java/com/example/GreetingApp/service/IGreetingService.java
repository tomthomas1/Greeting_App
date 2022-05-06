package com.example.GreetingApp.service;

import com.example.GreetingApp.entity.Greeting;
import com.example.GreetingApp.entity.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
}
