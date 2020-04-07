package patrones_creacionales.factory_method;

public interface Main {
    public static void main(String[] args) {

        PIzzeriaMyG myg = new PIzzeriaMyG();
        Pizza pizzaPeperoni = myg.crearPizza("Peperoni");
        System.out.println(pizzaPeperoni);

        Pizza pizzaHawaiana = myg.crearPizza("Hawaiana");
        System.out.println(pizzaHawaiana);

        Pizza pizzaNpolitana = myg.crearPizza("Napolitana");
        System.out.println(pizzaNpolitana);

        Pizza pizzaPeperoniBordesRellenos = myg.crearPizza("Peperoni bordes rellenos");
        System.out.println(pizzaPeperoniBordesRellenos);


    }
}