package atcampusProgrammierung2.zam.beispiele;

import java.util.Comparator;

public class AccountBalanceComaprator implements Comparator<Account> {


    @Override
    public int compare(Account o1, Account o2) {
        if(o1.getBalance()<o2.getBalance()){
            return -1;
        }
        if(o1.getBalance()>o2.getBalance()){
            return 1;
        }
        return 0;
    }
}
