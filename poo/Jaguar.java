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
public class Jaguar extends Animal implements IFelinoSalvaje{
    
    private int edad;
    private float peso;

    public Jaguar(int edad, float peso) {
        setEdad(edad);
        setPeso(peso);
    }

    public Jaguar() {
        setEdad(0);
        setPeso(0f);
    }

    public Jaguar(int edad) {
        setEdad(edad) ;
        setPeso(0f);
    }

     public Jaguar(float peso) {
        setEdad(0) ;
        setPeso(peso);
    }
    
   
    
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public void dormir(){
        System.out.println("El jaguar duerme");
    }
    @Override
    public String toString() {
        return String.format("Edad: %d \nPeso: %.2f", getEdad(), getPeso());
    }

    @Override
    public void rugir() {
         System.out.println("El jaguar rugir");
    }

   

    @Override
    public void cazar() {
        System.out.println("El jaguar caza");
    }
    
    
    
}
