package patrones_comportamiento.strategy;

public class Deposit implements IStrategy{

    @Override
    public float makeTransaction(float balance, float amount) {
        // TODO Auto-generated method stub
        
        return balance + amount;
    }

}