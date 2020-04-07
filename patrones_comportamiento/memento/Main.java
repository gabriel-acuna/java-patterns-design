package patrones_comportamiento.memento;

public class Main {

    public static void main(String[] args) {
        
        /**
         * Memento:
         * Sin violar la encapsulación,captura y extarnaliza el estado
         * interno de un objeto para que luego se pueda restaurar
         */

         User user = new User("Gabriel", 26);

         User userBk = user.getBackUp();
         System.out.println(user.getName());
         System.out.println(user.getAge());

         user.setName("Stefano");

         System.out.println(user.getName());
         System.out.println(user.getAge());


         user.restoreBackUp(userBk);
         System.out.println(user.getName());
         System.out.println(user.getAge());

    }

}