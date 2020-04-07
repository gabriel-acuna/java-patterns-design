package patrones_estructurales.decorator;

public class OrillaRellena implements IPizza{

    private IPizza pizza;

    public OrillaRellena(IPizza pizza) {
        this.pizza = pizza;
    }

    public String descripcion(){
        return pizza.descripcion()+ " orilla rellena";
    }
    
    public float precio(){
        return pizza.precio() + 4f;
    }

}