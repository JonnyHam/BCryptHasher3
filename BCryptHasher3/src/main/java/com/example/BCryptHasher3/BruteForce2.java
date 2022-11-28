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

        if (hash.substring(0,1).equals("$")) {
            return attackBCrypt();
        }
        while (!cracked) {
            plainString = "";
            for (int i = 0; i < plain.size(); i++) {
                plainString += (char)((int)(plain.get(i)));
            }
            SHAMD5 test = new SHAMD5();
            BCrypt test2 = new BCrypt(plainString, hash);
            if (test.checkString(plainString, "MD5", hash)) {
                cracked = true;
                return "Cracked hash: " + plainString;
            } else if (test.checkString(plainString, "SHA-256", hash)) {
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

    private String attackBCrypt () {
        while (!cracked) {
            plainString = "";
            for (int i = 0; i < plain.size(); i++) {
                plainString += (char)((int)(plain.get(i)));
            }
            BCrypt test2 = new BCrypt(plainString, hash);
            if (test2.checkHash()) {
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
