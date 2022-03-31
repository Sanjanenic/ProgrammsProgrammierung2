package atcampusProgrammierung2.zam.beispiele;

public class Bruch {

private int numerator;
private int denominator;


//Konstruktor
    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator=denominator;
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
        return numerator/denominator;
    }
    public void print(){
        System.out.println(numerator+"/"+denominator);

    }
public double FractionMultiplicate(){

}


}
