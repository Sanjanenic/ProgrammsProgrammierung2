package AbstractOrcestar.Instrumente;

public abstract class Instrumente {

    public int lautstarke;
    public String name;

    public Instrumente(int lautstarke, String name) {
        this.lautstarke = lautstarke;
        this.name=name;
    }


    public abstract int play();

}
