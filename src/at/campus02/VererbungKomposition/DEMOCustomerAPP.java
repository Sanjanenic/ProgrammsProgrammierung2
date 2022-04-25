package at.campus02.VererbungKomposition;

public class DEMOCustomerAPP {
    public static void main(String[] args) {
        Address a1=new Address("New Welt7", "8010", "Graz","Österreich" );
        Address a2 =new Address("Scherigergasse", "8042", "Graz", "AT");


        Customer c1 = new Customer(1, "Anna", "Wegnner");
        Customer c2 = new Customer(2, "Marco", "Lima");

        c1.addAddress(a1);
        c2.addAddress(a2);

        System.out.println(c1);
        System.out.println(c2);

        c1.loveChokolate();  //dobijem false ali ne znam gdje sam ga definisala?????

    }
}
