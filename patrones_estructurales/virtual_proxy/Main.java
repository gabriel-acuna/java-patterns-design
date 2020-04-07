package patrones_estructurales.virtual_proxy;

public class Main {
    /**
     * Permite restringir funcionalidad
     */

    public static void main(String[] args) {

        

        IServicio servicio = new ProxyServicio(new Usuario(4));
        servicio.escribir();
        servicio.leer();
        servicio.actualizar();
        servicio.eliminar();


    }
}