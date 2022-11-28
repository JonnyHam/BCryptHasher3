package com.example.BCryptHasher3;
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
        if (hash.substring(0,1).equals("$")) {
            return checkBCrypt(hash);
        }
        int i = 0;
        while(i < MD5s.size() && i < SHAs.size()) {
            if (hash.equals(MD5s.get(i)) || hash.equals(SHAs.get(i)))  {
                return plaintexts.get(i);
            }
            i++;
        }
        return "end";
    }

    private String checkBCrypt (String hash) throws Exception {
        int i = 0;
        while (i < plaintexts.size()) {
            BCrypt test = new BCrypt(plaintexts.get(i), hash);
            if (test.checkHash()) {
                return plaintexts.get(i);
            }
            i++;
        }
        return "end";
    }

}
