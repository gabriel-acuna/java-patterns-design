package patrones_estructurales.decorator;

public class QuesoExtra implements IPizza{

    private IPizza pizza;

    public QuesoExtra(IPizza pizza) {
        this.pizza = pizza;
    }

    public String descripcion(){
        return pizza.descripcion()+ " queso extra";
    }
    
    public float precio(){
        return pizza.precio() + 2f;
    }

}