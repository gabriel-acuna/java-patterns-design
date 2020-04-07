package patrones_comportamiento.strategy;

class Withdraw implements IStrategy{

    @Override
    public float makeTransaction(float balance, float amount) {
        // TODO Auto-generated method stub
        return balance - amount;
    }

}