package DZ1;

public abstract class Engine implements Checkable {
    
    private boolean work;
    
    public void startEngine() {
        System.out.println("Start engine");
        this.work = true;
        startInternal();
    }

    protected abstract void startInternal();

    protected abstract void stoptInternal();

    protected abstract void throttleUpInternal(int level);

    

    public void stopEngine() {
        System.out.println("Stop engine");
        this.work = false;
        stoptInternal();
    }




    public void throttleUp(int level) {
        
        if(this.work) {
            System.out.printf("throttle open %d, speed is rising", level );
            throttleUpInternal(level);
        
        }
        
        else{
            System.out.println("Engine not running");
        }
    
        
    }


    public boolean getWork(){
        return work;
    }

    

}



