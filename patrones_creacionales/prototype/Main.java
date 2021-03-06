package patrones_creacionales.prototype;

public class Main {

    public static void main(String[] args) {
        /**
         * Prototupe:
         * Especifica las clases de objetosa crear usando una
         * instancia como prototipo, y crea nuevos objetos
         * copiando este prototipo
         * 
         */

         Enemigo enemigoBase = new Enemigo("imagen1.png", 0, 100, 2);
         Enemigo enemigo1 = new Enemigo(enemigoBase);
         Enemigo enemigo2 = new Enemigo(enemigoBase);
         Enemigo enemigo3 = new Enemigo(enemigoBase);

         enemigo1.setPosX(100);
         enemigo2.setPosX(150);
         enemigo3.setPosX(200);

         Enemigo enemigoBase2 = new Enemigo("imagen1.png", 0, 200, 2);
         Enemigo enemigo4 = enemigoBase2.clone();
         Enemigo enemigo5 = enemigoBase2.clone();
         Enemigo enemigo6 = enemigoBase2.clone();

         enemigo4.setPosX(100);
         enemigo5.setPosX(150);
         enemigo6.setPosX(200);
    }

}