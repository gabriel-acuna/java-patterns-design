package patrones_comportamiento.visitor;

public class CommonDiscount implements IVisitor{

    @Override
    public float visit(IFruit fruit) {
        // TODO Auto-generated method stub
        return fruit.getPrize() - 0.10f;
    }

    @Override
    public float visit(IWhiteLine whiteLine) {
        // TODO Auto-generated method stub
        return whiteLine.getPrize() * 0.05f; 
    }

}