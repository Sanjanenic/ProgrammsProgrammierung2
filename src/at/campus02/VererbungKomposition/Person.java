package at.campus02.VererbungKomposition;

public class Person {

    public String firstname;
    public String lastName;
    boolean loveChokolate;

    public Person(String firstname, String lastName) {
        this.firstname = firstname;
        this.lastName = lastName;
    }
     public void loveChokolate(){
        String text= null;
        if (loveChokolate){
            text= firstname + " " + lastName + " eat Chokolate";
            System.out.println(text);
        }
        else {
            text = firstname + " " + lastName + "  das not t eat Chokolate";
            System.out.println(text);
        }
     }

}
