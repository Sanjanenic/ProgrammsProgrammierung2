package atcampusProgrammierung2.zam.beispiele;

public class TuerDEMO {
    public static void main(String[] args) {
        Tuer teur1= new Tuer(200,56,Himelrichtung.NORDEN);


        System.out.println(teur1.getRichtungVonOffnen());
        teur1.setRichtungVonOffnen(Himelrichtung.SUEDEN);

        System.out.println(teur1);
    }
}
