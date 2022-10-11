package DZ1;

public class Transmission implements Checkable{

   private int grNumber;
    
    public void switchGear(int number) {
        this.grNumber = number;
        System.out.printf("Speed ​​switched to %d%n", number);
    }

    public int getGrNumber(){
        return grNumber;
    }
    
    @Override
    public void check() {
        System.out.println("Ok");
    }
}
