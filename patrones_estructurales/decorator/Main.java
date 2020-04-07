package patrones_estructurales.decorator;

public class Main {

    public static void main(String[] args) {
        
        /**
         * Decoractor
         * Agraga responsabilidad a un objeto de manera dinámica.
         * Los decoadores proveen una alternativa fexible  a la extención
         * de funxionalidad medianete la herencia
         * 
         */

         IPizza pizzaPeperoni = new QuesoExtra(new PizzaPeperoni());

         System.out.println(pizzaPeperoni.descripcion());
         System.out.println(pizzaPeperoni.precio());

         IPizza pizzaHawaiana = new OrillaRellena( new QuesoExtra(new PizzaHawaiana()));

         System.out.println(pizzaHawaiana.descripcion());
         System.out.println(pizzaHawaiana.precio());



    }

}