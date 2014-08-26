import java.applet.*;
import java.awt.*;

public class ErrorDeDesbordamiento extends Applet{

  long positivo = 500000000000000L + 5000000000000L;
  long negativo = -2 - 2000000000000L;

public void paint (Graphics g){
  g.drawString("positivo contiene: " + positivo, 5, 25);
  g.drawString("negativo contiene: " + negativo, 5, 50);
}
}

