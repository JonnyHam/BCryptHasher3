package com.example.BCryptHasher3;

import java.security.NoSuchAlgorithmException;

public class RunnerMain {
    public static void main (String[] args) throws Exception {
        /*
        SHAMD5 encryptor = new SHAMD5();

        String password = "matthew";
        //type: can do MD5, SHA-256, and BCrypt
        String type = "BCrypt";
        if (!(type.equals("BCrypt"))) {
            String hashedPassword = encryptor.encryptString(password, type);
            System.out.println(hashedPassword);
            System.out.println(encryptor.checkString(password, type, hashedPassword));
        } else {
            Bcrypt3 test = new Bcrypt3();
            test.inputPassword(password);
            test.hashPassword();
            System.out.println(test.getHashedPassword());
            System.out.println(test.checkHash());
        }
        */
        PasswordChecker test = new PasswordChecker();
        System.out.print(test.checkHash("df0349ce110b69f03b4def8012ae4970"));
    }
}
