/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica7.animales;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.HashMap;
import javax.swing.ImageIcon;

/**
 *
 * @author lio
 */
public class Animales extends javax.swing.JPanel{
    private final String nombre;
    private ImageIcon img;
    private  HashMap<String, String> animales;
    
    private void initAnimales(){
        animales = new HashMap<String, String>();
        animales.put("elefante", "mamífero");
        animales.put("koala", "mamífero marsupial");
        animales.put("serpiente", "reptil");
    }
     
    public Animales(String nombreImagen) {
        super();
        initAnimales();
        this.setSize(300, 400); 
        this.nombre = nombreImagen;
    }
    
    public Animales(Animales animImg) { 
        this(animImg.nombre); 
    }
    
    public boolean imagenEncontrada(String nombre){
        try{
            img = new ImageIcon(getClass().getResource(nombre + ".jpg"));
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
    public HashMap getAnimales() {
        return animales;
    }
    
    @Override
    public void paint(Graphics g) {
        Dimension dim;
        dim = getSize();
        img = new ImageIcon(getClass().getResource(nombre + ".jpg")); 
        g.drawImage(img.getImage(), 0, 0, dim.width, dim.height, null);
        setOpaque(false);
    }    
}
