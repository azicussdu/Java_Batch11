package week6.day5.hometask;

import java.util.Scanner;

public class Account {
    private String name;
    private String email;
    private String password;

    public Account(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void changePassword(){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your current password: ");
        String oldPass = scan.next();

        System.out.print("enter a new password: ");
        String newPass1 = scan.next();
        System.out.print("enter a new password again: ");
        String newPass2 = scan.next();

        if(this.password.equals(oldPass)){
            if(newPass1.equals(newPass2)){
                this.password = newPass1;
                System.out.println("Your password was changed");
            }
            else{
                System.out.println("Your new passwords are not equal");
            }
        }
        else{
            System.out.println("Your current password is entered wrong");
        }
    }

    public void login(){
        Scanner scan = new Scanner(System.in);
        int count = 0;

        while(count < 3){
            System.out.print("enter email: ");
            String email = scan.next();
            System.out.print("enter password: ");
            String password = scan.next();

            if(this.email.equals(email) && this.password.equals(password)){
                System.out.println("You are logged in");
                break;
            }
            else{
                System.out.println("Incorrect password or login, try again...");
            }
            count++;
        }

        if(count == 3){
            System.out.println("3 times you failed, so wait for 5 minutes");
        }
    }

    public String toString(){
        return "name: " + name + "\nemail: " + email + "\npassword: " + password;
    }

}
