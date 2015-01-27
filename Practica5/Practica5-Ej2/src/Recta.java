// fichero Rectangulo.java

public class Recta extends Geometria{

    // definición de variables miembro de la claes
    private static int numRectangulos = 0;
    protected double x1, x2;

    // constructores de la clase

    public Recta(double inicio, double fin){
        x1 = inicio;
        x2 = fin;
    }
    
    // definición de métodos
    public double perimetro(){ 
        return x2-x1; 
    }

    public double area(){
        return 0; 
    }
} //