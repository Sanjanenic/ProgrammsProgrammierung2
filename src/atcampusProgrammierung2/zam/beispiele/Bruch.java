package atcampusProgrammierung2.zam.beispiele;

public class Bruch {

private int numerator;
private int denominator;
private static int wieVileObjekte=0;


//Konstruktor
    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator=denominator;
   ++wieVileObjekte;
    }

    public static int getWieVileObjekte() {
        return wieVileObjekte;
    }

    @Override
    public String toString() {
        return "Bruch:" +numerator+" / "+ denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double toDecimal(){
        return (double)numerator/denominator;
    }
    public void print(){
        System.out.println(numerator+" / "+denominator);

    }
 public Bruch multiplicate(Bruch b2)
 {
        Bruch erg=new Bruch(numerator,denominator);
        erg.numerator= erg.numerator*b2.numerator;
        erg.denominator= erg.denominator*b2.denominator;
     ++wieVileObjekte;  //ovo je isto kao i: wievileObjekte= wievieleObjektte+1
        return erg;


 }

}



