package week6.day5;

public class Hometask {


    /*
    create a class Account with fields:
        String name;
        String email;
        String password;
        (all fields should be private, so nobody from outside the class
        can change these values.)

        Create a constructor with 3 parameters(name, email, password).
        Also create two methods inside class:
            changePassword()
            login()
     */

//    Account acc = new Account("John", "john@gmail.com", "123456");
//        acc.password = "123456new"; // can not do it, because password is a private field
//        acc.changePassword(); // so need to call this method

        /*
        changePassword() - method first asks to enter current password,
        and then asks to enter a new password 2 times.
        If current password is right and entered two new passwords are the same
        then only it changes your current password to new one.
         */

//        acc.login();
        /*
        this method asks to enter an email and password,
        if everything was entered correctly then it prints message: "You are logged in".
        Otherwise, it prints "Incorrect email or password".

        If user fails to login 3 times then on 3rd time it should print:
        "3 failed tries, wait for 5 minutes and then try again"
         */


}
