package com.example.BCryptHasher3;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class Bcrypt3 {
    private final String password;
    private String hashedPassword;

    public Bcrypt3 (String p) {
        password = p;
    }

    public String hasher () {
        hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt(10));
        return hashedPassword;
    }
}
