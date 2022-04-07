package at.campus02.emp;

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
    }
}
