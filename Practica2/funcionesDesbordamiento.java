import java.awt.*;

public class funcionesDesbordamiento{
  //Variables que se usaran en el programa.
  private long positivo = 500000000000000L + 5000000000000L;
  private long negativo = -2L - 2000000000000L;

  //Función utilizada parar mostrar los datos al usuario.
  public void paint (Graphics g){
    g.drawString("El Positivo contiene: " + positivo, 5, 25);
    g.drawString("El Negativo contiene: " + negativo, 5, 50);
  }
}