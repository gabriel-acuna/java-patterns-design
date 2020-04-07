package patrones_comportamiento.state;

public class AutoOnMove implements IAutoState{

    private final Auto auto;

    public AutoOnMove(Auto auto) {
        this.auto = auto;
    }

    @Override
    public void on() {
        // TODO Auto-generated method stub
        System.out.println("The auto is already on!");
      

    }

    @Override
    public void onMove() {
        // TODO Auto-generated method stub
        System.out.println("The auto keep moving!");
       

    }

    @Override
    public void off() {
        // TODO Auto-generated method stub
        System.out.println("The auto is off!");
        auto.setCurrentState(auto.getAutoOff());
       

    }


}