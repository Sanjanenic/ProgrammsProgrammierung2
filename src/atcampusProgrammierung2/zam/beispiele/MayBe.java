package atcampusProgrammierung2.zam.beispiele;

public class MayBe<T> {
    private T data;
    private int status;
//gernerische verion der klasse: der Typ wird dann durch konkreten Typ
    //
    public MayBe(T data, int status) {  //t stoj kao tip podatka u konstruktoru
        this.data = data;
        this.status = status;
    }

   public void print(){
        switch (status){
            case 1:
                break;
            case 2:
                System.out.println("Zugriff gewährt!" + data   );
                break;
            case 3:
                System.out.println("Geht dich nicht an!");
                break;
            default:
                System.out.println("Bitte Status zwieschen 1 und 3 wahlen");
                break;
        }
   }
}
