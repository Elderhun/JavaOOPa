package DZ1;

public class GazolineEngine extends Engine  {

    @Override
    protected void startInternal() {
        System.out.println("Start gazoline engine");
        
    }

    @Override
    protected void stoptInternal() {
        System.out.println("Stop gazoline engine");
        
    }

    @Override
    protected void throttleUpInternal(int level) {
        System.out.println("Open throttle");
        
    }
    
    @Override
    public void check() {
        System.out.println("Ок");
    }

}
