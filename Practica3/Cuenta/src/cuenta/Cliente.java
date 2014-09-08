/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cuenta;

/**
 *
 * @author liodebian
 */
public class Cliente {
    private String nombre;
    private int numeroDeArticulos;
    private double cuentaTotal;
    private double cuentaParcial;
    private String ID;
    
    public Cliente( String nombre , int numeroDeArticulos , double cuentaTotal , double cuentaParcial , String ID ){
        this.nombre = nombre;
        this.numeroDeArticulos = numeroDeArticulos;
        this.cuentaTotal = cuentaTotal;
        this.cuentaParcial = cuentaParcial;
        this.ID = ID;
    }
}
