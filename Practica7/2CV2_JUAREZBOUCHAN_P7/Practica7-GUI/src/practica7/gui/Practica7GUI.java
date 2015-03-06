/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica7.gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author lio
 */
public class Practica7GUI extends JOptionPane{

    /**
     * @param args the command line arguments
     */
     private String nombreArchivo;
    
    public Practica7GUI(){
       nombreArchivo = ".txt"; 
    }
    
    public Practica7GUI(String nombreArchivo){
        this.nombreArchivo = nombreArchivo + ".txt";
    }
    public boolean existe(){
        File archivo = new File(nombreArchivo);
        try{
            FileReader fr=new FileReader(archivo);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public String leer(){
        File archivo=new File(this.nombreArchivo);
        String registro="";
        try{
            FileReader fr=new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
            String s=br.readLine();
            while(s!=null){
                registro=registro+s;
                s=br.readLine();
            }
            br.close();        
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return registro;
    }
    
    public void escribir(String boleta,String nombre, String ApellidoP, String ApellidoM, String Sexo, String calificacion,String materia){
         File archivo=new File(this.nombreArchivo);
         try{
            FileWriter fr = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fr);
            bw.write("Boleta:  " + boleta + "\n");
            bw.write(" Apellido Paterno:  " + ApellidoP + "\n");
            bw.write(" Apellido Materno:  " + ApellidoM + "\n");
            bw.write(" Nombre:  " + nombre + "\n");
            bw.write(" Sexo:  " + Sexo + "\n");
            bw.write(" Materia:  " + materia + "\n");
            bw.write(" Calificación:  " + calificacion + "\n");         
            bw.close();
         } catch(IOException ioe){
             JOptionPane.showMessageDialog(this, ioe.getMessage());
         }
    }       // TODO code application logic here
    
}
