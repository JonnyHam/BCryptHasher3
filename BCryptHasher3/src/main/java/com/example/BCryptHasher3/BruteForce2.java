package com.example.BCryptHasher3;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class BruteForce2 {
    //private String type;
    private String hash;
    private ArrayList<Integer> plain;
    private String plainString;
    private boolean cracked;

    public String attack (String h) throws NoSuchAlgorithmException {
        hash = h;
        cracked = false;
        plain = new ArrayList<>();
        plain.add(32);
        plainString = "";

        while (!cracked) {
            plainString = "";
            for (int i = 0; i < plain.size(); i++) {
                plainString += (char)((int)(plain.get(i)));
            }
            SHAMD5 test = new SHAMD5();
            if ((test.checkString(plainString, "MD5", hash)) || (test.checkString(plainString, "SHA-256", hash))) {
                cracked = true;
                return "Cracked hash: " + plainString;
            } else {
                for (int i = plain.size()-1; i > -1; i--) {
                    if (plain.get(i) < 126) {
                        int letter = plain.get(i) + 1;
                        plain.set(i, letter);
                        break;
                    }
                    plain.set(i, 32);
                    if (i == 0) {
                        plain.add(32);
                    }
                }
            }
        }
        return "end";
    }
}
