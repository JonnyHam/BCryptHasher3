first argument: method of password cracking (accepted: -dict, -brute, -tenk)

second argument: hash (example: $2a$13$wBiwBCL0CaHU9o48Wc40ZOSUoZqYuQqiIXOvkTAyIOOA0QXtMK37y)

First, input this command:
    cd C:\Users\(your username)\IdeaProjects\BCryptHasher3\out\artifacts\BCryptHasher3_Jar

Example command:
    java -jar BCryptHasher3.jar -dict ede79b3fbf673a9a8e9bf3db02aeb7b2

*One thing to note:
    the command, 'java' doesn't work with Windows Powershell by default. In order to make it work, you need add 'JAVA_HOME'
    as an environment variable. To do this, follow this tutorial: https://mkyong.com/java/how-to-set-java_home-on-windows-10/

        If you are unable to do that, you can also use this command:
            & 'C:\Program Files\Java\jdk-13\bin\java.exe' -jar .\BCryptHasher3.jar -dict ede79b3fbf673a9a8e9bf3db02aeb7b2

Dependencies: Spring Security