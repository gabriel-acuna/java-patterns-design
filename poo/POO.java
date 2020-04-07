/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author GABO-PC
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //intancia 
        Jaguar jaguar =new Jaguar(6, 45.56f);
       
        
        System.out.println(jaguar);
        jaguar.cazar();
        jaguar.rugir();
       // jaguar.maular();
    }
    
}
