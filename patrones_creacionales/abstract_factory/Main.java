package patrones_creacionales.abstract_factory;

public class Main {
    public static void main(String[] args) {
        /**
         Abstract Factory: Provee una interfaz para 
         crear familias de objetos relacionados o dependientes
         sin especificar su calse en concreto
         **/

         SamsungStore samsungStore = new SamsungStore();
         AppleStore appleStore =new AppleStore();

         IComputadora mac = appleStore.crearComputadora();
         ITablet ipad = appleStore.crearTablet();


         IComputadora pc = samsungStore.crearComputadora();
         ITablet tablet  = samsungStore.crearTablet();

         
    }
}