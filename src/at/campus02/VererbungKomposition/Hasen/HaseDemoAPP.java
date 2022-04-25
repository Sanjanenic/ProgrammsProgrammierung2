package at.campus02.VererbungKomposition.Hasen;

public class HaseDemoAPP {
    public static void main(String[] args) {

        Hase h1 = new Weinachtshase("Hugo");
        Hase h2 =new Osterhase("Hugolina");


        h1.fressen();
        h1.hoppeln();


        h2.schlafen();
        h2.hoppeln();

//probamo up i down cast
        //upcasting
        Hase hase1 = h1;
        h1.hoppeln(); //osterhase implementation is used,
        // ima sam metode iz Hase klase, ne iz Osterhase
        //ako znamo da je ovdje rijec o Osterhase mzemo down casten uraditi:
        Osterhase hase2=(Osterhase)hase1;
        hase2.versteckteOstereier();  //ovo sad radi
        //ali ne uvijek -> Weinachthase ne moze biti Osterhase jer mu nedostaju atributi ili metode Osterhasea
        //hase2=(Osterhase) Weinachtshase  ovo ne moze!

        Hasenstall hs= new Hasenstall();
        hs.addHase(hase2);
        hs.addHase(h1);
        hs.addHase(h2);

        hs.hoppelnAll();

//imam gresku za popraviti

    }
}
