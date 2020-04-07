package patrones_comportamiento.visitor;

public class Fridge implements IWhiteLine, IVisitable{

    @Override
    public float getPrize() {
        // TODO Auto-generated method stub
        return 450f;
    }

   

    @Override
    public float applayDiscount(IVisitor visitor) {
        // TODO Auto-generated method stub
       return visitor.visit(this);
    }

    
}