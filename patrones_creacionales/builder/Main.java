package patrones_creacionales.builder;

public class Main {
    /*
     * Builder: Separa la construcción de un objeto complejo de su representación
     * para que el mismo proceso de construcción pueda crear repesentaciones
     * diferentes
     */

    public static void main(String[] args) {

        Usuario gabo = Usuario.Make("Gabriel", "Acuña")
        .setMedioContacto(true)
        .setEmail("gstef09@hotmail.com")
        .setTelefono("0985810098")
                .build();

        System.out.print(gabo);
    }
}