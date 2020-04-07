package patrones_comportamiento.visitor;

public interface IVisitor {

    float visit(IFruit fruit);

    float visit(IWhiteLine whiteLine);


}