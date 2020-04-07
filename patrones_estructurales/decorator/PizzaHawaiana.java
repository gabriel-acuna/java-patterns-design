package patrones_estructurales.decorator;

public class PizzaHawaiana implements IPizza{

    public String descripcion(){
        return "Pizza Hawaiana";
    }
    
    public float precio(){
        return 7.5f;
    }


}