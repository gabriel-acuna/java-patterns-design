package patrones_estructurales.proxy;

public class Usuario {

    private int nivelPermiso;

    public Usuario (int nivelPermiso) {
        this.nivelPermiso = nivelPermiso;


    }

    /**
     * @param nivelPermiso the nivelPermiso to set
     */
    public void setNivelPermiso(int nivelPermiso) {
        this.nivelPermiso = nivelPermiso;
    }

    /**
     * @return the nivelPermiso
     */
    public int getNivelPermiso() {
        return nivelPermiso;
    }
    

}