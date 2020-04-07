package patrones_creacionales.factory_method;

public class PIzzeriaMyG implements IPizzeria {

    @Override
    public Pizza crearPizza(String tipo) {
        // 
        
        if(tipo.equals("Peperoni")){
            return new Pizza(8, tipo);
        }
        if(tipo.equals("Hawaiana")){
            return new Pizza(8, tipo);
        }
        if(tipo.equals("Peperoni bordes rellenos")){
            return new PizzaBordesRellenos(12, "Peperoni");
        }
        return null;
    }

}