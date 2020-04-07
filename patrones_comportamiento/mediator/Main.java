package patrones_comportamiento.mediator;
public class Main {

    public static void main(String[] args) {
        /**
         * Madiator
         * Define un objeto que encapsula como interactuan 
         * un conjunto de objetos. Mediator promueve el 
         * acoplamiento suelto al evitar que los objetos se
         *  refieran entre sí de manera explícita, y le permite
         *  variar sus interacciones de forma independiente
         */

        Usuario gabo = new Usuario("Gabo"), leo = new Usuario("Leo");
        SalaChat chat = new SalaChat();
        chat.addParticipantes(gabo);
        chat.addParticipantes(leo);
        chat.enviarMensaje(leo, gabo, "Send nudes XD");
    }

}