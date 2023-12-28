package week10.day3;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class CustomExceptions {
    public static void main(String[] args) {
        try {
            updatePassword();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void updatePassword() throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter old password: "); // password at least of length = 6 characters
        String oldPassword = scan.next(); // oldPassword = "ok"
        if(oldPassword.length() < 6){
            throw new Exception("Old password can not be less than 6 characters");
        }

        System.out.print("Enter a new password: ");
        String newPassword = scan.next();
        if(newPassword.length() < 6){
            throw new Exception("New password can not be less than 6 characters");
        }

        System.out.println("The password was changed");
    }
}
