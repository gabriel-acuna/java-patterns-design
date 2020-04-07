package patrones_comportamiento.command;

public class OnDevice  implements ICommand{

    private IDevice device;

    public OnDevice(IDevice device){
        this.device = device;
    }

    public  void operacion(){
        device.on();
    }

}