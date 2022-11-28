package com.example.BCryptHasher3;

import java.util.*;

public class Dictionary {
    private ArrayList<String> words;
    public Dictionary(String user) throws Exception {
        PasswordReader test = new PasswordReader();
        words = test.readWords(user);
    }
    public String checkEnglish (String hash) {
        if (hash.substring(0,1).equals("$")) {
            return checkEnglishBCrypt(hash);
        }

        return "";
    }
    private String checkEnglishBCrypt (String hash) {
        return "";
    }
}
