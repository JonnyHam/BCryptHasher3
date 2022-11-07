package com.example.BCryptHasher3;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class Bcrypt3 {
    private String password;
    private String hashedPassword;

    public Bcrypt3 () {

    }

    public Bcrypt3 (String p, String h) {
        password = p;
        hashedPassword = h;
    }

    public void inputPassword (String p) {
        password = p;
    }

    public void inputHash (String h) {
        hashedPassword = h;
    }

    public void hashPassword () {
        hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt(10));
        //return hashedPassword;
    }

    public String getHashedPassword () {
        return hashedPassword;
    }

    public String getPassword () {
        return password;
    }

    public boolean checkHash () {
        return BCrypt.checkpw(password, hashedPassword);
    }
}
