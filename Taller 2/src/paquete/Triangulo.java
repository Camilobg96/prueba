/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Estudiantes
 */
public abstract class Triangulo {
    
    private int ladoA;
    private int ladoB;
    private int ladoC;
    
    public Triangulo(int a, int b, int c){
        this.ladoA=a;
        this.ladoB=b;
        this.ladoC=c;
        
    }
    
    public abstract String getDescripcion();
    
}
