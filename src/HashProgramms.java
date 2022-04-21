import atcampusProgrammierung2.zam.beispiele.Account;

import java.util.HashSet;

public class HashProgramms {
    public static void main(String[] args) {
     //pokazati da razliciti objekti mogu imati iste hashcode


        String s1="VII";
        String s2= "Ugh";
        //I ban glech
        Account dritte=new Account("Iva", "78pppdff", "73098");
        Account erste=new Account("Ina", "78pppdff", "77098");


        System.out.println(s1.hashCode());  //das ist eine Methode
        System.out.println(s2.hashCode());

  //erzeugen eine Menge in matematische Sinn, weil diese hat Eingeschaft dass jedes Objekt nur einmal daran sei kann
        //wie entscheiden wir ob es drinnen ist oder nicht: mit methoden hashCode und quals
        //Colletion verwenden intern dafür haschCode(und falls wirklich gleich ist danach noch equals.
        HashSet<Account> bank =new HashSet<>();  //das sit eine Menge-kann alles nur einmal sein
        System.out.println(bank.add (dritte));
        System.out.println(bank.add (erste));


    }


}
