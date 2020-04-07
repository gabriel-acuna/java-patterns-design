package patrones_comportamiento.observer;

public class Main {
    public static void main(String[] args) {
        
        /**
         *  Observer
         * Define una depedemcia uno a muchos entre objetos
         * cuando un objeto cambia de estado, todos los objetos 
         * dependientes son noficados y actualizados automaticamente
         */
        
         Product product = new Product("AVO-00001","Avocado", 200);
         User u1 = new User();
         User u2 = new User();
         User u3 = new User();

         product.addObserver(u1);
         product.addObserver(u2);

         product.sell(30);



    }
}