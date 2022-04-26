package at.campus02.VererbungKomposition.Instrumente;

import jdk.swing.interop.SwingInterOpUtils;

public class Instrumente {

    public int lautstarke;
    public String name;

    public Instrumente(int lautstarke, String name) {
        this.lautstarke = lautstarke;
        this.name=name;
    }


    public int play(){

        System.out.println(name + " wird gespielt ");
    return lautstarke;

    }



}
