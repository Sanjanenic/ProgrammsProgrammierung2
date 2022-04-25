package at.campus02.VererbungKomposition;

public class Beagle extends Dog {

    public String lovedFood;


        //Dog () construktor ist automatisch angeruft
        //this Dog() constructor
        //ovo mozemo i eksplicitno pozivajuci roditelj konstruktor(uradjeno je automatski)
        //super();

    //situacija kad nememo defoltni konstruktor
    //konstruktor ima bar jedan parametar
    //moramo eksplicitno zvati konstruktor sa "Super"
    //kao parametri se pisu sad svi atributi iz super klase i ovaj noi iz

        public Beagle(String name, String eyeColor, int weight,boolean apprecietesOtherDog , String lovedFood){
            super(name, eyeColor,weight,apprecietesOtherDog);

        this.lovedFood=lovedFood;
    }

public void bark(){
            super.bark();  // super se referencira na eltern klasu,
    // bez toga bi bilo rekurzija jer bi metod pozivao sam sebe
}


}
