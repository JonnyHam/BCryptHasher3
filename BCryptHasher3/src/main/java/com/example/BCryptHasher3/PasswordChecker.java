package com.example.BCryptHasher3;
import java.util.*;

public class PasswordChecker {
    private ArrayList<String> plaintexts;

    private ArrayList<String> md5s;
    private ArrayList<String> shas;

    public PasswordChecker(String user) throws Exception {
        PasswordReader test = new PasswordReader();
        plaintexts = test.readPasswords("Plain", user);
        md5s = test.readPasswords("MD5", user);
        shas = test.readPasswords("SHA256", user);
    }

    public String checkHash (String hash) throws Exception {
        if (hash.substring(0,1).equals("$")) {
            return checkBCrypt(hash);
        }
        int i = 0;
        while(i < md5s.size() && i < shas.size()) {
            if (hash.equals(md5s.get(i)) || hash.equals(shas.get(i)))  {
                return "Cracked Hash: " + plaintexts.get(i);
            }
            i++;
        }
        return "Hash not Found in Database";
    }

    private String checkBCrypt (String hash) throws Exception {
        int i = 0;
        while (i < plaintexts.size()) {
            BCrypt test = new BCrypt(plaintexts.get(i), hash);
            if (test.checkHash()) {
                return "Cracked Hash: " + plaintexts.get(i);
            }
            i++;
        }
        return "Hash not Found in Database";
    }

}
