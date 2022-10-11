package DZ1;

public class DriverInterface {
    
    public Steering st;
    public PedalBrake pb;
    public PedalGas pg;
    public AC ac;
    public ShiftLever sl;

    public DriverInterface(){
        st = new Steering();
        pb = new PedalBrake();
        pg = new PedalGas();
        ac = new AC();
        sl = new ShiftLever();
    }

    public void SteeringRotation() {
        st.rotate();
    }

    public void speedUp(){
        pg.pressPedalG();
    }

    public void speedDown(){
        pb.pressPedalB();
    }

    public void startAc(){
        ac.startAC();
    }

    public void gearUp(int level){
        sl.UpShift(level);
    }

    public void gearDown(int level){
        sl.DownShift(level);
    }

    public void activeAC(){
        ac.startAC();
    }
}
