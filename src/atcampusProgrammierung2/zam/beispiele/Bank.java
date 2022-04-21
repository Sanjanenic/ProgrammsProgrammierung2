package atcampusProgrammierung2.zam.beispiele;


import java.util.HashMap;

public class Bank {
    public static void main(String[] args) {
        Account erste =new Account("Hugo", "123456asd","2345");
        Account zweite=new Account("Lara", "78000dff", "4579");
        Account dritte=new Account("Iva", "78pppdff", "73098");

    erste.add(7000);
    zweite.add(90);
    dritte.add(1890);

//        System.out.println(erste);
//        System.out.println(zweite.getBalance());
//        System.out.println( dritte.getBalance());

        Account[] account = new Account[] {erste,zweite,dritte};
        for(int i =0; i< account.length;++i){
            System.out.println(account[i]); //mit komplexe datentype geht es immer so mit methode am ende
        }

erste.deposit(500);
        zweite.deposit(500);
        dritte.deposit(1890);

        for(int i =0; i< account.length;++i){
            System.out.println(account[i].getBalance()); //mit komplexe datentype geht es immer so mit methode am ende
        }

        //wir mochter account uber den namen der besitzerinen zugreifen
        //mapping von Dagobart Duck...Account()
        //Dagobart Duck ist ein besipiel für enen Schlusselelement
        //Account ist beispiel für wert
        //achting: wen so machen wir, kann jedes person nur einen Acount  haben

        HashMap<String, Account>bank=new HashMap<>();
        bank.put("Hugo", erste);
        bank.put("Lara", zweite);
        bank.put("Iva", dritte);
//gib es einen wert dem schlussel dagbert
        System.out.println(bank.containsKey("Hugo"));
        //mochten dem Wert del schlussel lara behalten
        System.out.println(bank.get("Lara"));

        //einmal durch iterrieren, achtung etwas anderes
        for(String owner: bank.keySet()){  //hier owner konnte auch andere name haben, hat nichts zu tun mit owner in nachste Zeile
            System.out.println(owner);
            System.out.println(bank.get(owner));
        }
    }
}
