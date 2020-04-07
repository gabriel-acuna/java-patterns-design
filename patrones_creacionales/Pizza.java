package patrones_creacionales;

public class Pizza {
    private  int cantidadRebanadas;

    public Pizza(final int cantidadRebanadas) {
        this.cantidadRebanadas = cantidadRebanadas;
    }

    
    public String toString(){
        return String.format("La pizza tiene %d rebanadas", this.cantidadRebanadas);
    }

}