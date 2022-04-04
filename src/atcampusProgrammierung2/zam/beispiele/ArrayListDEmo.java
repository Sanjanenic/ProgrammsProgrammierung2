package atcampusProgrammierung2.zam.beispiele;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDEmo {
    public static void main(String[] args) {

        //pravimo objekte koje cemo staviti u kolekciju
        ArrayList<Osterhase> mauritius=new ArrayList<>();//meine erste collection list
        Osterhase karl=new Osterhase("Karl von Karligen",1000,HasenReligion.EXTRABUNTEOSTEREIER);
        Osterhase carla=new Osterhase("Carla Kolumna", 1100, HasenReligion.ZURHEILIGENKAROTTE);
        Osterhase uschi = new Osterhase("Uschi mit dem langen Ohren", 7777, HasenReligion.LANGEOHRENZEUGER);  //ovdje trebam popraviti u konzoli je null

        //fugen hinten elementen hinzu
        mauritius.add(karl);
        mauritius.add(carla);
        mauritius.add(uschi);

        // alle durchlaufen
        for(int h=0; h<mauritius.size(); h++){
            System.out.println(mauritius.get(h));
        }


        //vervenden wir jetzt iterator um uber unsere Strukrur, dritte weg zu durchgehen
        Iterator<Osterhase> iter=mauritius.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println("*******************************");



        //an welche stelle ist karla?
        System.out.println( mauritius.indexOf(carla));

        //karl redet ganzen tag nur von der jagd -hird von der insel gejagt
        mauritius.remove(karl);
        //ist karl wirlich weg?Uberprüfen wir hier
        //nach : kommt array List uber die wir laufen wollen und jedes element haben mochten
        //vor : ist eine neue hilfsvariable die auf das jeweils nachste element gelegt wird
       for(Osterhase oh : mauritius){
           System.out.println(oh);
       }


    }
}
