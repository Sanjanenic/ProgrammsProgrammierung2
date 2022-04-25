package at.campus02.VererbungKomposition.Hasen;

public class Osterhase extends Hase {
    public Osterhase(String name) {
        super(name);
    }

    public void versteckteOstereier(){
        System.out.println(name + "Eier versteckt");
    }

    @Override
    public void hoppeln(){
        System.out.println(name + " hoppelt" + " und eier versteckt");
    }
}
