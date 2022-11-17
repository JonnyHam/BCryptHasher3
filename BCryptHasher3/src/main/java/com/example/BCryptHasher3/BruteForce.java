package com.example.BCryptHasher3;

import java.security.NoSuchAlgorithmException;
import java.util.*;

public class BruteForce {
    private String type;
    private String hash;
    private ArrayList<Integer> plain;
    private String plainString;
    private boolean cracked;
    private boolean add;
    public BruteForce (String h, String t) {
        hash = h;
        type = t;
    }

    public String bruteForceAttack () throws NoSuchAlgorithmException {
        SHAMD5 test = new SHAMD5();

        cracked = false;
        plain = new ArrayList<>();
        plain.add((int)('a'));
        while (!cracked) {
            plainString = "";
            for (int i = 0; i < plain.size(); i++) {
                plainString += (char)((int)plain.get(i));
            }
            if (test.checkString(plainString, "MD5", hash) || test.checkString(plainString, "SHA-256", hash)) {
                cracked = true;
            } else {
                recursion(plain);
            }
        }
        return "";
    }

    public ArrayList<Integer> recursion (ArrayList<Integer> arr) throws NoSuchAlgorithmException {
        /*
        String plainString2 = "";
        for (int i = 0; i < arr.size(); i++) {
            plainString2 += (char)((int)arr.get(i));
        }
         */
        int x = arr.size()-1;

        ArrayList<Integer> original= arr;
        if (arr.size() > 1) {
            arr.remove(0);
            recursion(arr);
        }
        arr.add(0,original.get(0));
        if (arr.get(0).equals(126) && add) {
            if (arr.size() == plain.size()) {
                arr.add(32);
            }
            arr.set(0, 32);
            add = true;
        }else if(add){
            arr.set(0,arr.get(0)+1);
        }
        System.out.println(Arrays.deepToString(arr.toArray()));

        return arr;
    }
}
