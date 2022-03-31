package atcampusProgrammierung2.zam.beispiele;

public class OsterApp {
    public static void main(String[] args) {
        Osterhase dieter= new Osterhase("Dieter", 77);
        Osterhase marla=new Osterhase("Marla");
        dieter.setName("Dieter(formarly known als Hansi)");

//        dieter.setAnzahlVersteckteEier(5);
        System.out.println(dieter.getName());
        System.out.println(dieter.getAnzahlVersteckteEier());

        System.out.println(marla.getName());
        System.out.println(marla.getAnzahlVersteckteEier());

        //mochte ien Ei zu der addieren

        dieter.setAnzahlVersteckteEier(dieter.getAnzahlVersteckteEier()+1);
        System.out.println(dieter.getAnzahlVersteckteEier());



      //  dieter.aendereahzahlEier(5);
//        System.out.println((dieter.aenderahzahlEier());  //ohne this in class ergebniss wäre 0
//        System.out.println(dieter.gibMirEinZahlDerVersteckeEier());
//        dieter.aenderahzahlEier();
//
       // System.out.println(dieter.aenderahzahlEier());
        //dieter.aenderahzahlEier=-2;
       // System.out.println(dieter.;);
    }



}
