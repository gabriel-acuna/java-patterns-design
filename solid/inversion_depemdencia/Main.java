package solid.inversion_depemdencia;

public class Main {

    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();
        Mouse mouse = new Mouse();

        Computadora pc = new Computadora(teclado, mouse);
        pc.encender();
    }
}