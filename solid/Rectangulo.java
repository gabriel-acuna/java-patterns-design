package solid;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GABO-PC
 */
public class Rectangulo  implements IFigura{
    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        setBase(base);
        setAltura(altura);
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("{base: %.2f , altura: %.2f }", getBase(), getAltura());
    }
    
    @Override
    public float area(){
        return getBase() * getAltura();
    }
    
    
    
}
