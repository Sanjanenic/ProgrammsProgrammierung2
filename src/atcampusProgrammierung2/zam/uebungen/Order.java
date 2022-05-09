package atcampusProgrammierung2.zam.uebungen;

import java.util.Arrays;

public class Order {
//ovdje su definicije atributa
    private int nrArticles;
    private int capacityOrdner;
    private Article articles [];


//konstruktor u kojem se inicijalizuju atributi
    //ovdje mi kao parametar treba samo ovaj jedan jer
    //ostali su u zadtku definisani da se ovako u konstruktoru odrede
    public Order( int capacityOrdner) {

        nrArticles = 0;

        this.capacityOrdner = capacityOrdner;

        this.articles = new Article[capacityOrdner] ;
    }

        public int getNrArticles() {
            return nrArticles;
        }

        public int getCapacityOrdner() {
            return capacityOrdner;
        }

    @Override
    public String toString() {
        return "Order{" +
                "articles=" + Arrays.toString(articles) +
                '}';

        }

    public void addArticle (Article a){
        //TO DO dodati article a u niz
for(int i =0; i<articles.length; i++){
    if(articles[i]==null){
        articles[i]=a;
        break;
    }
}
    }


    public  int findMostExpensiveArticle(){

        double grosstePreis=articles[0].getPrice();

        int index=0;
        //pomocna varijabla za racunanje indexa broja u nizu

        for(int i=0; i< articles.length; i++){
            if(articles[i]!=null && grosstePreis <  articles[i].getPrice()){     //ova for if kombinacija sluzi za naci najmanji broj u nizu,
                // za najveci samo obrunti znak kleinsteZahl<niz[i] bi bilo
                grosstePreis=articles[i].getPrice();
                index=i;
            }
        }
       return articles[index].getNumber();

    }

public double findMostExpensiveOrdnerPosition (){
        double position=0;
        //TO DO proci kroz array
    //naci najveci preis*Number
    for(int i=0; i< articles.length; i++){
        if(articles[i]!=null && position <  articles[i].getPrice()){     //ova for if kombinacija sluzi za naci najmanji broj u nizu,
            // za najmanji samo obrunti znak kleinsteZahl>niz[i] bi bilo
            position=articles[i].getPrice()*articles[i].getNumber();

        }
    }
        return position;
    }

public double sumOrdner (){
        double sum=0.0;
        //TO DO izracunati zbir cijena svih artikala u narudzbi
    for(int i =0; i<articles.length; i++){

        //if mi treba jer kad je u nizu "null" ne mogu racunati
        if (articles[i] != null) {
            sum = sum + articles[i].getPrice(); //ovako pristupam atributu}
        }

        }
        return sum;


}
public double calculateTax(){
    //TO DO vratiti vrijednost poreza na naruzdbu
    double summTax=0.0;
    for (int i =0; i<articles.length; i++) {
       if(articles[i] != null && articles[i].getPrice()<=20 ) {
           summTax=summTax+(articles[i].getPrice()*0.05) ; //ovo racuna 5%
       }
       else if (articles[i] != null && articles[i].getPrice()>20 ){
           summTax=summTax+(articles[i].getPrice()*0.20) ; //ovo racuna 20% od cijene
       }
    }
    return summTax;
}


}
