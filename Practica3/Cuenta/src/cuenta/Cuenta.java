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
public class Cuenta {
    private String ID;
    public double saldo;
    public double limite;
    
    public Cuenta(String ID , double saldo , double limite){
        this.ID = ID;
        this.saldo = saldo;
        this.limite = limite;
    }
    
    public Cuenta(Cuenta unaCuenta){
        ID = unaCuenta.ID;
        saldo = unaCuenta.saldo;
        limite = unaCuenta.limite;
    }
}