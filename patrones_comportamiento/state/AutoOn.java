package patrones_comportamiento.state;

public class AutoOn implements IAutoState{

    private final Auto auto;

    public AutoOn(Auto auto) {
        this.auto = auto;
    }

    @Override
    public void on() {
        // TODO Auto-generated method stub
        System.out.println("The auto is on!");

    }

    @Override
    public void onMove() {
        // TODO Auto-generated method stub
        System.out.println("The auto is on move!");
        auto.setCurrentState(auto.getAutoOnMove());

    }

    @Override
    public void off() {
        // TODO Auto-generated method stub
        System.out.println("The auto is off!");
        auto.setCurrentState(auto.getAutoOff());

    }

}