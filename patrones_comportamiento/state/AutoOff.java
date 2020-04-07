package patrones_comportamiento.state;

public class AutoOff implements IAutoState{

    private final Auto auto;

    public AutoOff(Auto auto) {
        this.auto = auto;
    }

    @Override
    public void on() {
        // TODO Auto-generated method stub
        System.out.println("The auto is on!");
        auto.setCurrentState(auto.getAutoOn());

    }

    @Override
    public void onMove() {
        // TODO Auto-generated method stub
        System.out.println("The auto can't move cuz it's off!");
       

    }

    @Override
    public void off() {
        // TODO Auto-generated method stub
        System.out.println("The auto is already off!");
       

    }


}