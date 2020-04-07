package patrones_comportamiento.iterator;

public class Main {

    public static void main(String[] args) {
        /**
         * Iterator
         * Proporciona una vía para acceder a elementos de una agregación
         * de manera secuencial sin exponer los mismos resaltando la representación
         */

         GuiaTelefonica guia = new GuiaTelefonica();
         guia.add("0985910098");
         guia.add("0985949158");
         guia.add("0985948768");
         guia.add("0999491509");

         IIterador iterador = new IteradorGuia(guia);

         while (iterador.hasNext()) {
             System.out.println(iterador.next());
         }


    }

}