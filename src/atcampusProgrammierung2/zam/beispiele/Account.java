package atcampusProgrammierung2.zam.beispiele;

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
}
