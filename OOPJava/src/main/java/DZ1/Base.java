package DZ1;

import java.util.List;

public class Base {

    private Engine engine;
    private Transmission transmission;
    private Wheel wheel;
    private Door door;
    private Lights headlights;
    private Lights realLights;
    public boolean moving;
    private List<Checkable> checkables;
    

    public Base(){

        headlights = new Headlights();
        realLights = new Rearlights();
        engine = new GazolineEngine();
        wheel = new Wheel();
        door = new Door();
        transmission = new Transmission();
        checkables = List.of(engine, wheel, transmission, headlights, realLights);
    }

    public void open(){
        
        if(wheel.getWheelRotate()){
            System.out.println("Can't open while driving");
        }
        else{
            door.openDoor();
            door.closeDoor();
        }
        
        
    }


    public void start() {
        engine.startEngine();
    }

    public int drive() {
        
        int gear = 1;
        if(engine.getWork()){

            transmission.switchGear(gear);
            wheel.rotate();
            this.moving = true;
        }
        
        return gear;
       
    }

    public void slow(){
        wheel.slowDown();
    }

    public void wheelTurn(){
       
        if(wheel.getWheelRotate()){
            wheel.frontWheels();
        }
        else{
            System.out.println("The car is standing");
        }
        
    }

    public void wheelStop(){
        if(wheel.getWheelRotate() == false){
            System.out.println("Stop wheels");
        }
    }

    public boolean engineSS(){
        return engine.getWork();
    }

    public void stop() {
        engine.stopEngine();
    }
    
    public void check() {
        System.out.println("Ок");
    }
   
    public void HeadlightsTurnOn(){
        headlights.TurnOn();
    }

    public void HeadlightsSwitchOff(){
        headlights.SwitchOff();
    }

    public void RearlightsTurnOn(){
        realLights.TurnOn();
    }
    
    public void RearlightsSwitchOff(){
        realLights.SwitchOff();
    }
    
    
    
    public void checkAll(){
        for (Checkable checkable : checkables) {
            checkable.check();
        }
    }

}

