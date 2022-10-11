package DZ1;

public class Headlights extends Lights {

    @Override
    public void check() {
        System.out.println("Headlights are ok");
        
    }

    @Override
    public void TurnOn() {
        System.out.println("Headlights turn on");
        
    }

    @Override
    public void SwitchOff() {
        System.out.println("Headlights switch off");
        
    }
    
}
