package patrones_creacionales.prototype;

public class Enemigo {
    private String imagen;
    private int posX, posY, cantidadVida;

    public Enemigo(String imagen, int posX, int posY, int cantidadVida) {
        this.imagen=imagen;
        this.posX = posX;
        this.posX = posY;
        this.cantidadVida = cantidadVida;

    }

    public Enemigo(Enemigo enemigo) {
        this.setImagen(enemigo.getImagen());
        this.setPosX(enemigo.getPosX());
        this.setPosY(enemigo.getPosY());
        this.setCantidadVida(enemigo.getCantidadVida());
    }

    public Enemigo clone(){
        return this;

    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @return the posX
     */
    public int getPosX() {
        return posX;
    }

    /**
     * @return the posY
     */
    public int getPosY() {
        return posY;
    }

    /**
     * @return the cantidadVida
     */
    public int getCantidadVida() {
        return cantidadVida;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @param posX the posX to set
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }


    /**
     * @param posY the posY to set
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * @param cantidadVida the cantidadVida to set
     */
    public void setCantidadVida(int cantidadVida) {
        this.cantidadVida = cantidadVida;
    }
}