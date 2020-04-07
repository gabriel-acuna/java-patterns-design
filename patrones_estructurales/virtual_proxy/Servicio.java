package patrones_estructurales.virtual_proxy;

public class Servicio  implements IServicio{

    public void leer(){
        System.out.println("Leer!");
    }

    public void escribir(){

       System.out.println("Escrbir");
    }

    public void actualizar(){
        System.out.println("Actualizar!");
    }

    public void eliminar(){
       System.out.println("Eliminar!");
    }


}