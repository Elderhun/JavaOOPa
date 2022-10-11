package DZ1;


public class Steering {

    private boolean wheelTurn;

    public void rotate() {
        System.out.println("The steering wheel is spinning");
        this.wheelTurn = true;
    }

    public boolean getWheelRotate(){
        return wheelTurn;
    }

}
