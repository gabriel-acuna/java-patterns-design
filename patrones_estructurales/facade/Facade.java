package patrones_estructurales.facade;

public class Facade {

    private Computadora computadora;

    public Facade() {
        ITeclado teclado = new Teclado();
        IMouse mouse = new Mouse();
        this.computadora = new Computadora(teclado, mouse);
    }

    /**
     * @return the computadora
     */
    public void encenderComputadora() {
        computadora.encender();
    }

}