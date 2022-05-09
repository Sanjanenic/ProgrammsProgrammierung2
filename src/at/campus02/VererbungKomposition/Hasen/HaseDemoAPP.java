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
        Osterhase hase2=(Osterhase)h2;
        hase2.versteckteOstereier();  //ovo sad radi
        //ali ne uvijek -> Weinachthase ne moze biti Osterhase jer mu nedostaju atributi ili metode Osterhasea
        //hase2=(Osterhase) Weinachtshase  ovo ne moze!

        Hasenstall hs= new Hasenstall();
        hs.addHase(hase2);
        hs.addHase(h1);
        hs.addHase(h2);

        hs.hoppelnAll();

//vjezbe sa up und down casting:
        //prva tri su objekti
        Osterhase o1=new Osterhase("Maxi Egg");
        Hase En = new Hase("Enrico");
        Weinachtshase w2 = new Weinachtshase(" Mr. Snow");

        //ovo ispod su tri referece, varijable
        Weinachtshase wh= null;  //ne mora se pisati ova inicijalizacija ali moze
        Osterhase oh;
        Hase h;
       //hijerarhija naslijedjivanja
        //                 -> Osterhase
       //Object -> Hase ->
        //                 ->Weihnachtshase
h=o1;
//UPCASTING: dodijeliti child class to a referece of its perents class :
        //z.B. h=o1 // dodijeliti sa desna (child klass Osterhase) na lijevo (parent class Hase).
        //ovaj upcating funkcionise uvijek, h je refereny u nasem primjeru
        //o1 i h pokazuju na isti objekt ali sad su razliciti: ako pristupim Maxi Egg preko h Hase reference:
        //objekat nema metodu skrivanja jaja jer vidimo samo atribute i metode koje ima Hase ne i Osterhase
        // ( sa 01. se vii i metoda za Osterhase

   h.hoppeln();
        //ovdje ocekujemo hoppeln iz Osterhase class i dobijemo ga
        //najbliza metoda hoppeln je izvrsena

//DOWNCASTING: dodijeliti generalni tip specificnijem tipu
// Achtung! ovo radi samo ako generalna referenca vec pokazuje na specificicarnu referencu objekta
       // wh=h1; ovo ne radi jer Osterhase moze vise nego obicni Hase, zato ga moramo casting:

       // wh=(Weinachtshase) h1; //ovo kod mene radi, kod njega ClassExeption
        //postoje slucajevi kad downcasting radi:prvo cu uraditi upcasting

        h=w2 ; //ovo se prije desilo, ne mora biti bas ovdje

        //ali znamo da se iza ove Hase reference nalati zapravo WeinachtsHase

        wh=(Weinachtshase) h;


    }
}
