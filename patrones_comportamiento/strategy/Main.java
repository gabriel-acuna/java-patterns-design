package patrones_comportamiento.strategy;

public class Main {

    public static void main(String[] args) {
        /**
         * Strategy
         * Define una famila de algoritmos, encapsulandolos
         * e itercambiandolos.Strategy permite a los algoritmos
         * variar de forma independiente desde el cliente que lo usa.
         */

        Transaction deposit = new Transaction(new Deposit());
        String out ="Current balance: %.2f";
        System.out.println(String.format(out,deposit.exceuteTransaction(1500f, 689.89f)));

        Transaction withdraw = new Transaction(new Withdraw());
        System.out.println(String.format(out , withdraw.exceuteTransaction(2891.89f, 350)));
    }

}