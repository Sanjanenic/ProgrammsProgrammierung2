package atcampusProgrammierung2.zam.beispiele;

public class WrapperDemo {
    public static void main(String[] args) {
        //aufgrund von autoboxing können int und Interger stellvertretend verwenden werden
        Integer i =22;
       // int j= new Integer(27);  //durchgesttrichen da deprecated -einfach ohne Integer Konstruktor machen
        Integer k=null;

        System.out.println(i);
      //  System.out.println(j);
        int l =Integer.parseInt("16"); //kommazahl bei Double ,schauen
        System.out.println(("16" + 2));  //unterschied zeigen
        System.out.println((l + 2));

        String s= new String("Hansi");  //das mach man nicht
    }
}
