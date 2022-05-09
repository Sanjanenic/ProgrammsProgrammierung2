package AbstractOrcestar.Instrumente;

public class Geige extends Instrumente {

    public Geige (int lautstarke, String name){

        super(lautstarke, name);
    }

    @Override
    public int play() {
        System.out.println(name + " Geige wird gespielt ");
        return super.lautstarke;
    }
}
