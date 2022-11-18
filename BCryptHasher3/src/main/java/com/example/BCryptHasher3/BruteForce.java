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
        plain = new ArrayList<>();
        for(int i=0;i<10;i++){
            plain.add(i);
        }
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
                plain=recursion(plain);
            }
        }
        return Arrays.deepToString(plain.toArray());
    }

    public ArrayList<Integer> recursion (ArrayList<Integer> arr) throws NoSuchAlgorithmException {
        /*
        String plainString2 = "";
        for (int i = 0; i < arr.size(); i++) {
            plainString2 += (char)((int)arr.get(i));
        }
         */

        Integer original=-1;
        if (arr.size() > 1) {
            original= arr.get(0);

            arr.remove(0);
            recursion(arr);

        }else if(arr.size()==1){
            add=true;
        }

        if (arr.get(0)>126 && add) {
            if (arr.size() == plain.size()) {
                arr.add(0,32);
                arr.set(1,32);
            }else {
                arr.set(0, 32);
                add = false;
            }

        }else if(add){
            arr.set(0,arr.get(0)+1);
            add=false;
        }
        if (original==-1){

        }else {
            arr.add(0, original);
        }
        System.out.println(Arrays.deepToString(arr.toArray()));

        return arr;
    }
}
