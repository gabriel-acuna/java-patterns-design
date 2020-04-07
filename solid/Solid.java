/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author GABO-PC
 */
public class Solid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rec = new Rectangulo(5.6f, 3.8f);
        Presentacion.imprmir(rec);
        Presentacion.area(rec);
        Triangulo triangulo = new Triangulo(10f, 8.5f);
        Presentacion.area(triangulo);
    }
    
}
