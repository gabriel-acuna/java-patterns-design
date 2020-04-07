package patrones_comportamiento.visitor;

public class Pineaple implements IFruit, IVisitable {

    @Override
    public float getPrize() {
        // TODO Auto-generated method stub
        return 0.5f;
    }

    @Override
    public float applayDiscount(IVisitor visitor) {
        // TODO Auto-generated method stub
        return visitor.visit(this);
    }

}