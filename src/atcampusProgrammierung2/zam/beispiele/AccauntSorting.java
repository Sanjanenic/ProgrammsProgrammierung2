package atcampusProgrammierung2.zam.beispiele;

import java.util.ArrayList;
import java.util.Collections;

public class AccauntSorting {
    public static void main(String[] args) {
        Account erste =new Account("Hugo", "123456asd","2345");
        Account zweite=new Account("Lara", "78000dff", "4579");
        Account dritte=new Account("Iva", "78pppdff", "73098");
        erste.add(1000);
        zweite.add(400);
        dritte.add(200);

        ArrayList<Account> allAccounts = new ArrayList<>();
        allAccounts.add(erste);
        allAccounts.add(zweite);
        allAccounts.add(dritte);
        System.out.println(allAccounts);

        Collections.sort(allAccounts, new AccountBalanceComaprator());
        System.out.println(allAccounts);

        //Collections.sort(allAccounts);
        System.out.println(allAccounts);
    }
}
