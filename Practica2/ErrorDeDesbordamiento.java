import java.applet.*;
import java.awt.*;

public class ErrorDeDesbordamiento extends Applet{

  //Función utilizada parar mostrar los datos al usuario.
  public void paint (Graphics g){
    g.drawString(new funcionesDesbordamiento().obtenerPositivo(), 5, 25);
    g.drawString(new funcionesDesbordamiento().obtenerNegativo(), 5, 50);
  }
}