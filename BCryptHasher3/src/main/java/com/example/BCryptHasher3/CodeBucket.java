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

    //
}
