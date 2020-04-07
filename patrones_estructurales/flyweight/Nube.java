package patrones_estructurales.flyweight;

import java.time.chrono.ThaiBuddhistChronology;

public class Nube {
    private TipoNube tipoNube;
    private String imagen;
    private int posX, posY;


    public Nube(TipoNube tipoNube, String imagen , int posX, int posY){
        this.tipoNube =tipoNube;
        this.imagen = imagen;
        this.posX = posX;
        this.posY = posY;

    }

    /**
     * @return the tipoNube
     */
    public TipoNube getTipoNube() {
        return tipoNube;
    }

    /**
     * @param tipoNube the tipoNube to set
     */
    public void setTipoNube(TipoNube tipoNube) {
        this.tipoNube = tipoNube;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
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
     * @return the posX
     */
    public int getPosX() {
        return posX;
    }

    /**
     * @param posY the posY to set
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * @return the posY
     */
    public int getPosY() {
        return posY;
    }
}