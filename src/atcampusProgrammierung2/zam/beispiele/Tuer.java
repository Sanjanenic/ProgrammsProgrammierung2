package atcampusProgrammierung2.zam.beispiele;

public class Tuer {
    private double hoeche;
    private double breite;
    private Himelrichtung richtungVonOffnen;

    public Tuer(double hoeche, double breite, Himelrichtung richtungVonOffnen) {
        this.hoeche = hoeche;
        this.breite = breite;
        this.richtungVonOffnen = richtungVonOffnen;

    }

    public double getHoeche() {
        return hoeche;
    }

    public void setHoeche(double hoeche) {
        this.hoeche = hoeche;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public Himelrichtung getRichtungVonOffnen() {

        return richtungVonOffnen;
    }

    @Override
    public String toString() {
        return "Tuer{" +
                "hoeche=" + hoeche +
                ", breite=" + breite +
                ", richtungVonOffnen=" + richtungVonOffnen +
                '}';
    }

    public void setRichtungVonOffnen(Himelrichtung richtungVonOffnen) {
        this.richtungVonOffnen = richtungVonOffnen;
        richtungVonOffnen=Himelrichtung.NORDEN;
    }
}
