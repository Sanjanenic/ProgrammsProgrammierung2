package AbstractOrcestar.Instrumente;

import java.util.ArrayList;

public class Orkestar {
    //atribut ove klase je array niz
    private ArrayList<Instrumente> MeineOrkestar;


    //konstruktor

    public Orkestar(ArrayList<Instrumente> meineOrkestar) {
        MeineOrkestar = meineOrkestar;
    }


    //Methoden
    public void addInstrumente (Instrumente i){
        MeineOrkestar.add(i);
    }

//    public void addHase(Hase h){
//        all.add(h);
//    }
//
//    public void hoppelnAll (){
//        for (Hase h: all){
//            h.hoppeln();
//        }

    public int playOrkestar( ){
        int orkestarLautstarke=0;

        for(int i=0; i<MeineOrkestar.size(); i++) {
            orkestarLautstarke += MeineOrkestar.get(i).play();
        }

        return orkestarLautstarke;
    }


//    public void addInstrumente(Instrumente i1){
//        MeineOrkestar.add(i1);
//
//    }
//    public  void addTrompette(Trompete t1){
//        MeineOrkestar.add(t1);
//    }
//    public  void addKlarinette(Klarinette k1){
//        MeineOrkestar.add(k1);
//    }
//    public  void addGeige(Geige g1){
//        MeineOrkestar.add(g1);
//    }


}
