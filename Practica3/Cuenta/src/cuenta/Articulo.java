/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cuenta;

/**
 *
 * @author lio
 */
public class Articulo {
    private int sku;
    public String nombre;
    public double precio;
    
    public Articulo( int sku, String nombre, double precio){
        this.sku = sku;
        this.nombre = nombre;
        this.precio = precio;
    }
}
