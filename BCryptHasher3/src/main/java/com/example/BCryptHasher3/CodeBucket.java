package com.example.BCryptHasher3;

public class CodeBucket {
    //PasswordChecker:
    /*
        PasswordReader test = new PasswordReader();
        System.out.println(test.readPasswords());
        String passwords = test.readPasswords();
        String[] passwordList = passwords.split(" ");
        System.out.println(Arrays.toString(passwordList));
        System.out.println(passwordList[1000]);

        String[] passwordsHashed = new String[passwordList.length];

        SHAMD5 test2 = new SHAMD5();
        String hashedPasswords = "";
        for (int i = 0; i < passwordList.length; i++) {
            String hashedPassword;
            hashedPassword = test2.encryptString(passwordList[i], "SHA-256");
            passwordsHashed[i] = hashedPassword;
            hashedPasswords += hashedPassword + "\n";
        }
        //System.out.println(Arrays.toString(passwordsHashed));
        System.out.println(hashedPasswords);
         */
    /*
        PasswordReader test = new PasswordReader();
        //System.out.println(test.readPasswords());
        String passwords = test.readPasswords();
        String[] passwordList = passwords.split(" ");
        //System.out.println(Arrays.toString(passwordList));
        //System.out.println(passwordList[1000]);

        String[] passwordsHashed = new String[passwordList.length];

        SHAMD5 test2 = new SHAMD5();
        String hashedPasswords = "";
        for (int i = 0; i < passwordList.length; i++) {
            String hashedPassword;
            hashedPassword = test2.encryptString(passwordList[i], "SHA-256");
            passwordsHashed[i] = hashedPassword;
            hashedPasswords += hashedPassword + "\n";
        }
        //System.out.println(Arrays.toString(passwordsHashed));
        System.out.println(hashedPasswords);
         */

    //SHAMD5:
    /*
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MD5 encryptor = new MD5();

        String password = "monkey123";
        String type = "MD5";

        String hashedPassword = encryptor.encryptString(password, type);
        System.out.println(hashedPassword);
        System.out.println(encryptor.checkString(password, type, hashedPassword));
    }
     */

    //RunnerMain:
     /*
        SHAMD5 encryptor = new SHAMD5();

        String password = "matthew";
        //type: can do MD5, SHA-256, and BCrypt
        String type = "BCrypt";
        if (!(type.equals("BCrypt"))) {
            String hashedPassword = encryptor.encryptString(password, type);
            System.out.println(hashedPassword);
            System.out.println(encryptor.checkString(password, type, hashedPassword));
        } else {
            Bcrypt3 test = new Bcrypt3();
            test.inputPassword(password);
            test.hashPassword();
            System.out.println(test.getHashedPassword());
            System.out.println(test.checkHash());
        }
        */

    /*
        System.out.println((int)('a'));
        System.out.println((int)('z'));

        for (int i = (int)('a'); i <= (int)('z'); i++) {
            System.out.println((char)(i));
        }
         */

        /*
        ArrayList<Integer> test = new ArrayList<>();
        test.add((int)('a'));
        System.out.println(Arrays.deepToString(test.toArray()));
        int letter = test.get(0)+1;
        test.set(0, letter);
        System.out.println(Arrays.deepToString(test.toArray()));
         */

    //Creating SHA and MD5 for dictionary attack

        /*
        PasswordReader test = new PasswordReader();
        ArrayList<String> words = test.readWords("100117545");
        ArrayList<String> MD5 = new ArrayList<>();
        ArrayList<String> SHA = new ArrayList<>();
        SHAMD5 test2 = new SHAMD5();
        for (int i = words.size()/2; i < words.size(); i++) {
            //MD5.add(test2.encryptString(words.get(i), "MD5");
            //SHA.add(test2.encryptString(words.get(i),"MD5") );
            System.out.println(test2.encryptString(words.get(i), "SHA-256"));
        }
        */
}
