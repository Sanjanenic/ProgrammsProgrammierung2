package at.campus02.VererbungKomposition;

import java.util.ArrayList;

public class Address {

    private String street;
    private String  zip;
    private String city;
    private String country;

//Konstruktor
    public Address(String street, String zip, String city, String country) {
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.country = country;
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
