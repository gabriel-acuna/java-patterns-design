package patrones_comportamiento.visitor;

public class Main {

    public static void main(String[] args) {

        /**
         * Visitor Representa una operación a realizar en los elementos de una
         * estructura de objetos. Visitor te permite definir una nueva operación sin
         * cambiar los elementos de la clase en la que opera .
         * 
         */

        Pineaple fruit = new Pineaple();
        Fridge fridge = new Fridge();
        IVisitor discount = new CommonDiscount();
        System.out.println(fruit.applayDiscount(discount));
        System.out.println(fridge.applayDiscount(discount));
    }
}