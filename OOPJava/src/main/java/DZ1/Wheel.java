package DZ1;

public class Wheel implements Checkable{

    
    private boolean wheelRotate = false;

    public void frontWheels() {
        System.out.println("Front wheels turn");
        
    }


    public void rotate() {

        System.out.println("The wheels are spinning");
        this.wheelRotate = true;
        
    }
    
    public void slowDown(){
        System.out.println("wheels slow down");

    }


    public void notRotate(){
        System.out.println("Wheels stopped");
        this.wheelRotate = false;
    }

    public boolean getWheelRotate(){
        return wheelRotate;
    }

    @Override
    public void check() {
        System.out.println("Ok");
    }

}
