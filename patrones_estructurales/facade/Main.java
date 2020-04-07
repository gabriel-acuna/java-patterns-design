package patrones_estructurales.facade;

public class Main {

    public static void main(String[] args) {
        /**
         * Facade
         * Provee una interfaz unificada para un
         * conjunto de interfaces en un susbsistema
         * Facade define una interfaz de alto nivel que hace
         * el susbsistema sea mas fácil utilizar
         */

         Facade facade = new Facade();
        facade.encenderComputadora();

         
    }

}