/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica7.newton;

/**
 *
 * @author lio
 */
public class Cuadrado implements InterfazNewton{
    @Override
    public double funcion(double x) {
        return x*x - 2;
    }
    @Override
    public double funcionDerivada(double x) {
        return 2*x;
    }
}
