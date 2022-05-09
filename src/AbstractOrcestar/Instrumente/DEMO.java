package AbstractOrcestar.Instrumente;

import java.util.ArrayList;

public class DEMO {
    public static void main(String[] args) {
         //Instrumente i1= new Instrumente(5, "UnknownInstrument");
         //i1.play(); das unktioniert wil solte

        Instrumente t1 = new Trompete(10, "Trompette1");
        Instrumente k1 = new Klarinette(2,"Klarinette1");
        Instrumente g1 = new Geige(6,"Geige1");

        ArrayList<Instrumente> lista = new ArrayList<Instrumente>();

        //lista.add(i1);
        lista.add(t1);
        lista.add(k1);
        lista.add(g1);

        Orkestar ork = new Orkestar(lista);

        int laute = ork.playOrkestar();

        System.out.println(laute);
    }
}
