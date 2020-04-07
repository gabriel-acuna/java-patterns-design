package patrones_estructurales.adapter;

public class Main {

    public static void main(String[] args) {
        /**
         * Adapter:
         * Convierte la interfaza de una calse en otra interfaz
         * que el cliente espera. 
         */

         ISQLConnection connection = new DBAdapter(new MongoDBConnection());
         connection.connect();
         String result = connection.runQuery();

         System.out.println(result);
    }

}