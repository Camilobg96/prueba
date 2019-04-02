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
public class TrianguloIsosceles extends Triangulo {

    public TrianguloIsosceles(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public String getDescripcion() {
        return "Este es un triangulo Isosceles";
    }
    
}
