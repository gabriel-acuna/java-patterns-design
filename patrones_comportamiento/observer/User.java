package patrones_comportamiento.observer;

public class User implements IObserver{

    public void notification(String message){
        System.out.println(message);
    }

   

}