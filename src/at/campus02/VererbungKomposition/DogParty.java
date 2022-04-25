package at.campus02.VererbungKomposition;

public class DogParty {
    public static void main(String[] args) {

        Dog scooby = new Dog("ScoobyDoo", "black", 40, true);
        System.out.println(scooby);
        scooby.bark();

//        Dog hund = new Dog();
//        hund.bark();

        Beagle max;
        max = new Beagle("max","black",20,true, "Somthing");
        System.out.println(max);   //ispise sve za Hund, preko praznoga konstruktora ide
        //u klasu Dog i ispisuje vrijednosti.

        max.bark();
    }
}
