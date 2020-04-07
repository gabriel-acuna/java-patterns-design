package patrones_comportamiento.state;

public class Auto  implements IAutoState{

    private IAutoState autoOn;
    private IAutoState autoOnMove;
    private IAutoState autoOff;
    private IAutoState currentState;

    public Auto() {
       this.autoOn = new AutoOn();
       this.autoOnMove = new AutoOnMove();
       this.autoOff = new AutoOff();
    }

    @Override
    public void on() {
        // TODO Auto-generated method stub

    }

    @Override
    public void onMove() {
        // TODO Auto-generated method stub

    }

    @Override
    public void off() {
        // TODO Auto-generated method stub

    }

}