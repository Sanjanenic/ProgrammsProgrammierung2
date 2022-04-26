package at.campus02.VererbungKomposition.Instrumente;

public class Trompete extends Instrumente {

    //konstruktor
    public Trompete (int lautstarke, String name){

        super(lautstarke, name);
    }

    @Override
    public int play() {
        System.out.println(name + " Trompete wird gespielt ");
        return lautstarke;
    }


}
