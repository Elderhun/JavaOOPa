package DZ1;

public class Rearlights extends Lights {

    @Override
    public void check() {
        System.out.println("Rear lights are ok");
        
    }

    @Override
    public void TurnOn() {
        System.out.println("Rear lights turn on");
        
    }

    @Override
    public void SwitchOff() {
        System.out.println("Rear lights switch off");
        
    }
    
}
