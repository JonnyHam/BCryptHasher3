package com.example.BCryptHasher3;

import java.security.NoSuchAlgorithmException;

public class RunnerMain {
    public static void main (String[] args) throws Exception {

        PasswordChecker test = new PasswordChecker("100117545");
        //MD5
        System.out.println(test.checkHash("df0349ce110b69f03b4def8012ae4970"));
        //SHA-256
        System.out.println(test.checkHash("82968e1da9cf580682e99ae94d78688d89684c0872e901c8b60cde135cd5369"));
    }
}
