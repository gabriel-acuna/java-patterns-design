package patrones_creacionales.singleton;

public class Main {

    public static void main(String[] args) {
        
        /**
         * Singleton:
         * Asegura que una clase tenga solo
         * una instancia, y provea un punto de acceso 
         * gobal a la instacia
         */
       // ConexionDB conexion = ConexionDB.obteberConexion();

       //Singleton concurente

       Thread t1 = new Thread(new Runnable(){
           public void run(){
            ConexionDB conexion = ConexionDB.obtenerConexion();
            System.out.println(conexion.hashCode());
            
           }
       });
    

    Thread t2 = new Thread(new Runnable(){
        public void run(){
         ConexionDB conexion = ConexionDB.obtenerConexion();
         System.out.println(conexion.hashCode());
         
        }
    });

    t1.start();
    t2.start();
 }



}