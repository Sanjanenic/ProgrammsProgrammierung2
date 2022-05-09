package AbstractOrcestar.Instrumente;

public class Klarinette extends Instrumente {

    //konstruktor

    public Klarinette(int lautstarke, String name){

        super(lautstarke, name);
    }

    @Override
    public int play() {
        System.out.println(name + " Klarinette wird gespielt ");
        return lautstarke;
    }

}
