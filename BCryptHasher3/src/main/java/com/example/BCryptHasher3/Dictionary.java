package com.example.BCryptHasher3;

import java.util.*;

public class Dictionary {
    private ArrayList<String> words;
    private ArrayList<String> md5s;
    private ArrayList<String> shas;


    public Dictionary(String user) throws Exception {
        PasswordReader test = new PasswordReader();
        words = test.readWords("Plain", user);
        md5s = test.readWords("MD5", user);
        shas = test.readWords("SHA256", user);
    }
    public String checkEnglish (String hash) {
        if (hash.substring(0,1).equals("$")) {
            return checkEnglishBCrypt(hash);
        }

        int i = 0;
        while(i < md5s.size() && i < shas.size()) {
            if (hash.equals(md5s.get(i)) || hash.equals(shas.get(i)))  {
                return words.get(i);
            }
            i++;
        }
        return "end";
    }
    private String checkEnglishBCrypt (String hash) {
        int i = 0;
        while (i < words.size()) {
            BCrypt test = new BCrypt(words.get(i), hash);
            if (test.checkHash()) {
                return words.get(i);
            }
            i++;
        }
        return "end";
    }
}
