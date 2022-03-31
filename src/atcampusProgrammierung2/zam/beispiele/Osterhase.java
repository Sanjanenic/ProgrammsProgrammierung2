package atcampusProgrammierung2.zam.beispiele;

public class Osterhase {
    private int anzahlVersteckteEier;  //atribut und lokal variable haben gleiche namen und mit this. das funktioniert
  private String name;

  public Osterhase(String name, int anzahlVersteckteEier){
      this.name=name;
      this.anzahlVersteckteEier=anzahlVersteckteEier;
  }
  public Osterhase(String name){  //das ist zweite Konstruktor
      this.name=name;
      this.anzahlVersteckteEier=0;
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
