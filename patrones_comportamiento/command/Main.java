package patrones_comportamiento.command;

public class Main {

    public static void main(String[] args) {
        
        /**
         * Command 
         * Encapsula una petición como una petición
         * especifica un forma simple de separar la ejecución de un
         * comamdo del entorno que generó dicho comando
         */

          IDevice tv = new TV();
          ICommand on = new OnDevice(tv);
          ICommand off = new OffDevice(tv);

          on.operacion();
          off.operacion();




    }

}