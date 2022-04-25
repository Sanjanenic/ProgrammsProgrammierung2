package at.campus02.VererbungKomposition.Hasen;

public class Weinachtshase extends Hase{

    public void verteileGeschenke(){
        System.out.println(name + "Gechenke erledigt");
    }

    public Weinachtshase(String name) {
        super(name);
    }

    @Override
    public void hoppeln(){
        System.out.println("Weinachthase "+ name + " hoppelt durch dem Schnee");
    }
}
