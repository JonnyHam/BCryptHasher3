package com.example.BCryptHasher3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class PasswordChecker {
    private ArrayList<String> plaintexts;
    private ArrayList<String> MD5s;
    private ArrayList<String> SHAs;

    public PasswordChecker(String user) throws Exception {
        PasswordReader test = new PasswordReader();
        plaintexts = test.readPasswords("Plain", user);
        MD5s = test.readPasswords("MD5", user);
        SHAs = test.readPasswords("SHA256", user);
    }

    public String checkHash (String hash) throws Exception {
        int i = 0;
        while(i < MD5s.size() && i < SHAs.size()) {
            if (hash.equals(MD5s.get(i)) || hash.equals(SHAs.get(i)))  {
                return plaintexts.get(i);
            }
            i++;
        }
        return "end";
    }

}
