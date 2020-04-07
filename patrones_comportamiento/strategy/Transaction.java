package patrones_comportamiento.strategy;

public class Transaction {

    private IStrategy strategy;

    public Transaction(IStrategy strategy) {
        this.strategy = strategy;
    }

    public float exceuteTransaction(float balance, float amount){
        return this.strategy.makeTransaction(balance, amount);
    }


}