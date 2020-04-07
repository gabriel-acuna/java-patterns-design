package patrones_creacionales.singleton;

public class ConexionDB {

    private static ConexionDB conexionDB;
    private ConexionDB() {
       
    }

    public synchronized static ConexionDB obtenerConexion (){
        if(conexionDB == null){
            conexionDB = new ConexionDB();
        
    }
    return conexionDB;
        }
}