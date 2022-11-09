package com.example.BCryptHasher3;
import java.io.*;


public class PasswordReader {
    public static void main (String[] args) throws Exception {
        File file = new File(
                "C:\\Users\\100117545\\Downloads\\BCryptHasher3\\BCryptHasher3\\src\\main\\java\\com\\example\\BCryptHasher3\\10KPass.txt");

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
        while ((st = br.readLine()) != null)

            // Print the string
            System.out.println(st);
    }
}
