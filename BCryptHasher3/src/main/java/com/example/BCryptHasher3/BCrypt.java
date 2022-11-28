package com.example.BCryptHasher3;

public class BCrypt {
    private String password;
    private String hashedPassword;

    public BCrypt(String p, String h) {
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
        hashedPassword = org.springframework.security.crypto.bcrypt.BCrypt.hashpw(password, org.springframework.security.crypto.bcrypt.BCrypt.gensalt(10));
        //return hashedPassword;
    }

    public String getHashedPassword () {
        return hashedPassword;
    }

    public String getPassword () {
        return password;
    }

    public boolean checkHash () {
        return org.springframework.security.crypto.bcrypt.BCrypt.checkpw(password, hashedPassword);
    }
}
