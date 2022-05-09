package atcampusProgrammierung2.zam.uebungen;

public class OrdnerAPP {
    public static void main(String[] args) {

        Article a =new Article("Brot",1,100.0);
        Article b =new Article("Milch", 2,1.0);
        Order o1= new Order(5);

        o1.addArticle(a);
        o1.addArticle(b);

        System.out.println(o1);

       double sumOrdner= o1.sumOrdner();
        System.out.println(sumOrdner);

        int grossteNumber=o1.findMostExpensiveArticle();
        System.out.println(grossteNumber);


       double ergebniss= o1.findMostExpensiveOrdnerPosition();
        System.out.println(ergebniss);

        double sumTax= o1.calculateTax();
        System.out.println(sumTax);
    }
}
