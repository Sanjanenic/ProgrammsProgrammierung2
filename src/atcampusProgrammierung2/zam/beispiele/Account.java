package atcampusProgrammierung2.zam.beispiele;

public class Account {

    private String owner;
    private String iban;
    private String bic;
    private double balance;

    //Konstruktor
    public Account(String owner, String iban, String bic) {
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        balance = 0.0;
    }
   }

//    public double add(double wert, double kostenstand){
//       if(wert>0){
//           balance+=0;
//       }
//
//    }
//    public double deposit(double wert) {
//
//        if (wert < balance) {
//            balance = balance - wert;
//        }
//        if(wert>balance) {
//        else{
//                wert = balance;
//                balance = 0;
//            }
//            return wert;
//        }
//        return 0;
//    }
//    public double getBalance() {
//        return balance;
//    }
//}
