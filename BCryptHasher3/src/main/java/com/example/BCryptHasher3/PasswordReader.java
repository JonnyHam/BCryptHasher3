package com.example.BCryptHasher3;
import java.io.*;
import java.util.*;

public class PasswordReader {
    private ArrayList<String> passwords;
    private ArrayList<String> words;
    public ArrayList<String> readPasswords (String type, String user) throws Exception {
        passwords = new ArrayList<>();
        File file = new File(
                "C:\\Users\\" + user + "\\IdeaProjects\\BCryptHasher3\\BCryptHasher3\\src\\main\\java\\com\\example\\BCryptHasher3\\10K" + type + ".txt");

        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null) {
            passwords.add(st);
        }

        return passwords;
    }

    public ArrayList<String> readWords (String user) throws Exception {
        words = new ArrayList<>();
        File file = new File(
                "C:\\Users\\" + user + "\\IdeaProjects\\BCryptHasher3\\BCryptHasher3\\src\\main\\java\\com\\example\\BCryptHasher3\\DictPlain.txt");

        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null) {
            words.add(st);
        }

        return words;
    }

}