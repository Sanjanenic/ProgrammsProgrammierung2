package at.campus02.VererbungKomposition;

import java.util.ArrayList;

public class Customer extends Person {
    private int customerNumber;

    private ArrayList<Address> addresses;

//Konstruktor -kad se metoda zove kao i klasa onda se svakkako radi o konstruktoru
    //izvrsi se skavi put ad napravim novi objekt

    public Customer(int customerNumber, String firstname, String lastaname) {
       super (firstname,lastaname);  //ovako pozivam konstruktor, ovo mora biti u prvoj liniji konstruktora

    this.customerNumber = customerNumber;
        this.addresses = new ArrayList<>();  //ovdje ne trebam inicijalizaciju neve dvije parametra jjer je to uradjeno
        //u person
    }

   public void addAddress (Address a) {
       addresses.add(a);
   }


    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                "Firstname=" + firstname +  //ovo dodati u metodu
                "Lastname="+ lastName +
                '}';
    }
}
