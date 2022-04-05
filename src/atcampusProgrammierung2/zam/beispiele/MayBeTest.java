package atcampusProgrammierung2.zam.beispiele;

public class MayBeTest {
    public static void main(String[] args) {

        MayBe <Double> gehalt= new MayBe<>(2000.38, 2);
        gehalt.print();

        MayBe<Account>mrinKonto=new MayBe<>(new Account("laura", "ATZZZZ", "REIKA"),1);
       // Account.print();

    }
}
