package at.campus02.VererbungKomposition;

public class Dog {
    public String name;
    public  String eyeColor;
    public int weight;

    public boolean apprecietesOtherDog;

    //jos jedan konstruktor dodati , bez parametara, ovaj
    //moze java automatski pozvati, samo ovakav bez parametara
//    public Dog(){
//        this.name="Hund";
//        this.eyeColor ="black";
//        this.weight=17;
//        this.apprecietesOtherDog=true;
//    }

    public Dog(String name, String eyeColor,int weight, boolean apprecietesOtherDog){
        this.name =name;
        this.eyeColor= eyeColor;
        this.weight= weight;
        this.apprecietesOtherDog= apprecietesOtherDog;

    }

    public void bark(){
        System.out.println(name + " barks");
    }

    @Override
    public String toString() {
        String text = null;
        if(apprecietesOtherDog){
            text=name + " admires other dogs with their sparkly "+eyeColor + " eyes";
        }
        else {
            text=name + "  bark until all oher dogs left";
        }
        return text;
    }
}
