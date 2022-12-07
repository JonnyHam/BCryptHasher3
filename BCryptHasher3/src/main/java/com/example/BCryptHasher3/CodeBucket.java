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

    //Top 10K Passwords with SHA-256 and MD5


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


    //BruteForceAttack with MD5 or SHA-256


    //BruteForce2 test = new BruteForce2();

    //Plain text: "bat"
    //System.out.println(test.attack("5f3f4681121b460e3304a1887f42f1c3"));

    //Plain text: "mrwang"
    //System.out.println(test.attack("9145ad2b33c1c38967ddda4619d46f40"));

    //Plain text: "&!/"
    //System.out.println(test.attack("e76a383d183d17223550bb1c29189dcf"));

    //Plain text: "p@ss"
    //System.out.println(test.attack("195f19b835efe9f0b7b4e276ef1a8515"));


    //Top 10K Passwords with BCrypt


    //PasswordChecker test = new PasswordChecker("Jonathan Kim");
    //System.out.println(test.checkHash("$2a$13$dpCFxCbs7eZARWDvsvs.iuq3y9Jxz6iBbAngwZnoavCzVHtPOg//W"));

    //BCrypt test2 = new BCrypt("password", "$2a$13$dpCFxCbs7eZARWDvsvs.iuq3y9Jxz6iBbAngwZnoavCzVHtPOg//W");
    //System.out.println(test2.checkHash());


    //BruteForceAttack with BCrypt


    //BruteForce2 test = new BruteForce2();

    //Plain text: bat
    //System.out.println(test.attack("$2a$13$wBiwBCL0CaHU9o48Wc40ZOSUoZqYuQqiIXOvkTAyIOOA0QXtMK37y"));

    //Plain text: a
    //System.out.println(test.attack("$2a$13$I35NPBgZ.8.meKxaltJNPOqqbld1iGW977vn42n652nur7.bGahni"));


    //Dictionary Attack


    //Dictionary test = new Dictionary("Jonathan Kim");

    //Plain text: acne
    //System.out.println(test.checkEnglish("$2a$13$/PrEp5eK5ekr3/pyPRko7OIjuJnXrPQKljAEcpGj/Pk8jCTnc60su"));


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
