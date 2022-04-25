package at.campus02.VererbungKomposition.Hasen;

import java.util.ArrayList;

public class Hasenstall  {
private ArrayList<Hase> all;
//konstruktor
public Hasenstall(){
    all=new ArrayList<>();
}

public void addHase(Hase h){
    all.add(h);
}

public void hoppelnAll (){
    for (Hase h: all){
        h.hoppeln();
    }
}







}
