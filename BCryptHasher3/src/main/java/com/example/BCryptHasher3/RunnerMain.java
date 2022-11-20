package com.example.BCryptHasher3;

import java.security.NoSuchAlgorithmException;
import java.util.*;
public class RunnerMain {
    public static void main (String[] args) throws Exception {

        /*
        PasswordChecker test = new PasswordChecker("Jonathan Kim");
        //MD5
        System.out.println(test.checkHash("df0349ce110b69f03b4def8012ae4970"));
        //SHA-256
        System.out.println(test.checkHash("82968e1da9cf580682e99ae94d78688d89684c0872e901c8b60cde135cd5369"));
         */

        /*
        BruteForce test = new BruteForce("df0349ce110b69f03b4def8012ae4970", "MD5");
        ArrayList<Integer> arrTest = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrTest.add(i+118);
        }
        test.bruteForceAttack();
        */


        BruteForce2 test = new BruteForce2();

        //Plain text: "bat"
        //System.out.println(test.attack("5f3f4681121b460e3304a1887f42f1c3"));

        //Plain text: "mrwang"
        //System.out.println(test.attack("9145ad2b33c1c38967ddda4619d46f40"));

        //Plain text: "&!/"
        //System.out.println(test.attack("e76a383d183d17223550bb1c29189dcf"));

        //Plain text: "p@ss"
        System.out.println(test.attack("195f19b835efe9f0b7b4e276ef1a8515"));

    }
}
