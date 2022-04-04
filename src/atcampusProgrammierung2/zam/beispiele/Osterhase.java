package atcampusProgrammierung2.zam.beispiele;

public class Osterhase {
    private static int heaschenZaehler=1;  //statische variable, es gibt nur einmal
    private int anzahlVersteckteEier;  //atribut und lokal variable haben gleiche namen und mit this. das funktioniert
  private String name;
  private int heaschenNummer;
  private HasenReligion personlicherGlaube;

    public Osterhase(String name, int anzahlVersteckteEier, HasenReligion personlicherGlaube){
      this.name=name;
      this.anzahlVersteckteEier=anzahlVersteckteEier;
      heaschenNummer=heaschenZaehler++;
      this.personlicherGlaube=personlicherGlaube;
  }

  public Osterhase(String name){  //das ist zweite Konstruktor
      this.name=name;
      this.anzahlVersteckteEier=0;
      heaschenNummer=heaschenZaehler++;
      //jeder Hase soltte eine eigene nummer haben, wegen der Steuer zB
      personlicherGlaube=HasenReligion.LANGEOHRENZEUGER;                            //svaki novi zec ce dobiti svoj broj pomocu ovog ++
      //ALTERNATIVE ZUGRIFF ODER VON AUSSER WENN NICHT PRIVAT WÄRE IST:Osterhease.heaschenZahler
  }
    public int getHeaschenNummer() {
        return heaschenNummer;
    }

    @Override  //diese methode solte text zurück geben, einen String  mit name,.. Ovo je za fin ispis na konzoli
    //methode ruft sich automatisch wenn einen objekt ausgeben wollte sein
    public String toString() {
        return name +" versteckte "+ anzahlVersteckteEier + " viele Eier" +" glaubt an: " + personlicherGlaube;

    }
    //    public void aendereahzahlEier(int anzahlVersteckteEier){
//        if(anzahlVersteckteEier>=0) {
//            //anzahlVersteckteEier ist parametar
//            //locale variable oder parameter mit gleichen Namen wrden bevorzugt
//            //this parametar zeigt auf die aktuelle instanz
//            this.anzahlVersteckteEier = anzahlVersteckteEier;
//        }
//    }
//    //methoden uberladen (zwei methoden haben gleich name)-unterscheidet sich durch typ/anzahl der parametar
//    //hier haben wir eine ohne parametar - dann muss Osterhase ein Dutzend Eier verstecken
//    public void aenderahzahlEier(){
//        anzahlVersteckteEier= 12;
//        //this.anzahl..wäre möglich aber nicht notwendig, da keine Namensgleichkeit
//
//    }

    public int getAnzahlVersteckteEier() {
        return anzahlVersteckteEier;
    }

    public void setAnzahlVersteckteEier(int anzahlVersteckteEier) {
        if(anzahlVersteckteEier>=0) {
            this.anzahlVersteckteEier = anzahlVersteckteEier;
        }
    }

    public int gibMirEinZahlDerVersteckeEier(){
        return anzahlVersteckteEier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
