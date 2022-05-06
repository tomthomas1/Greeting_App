package com.example.GreetingApp.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// We have defined user here to create multiple users.
public class User {
    public String firstName;
    public String lastName;

    @Override
    public String toString() {
        String str = (firstName != null) ? firstName + " " : "";
        str += (lastName != null) ? lastName : "";
        return str.trim();
    }
}
