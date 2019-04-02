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
public class TrianguloFactory implements TrianguloFactoryMethod {

    public TrianguloFactory() {

    }

    @Override
    public String createTriangulo(int ladoA, int ladoB, int ladoC) {
        if (ladoA == ladoB && ladoA == ladoC) {
             //new TrianguloEquilatero(ladoA, ladoB, ladoC);
             return "Equilatero";
        } else if ((ladoA == ladoB && ladoB != ladoC) || (ladoA == ladoC && ladoC != ladoB) || (ladoB == ladoC && ladoC != ladoA)) {
            //return new TrianguloIsosceles(ladoA, ladoB, ladoC);
            return "Isosceles";
        } else {
            //return new TrianguloEscaleno(ladoA, ladoB, ladoC);
            return "Escaleno";
        }

    }

}
