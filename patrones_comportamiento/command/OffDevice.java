package patrones_comportamiento.command;

public class OffDevice implements ICommand{

    private IDevice device;

    public OffDevice(IDevice device){
        this.device = device;
    }

    public  void operacion(){
        device.off();
    }

}