package patrones_comportamiento.state;

public class Auto  implements IAutoState{

    private IAutoState autoOn;
    private IAutoState autoOnMove;
    private IAutoState autoOff;
    private IAutoState currentState;

    public Auto() {
       this.autoOn = new AutoOn(this);
       this.autoOnMove = new AutoOnMove(this);
       this.autoOff = new AutoOff(this);
       this.currentState = this.autoOff;
    }
    /**
     * @return the autoOn
     */
    public IAutoState getAutoOn() {
        return autoOn;
    }
    /**
     * @return the autoOff
     */
    public IAutoState getAutoOff() {
        return autoOff;
    }
    /**
     * @return the autoOnMove
     */
    public IAutoState getAutoOnMove() {
        return autoOnMove;
    }
    /**
     * @return the currentState
     */
    public IAutoState getCurrentState() {
        return currentState;
    }

    /**
     * @param autoOff the autoOff to set
     */
    public void setAutoOff(IAutoState autoOff) {
        this.autoOff = autoOff;
    }
    /**
     * @param autoOn the autoOn to set
     */
    public void setAutoOn(IAutoState autoOn) {
        this.autoOn = autoOn;
    }
    /**
     * @param autoOnMove the autoOnMove to set
     */
    public void setAutoOnMove(IAutoState autoOnMove) {
        this.autoOnMove = autoOnMove;
    }
    /**
     * @param currentState the currentState to set
     */
    public void setCurrentState(IAutoState currentState) {
        this.currentState = currentState;
    }

    @Override
    public void on() {
        // TODO Auto-generated method stub
        this.currentState.on();

    }

    @Override
    public void onMove() {
        // TODO Auto-generated method stub
        this.currentState.onMove();

    }

    @Override
    public void off() {
        // TODO Auto-generated method stub
        this.currentState.off();

    }

}