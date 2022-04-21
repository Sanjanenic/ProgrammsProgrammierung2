package atcampusProgrammierung2.zam.beispiele;

import java.util.Objects;

public class Account {

    private String owner;
    private String iban;
    private String bic;
    private double balance;

    private static int AccountCounter=0;

    //Konstruktor
    public Account(String owner, String iban, String bic) {
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        balance = 0.0;
        this.AccountCounter++;
    }

    public void add(double wert){
       if(wert>0){
           balance+=wert;
       }
    }

    public void deposit(double wert) {
        if (wert <= balance) {
            balance = balance - wert;
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", balance=" + balance +
                ", TotalAccounts=" + AccountCounter +
                '}';
    }
//ovo generisemo:ovo je za poredjenje objekata za kolekcije hash...
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(bic, account.bic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bic);
    }
}
