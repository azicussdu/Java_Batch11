package week7.day2.ex3;

import java.util.ArrayList;
import java.util.Arrays;

public class TestAccount {
    public static void main(String[] args) {

        Account acc1 = new Account("John", Role.USER, Status.ONLINE);
        Account acc2 = new Account("Mike", Role.MODERATOR, Status.ONLINE);
        Account acc3 = new Account("Terry", Role.USER, Status.OFFLINE);
        Account acc4 = new Account("Mary", Role.ADMIN, Status.ONLINE);
        Account acc5 = new Account("Bob", Role.USER, Status.ONLINE);
        Account acc6 = new Account("King", Role.MODERATOR, Status.ONLINE);
        Account acc7 = new Account("Jake", Role.MODERATOR, Status.OFFLINE);

        ArrayList<Account> accountsList = new ArrayList<>(Arrays.asList(acc1, acc2, acc3, acc4, acc5, acc6, acc7));

        showAccountsByRoleAndStatus(accountsList, Role.MODERATOR, Status.ONLINE);
    }

    public static void showAccountsByRoleAndStatus(ArrayList<Account> accountsList, Role role, Status status){
        for(Account account : accountsList){
            if(account.role == role && account.status == status){
                System.out.println(account);
            }
        }
    }
}
