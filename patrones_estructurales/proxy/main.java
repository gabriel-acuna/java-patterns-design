package patrones_estructurales.proxy;

public class main {
    /**
     * Permite restringir funcionalidad
     */

    public static void main(String[] args) {

        

        IServicio servicio = new ProxyServicio(new Servicio(), new Usuario(4));
        servicio.escribir();
        servicio.leer();
        servicio.actualizar();
        servicio.eliminar();


    }
}