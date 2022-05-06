package com.example.GreetingApp.service;

import com.example.GreetingApp.entity.Greeting;
import com.example.GreetingApp.entity.User;
import com.example.GreetingApp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

// We have created this class that implements the interface so that we can use the Jpa methods.
@Service
public class GreetingServiceImpl implements IGreetingService{

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //We are using the Autowired annotation so that we can use the interface methods.
    @Autowired
    private GreetingRepository greetingRepository;


    /**
     *Method to add the id and message to the repository.
     *
     * @param user - We are passing the user object
     * @return - will return the id and the message
     */
    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.toString());
        return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
    }

    /**
     *  Method to get all the greetings from the list.
     * @return - will return the List of all the users.
     */
    @Override
    public List<Greeting> getAll() {
        return greetingRepository.findAll();
    }

    /**
     *  Method to get the greeting by the Id.
     * @param id - We will pass the id
     * @return - Will return the greeting repo of the user id.
     */
    @Override
    public Greeting getGreetingById(long id){
        return greetingRepository.findById(id).get();
    }
}
