package com.example.BCryptHasher3;

public class BCrypt {
    private String password;
    private String hashedPassword;

    //Sets up BCrypt with password (plaintext) and hashed password
    public BCrypt(String p, String h) {
        password = p;
        hashedPassword = h;
    }

    //see name
    public void inputPassword (String p) {
        password = p;
    }

    //see name
    public void inputHash (String h) {
        hashedPassword = h;
    }

    //Converts plaintext into BCrypt hash with 10 salt
    public void hashPassword () {
        hashedPassword = org.springframework.security.crypto.bcrypt.BCrypt.hashpw(password, org.springframework.security.crypto.bcrypt.BCrypt.gensalt(10));
        //return hashedPassword;
    }

    //see name
    public String getHashedPassword () {
        return hashedPassword;
    }

    //see name
    public String getPassword () {
        return password;
    }

    //Checks if plaintext is the same as hash
    public boolean checkHash () {
        return org.springframework.security.crypto.bcrypt.BCrypt.checkpw(password, hashedPassword);
    }
}
