package DZ1;

public class Car {
    
    Base base;
    DriverInterface din;

    public Car() {

        base = new Base();
        din = new DriverInterface();
        
    }


    
    public void preparation(){
        base.open();
        base.start();
        base.HeadlightsTurnOn();
        base.RearlightsTurnOn();
    }   

    public void theCarIsMoving(){
        
        din.gearUp(base.drive());

    }
    
    public void speedup(){
        if(base.engineSS()){
            din.speedUp();
        }
        
    }

    public void turn(){
        din.SteeringRotation();
        base.wheelTurn();
    }

    public void speeddown(){
        din.speedDown();

        if(base.engineSS()){
            din.gearDown(base.drive());
            base.slow();
        }
        
    }
    

    public void stopCar(){
        din.speedDown();
        base.wheelStop();
        if(base.engineSS()){
            base.stop();
            base.HeadlightsSwitchOff();
            base.RearlightsSwitchOff();
        }
        
    }

    public void ac(){
        din.activeAC();
    }

    public static void main(String[] args) {
    
        Car car = new Car();
        Base base = new Base();

        base.checkAll();
        car.preparation();
        car.ac();
        car.theCarIsMoving();
        car.speedup();
        car.turn();
        car.speeddown();
        car.stopCar();
        
    }
    
}
