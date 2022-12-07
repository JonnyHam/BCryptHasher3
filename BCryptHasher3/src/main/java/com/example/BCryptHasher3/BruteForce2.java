package com.example.BCryptHasher3;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class BruteForce2 {
    //private String type;
    private String hash;
    private ArrayList<Integer> plain;
    private String plainString;
    private boolean cracked;

    //This method uses every combination of typeable characters visible on the basic latin keyboard and encrypts these combination and checks
    // them with the inputted hash to see if they're the same
    public String attack (String h) throws NoSuchAlgorithmException {
        hash = h;
        cracked = false;
        plain = new ArrayList<>();
        plain.add(32);
        plainString = "";

        //checks to see if hash is a BCrypt hash
        if (hash.substring(0,1).equals("$")) {
            return attackBCrypt();
        }
        while (!cracked) {
            plainString = "";

            //Converts the number values in the plain array into characters that are inputted into a string
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

                //If string does not equal hash, increases the value of the last character in the array.
                    //If last character is last character value, then changes to first character increments the next value in the array.
                for (int i = plain.size()-1; i > -1; i--) {
                    if (plain.get(i) < 126) {
                        int letter = plain.get(i) + 1;
                        plain.set(i, letter);
                        break;
                    }
                    plain.set(i, 32); //sets i value in array to first character
                    if (i == 0) {
                        plain.add(32); //adds another character to the end of array that is the first character
                    }
                }
            }
        }
        return "error";
    }

    //Does the same thing as above but for BCrypt (which is a lot slower :() )
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
