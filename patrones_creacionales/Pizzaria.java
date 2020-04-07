package patrones_creacionales;

public class Pizzaria {
    public Pizza crearPizaChica() {
        return new Pizza(6);

    }

    public Pizza crearPizaMediana() {
        return new Pizza(8);

    }

    public Pizza crearPizaGrande() {
        return new Pizza(12);

    }

}