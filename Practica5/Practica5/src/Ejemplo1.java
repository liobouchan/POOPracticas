// fichero Ejemplo1.java
import java.util.ArrayList;
import java.awt.*;

class Ejemplo1 {
    public static void main(String arg[]) throws InterruptedException{
        System.out.println("Comienza main()...");

        Circulo c = new Circulo(2.0, 2.0, 4.0);

 	System.out.println("Radio ="+c.r +"unidades.");
	System.out.println("Centro = (" + c.x + "," + c.y + ") unidades.");

 	Circulo c1 = new Circulo(1.0, 1.0, 2.0);
	Circulo c2 = new Circulo(0.0, 0.0, 3.0);
        Circulo c3 = new Circulo(0.0, 0.0, 0.0);
        //Circulo c4 = new Circulo(x, y, r);
        //Circulo c5 = new Circulo(x, y, r);

	c = c1.elMayor(c2);

 	System.out.println("El mayor radio es " + c.r + ".");

 	c = new Circulo(); // c.r = 0.0;
	c = Circulo.elMayor(c1, c2);

 	System.out.println("El mayor radio es " + c.r + ".");

	VentanaCerrable ventana = new VentanaCerrable("Ventana abierta al mundo...");
	ArrayList v = new ArrayList();
	CirculoGrafico cg1 = new CirculoGrafico(150, 200, 100, Color.blue);
	CirculoGrafico cg2 = new CirculoGrafico(355, 200, 100, Color.black);
        CirculoGrafico cg3 = new CirculoGrafico(560, 200, 100, Color.red);
        CirculoGrafico cg4 = new CirculoGrafico(250, 300, 100, Color.yellow);
        CirculoGrafico cg5 = new CirculoGrafico(457.5, 300, 100, Color.green);
	RectanguloGrafico rg = new RectanguloGrafico(50, 50, 450, 350, Color.green);
	v.add(cg1);
	v.add(cg2);
        v.add(cg3);
        v.add(cg4);
        v.add(cg5);
	//v.add(rg);  Se elimina para que quede como en la imagen de la practica

	PanelDibujo mipanel = new PanelDibujo(v);
	ventana.add(mipanel);
	ventana.setSize(800, 500);
	ventana.setVisible(true);

	System.out.println("Termina main()...");
    } // fin de main()
} // fin de class Ejemplo1