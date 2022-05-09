package AbstractOrcestar.Instrumente;

public class Gitarre extends Instrumente {


    public Gitarre(int lautstarke, String name ) {
        super(lautstarke, name);
    }


    @Override
    public int play() {
        System.out.println(name + " wird gespielt ");
        return lautstarke;
    }
}
