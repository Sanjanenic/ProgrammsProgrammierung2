package at.campus02.emp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SerialKillers {
    public static void main(String[] args) {
        HashSet<String> serialNicknames= new HashSet<>();

        serialNicknames.add("Ted Bundy");
        serialNicknames.add("Hannibal Lector");
        serialNicknames.add("Zodiac Killer");

        for(String s: serialNicknames){
            System.out.println(s);
        }
        System.out.println(serialNicknames.add("Ted Bundy"));
        System.out.println(serialNicknames.add("Edmund Kemper"));
        System.out.println(serialNicknames.add("Jack the Ripper"));
        for(String s: serialNicknames){
            System.out.println(s);
        }
       //serialNicknames.retain
        //zweites set nur für americaniker/innnen
        HashSet<String>americanSerialKiller= new HashSet<>();
        americanSerialKiller.add("Ted Bundy");
        americanSerialKiller.add("Edmund Kemper");
        americanSerialKiller.add("Hannibal Lector");
        serialNicknames.retainAll(americanSerialKiller);
        System.out.println("----------");

        for(String s: serialNicknames){
            System.out.println(s);
        }
        //Hausaufgabe
        //zuruck zur hashmap
        //in einer haschmap wollem wir alle opfer sereinkiller speichern
        HashMap<String, ArrayList<String>> opfer=new HashMap<>();

        //wen ich her nucht in for schleife dann habe ich ingesamt nur eine
        //array list und würde jedem serienkiller die gleiche arraylist zugeweisen(das kann nicht richtig sein)
         for(String crazyAmerican : americanSerialKiller){
             ArrayList<String> o= new ArrayList<>();
             o.add("Opfer 1");
             o.add("Opfer 2");   //imacemo 3 liste ovdje jer je u for
             o.add("Opfer 3");

             opfer.put(crazyAmerican,o);//jeder killer hat eine eigene opferliste

         }
         //wie kann ich dann jetzt ein opfer zufugen?
        //in dem wir ein opfer in opferliste hinzufugen
        //wie kommen wier zur opferliste?
        //Ted Bundy soll ein viertes Ofer bekommen
       ArrayList<String>opfi= opfer.get("Ted Bundy");
         opfi.add("Opfer 4"); //ovim smo dodali u jednu opfi listu jedan novi opfar
    }
}
