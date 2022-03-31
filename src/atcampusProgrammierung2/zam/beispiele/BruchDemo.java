package atcampusProgrammierung2.zam.beispiele;

public class BruchDemo {
    public static void main(String[] args) {
        Bruch b1=new Bruch(2,4);
        Bruch b2=new Bruch(45,8);

        Bruch mult=b1.multiplicate(b2);
        mult.print();


    }
}
