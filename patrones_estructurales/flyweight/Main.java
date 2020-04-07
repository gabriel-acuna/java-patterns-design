package patrones_estructurales.flyweight;

public class Main {

    public static void main(String[] args) {
        /**
         *  Flyweight
         *  se el uso compartido para admitir
         *  eficientemente números de objetos finos de forma eficiente 
         */

        NubeFactory factory = new NubeFactory();
         for (int i = 0; i < 100; i++) {
             Nube nube = factory.getNube(TipoNube.Chica);
         }

         for (int i = 0; i < 200; i++) {
            Nube nube = factory.getNube(TipoNube.Mediana);
        }

        for (int i = 0; i < 300; i++) {
            Nube nube = factory.getNube(TipoNube.Grande);
        }

        System.out.println(factory.countNubesMap());
    }

}