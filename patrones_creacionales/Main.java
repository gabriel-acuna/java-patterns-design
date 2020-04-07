package patrones_creacionales;

public class Main {
    public static void main(String[] args) {

        // Simple Factory
        Pizzaria pizzeriaLocal = new Pizzaria();
        Pizza pizzaPeperoni = pizzeriaLocal.crearPizaMediana();
        System.out.println(pizzaPeperoni);


    }
}