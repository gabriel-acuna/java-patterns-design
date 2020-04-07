package patrones_comportamiento.command;

public class TV  implements IDevice{

    public void on(){
        System.out.println("Tv enecendida");
    }

    public void off(){
        System.out.println("Tv apagada");
    }

}