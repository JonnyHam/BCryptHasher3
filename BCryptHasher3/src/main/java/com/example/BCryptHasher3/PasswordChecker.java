package com.example.BCryptHasher3;
import java.util.*;

public class PasswordChecker {
    private ArrayList<String> plaintexts;

    private ArrayList<String> md5s;
    private ArrayList<String> shas;

    //Configures PasswordChecker by running PasswordReader for each local variable.
    public PasswordChecker() throws Exception {
        PasswordReader test = new PasswordReader();
        plaintexts = test.readPasswords("Plain");
        md5s = test.readPasswords("MD5");
        shas = test.readPasswords("SHA256");
    }

    //Checks if shas or md5s has hash inputted from parameter in txt file.
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

    //Same thing has checkHash but only checks if BCrypt equals one of the plaintexts.
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
