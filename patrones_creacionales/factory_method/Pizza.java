package patrones_creacionales.factory_method;

public class Pizza {
    private int cantidadRebanadas;
    private String especialidad;

    public Pizza(int cantidadRebanadas, String especialidad) {
        this.cantidadRebanadas = cantidadRebanadas;
        this.especialidad = especialidad;
    }

    public String toString() {
        return String.format("Pizza: %s de %d rebanadas",  this.especialidad, this.cantidadRebanadas);
    }

}