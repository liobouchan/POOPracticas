import java.awt.*;

public class funcionesDesbordamiento{
  //Variables que se usaran en el programa.
  private long positivo = 500000000000000L + 5000000000000L;
  private long negativo = -2L - 2000000000000L;

  //Función constructora.
  public funcionesDesbordamiento(){
  }

  public String obtenerPositivo(){
    return "El Positivo contiene: " + positivo;
  }

  public String obtenerNegativo(){
    return "El Pdddvo contiene: " + negativo;
  }

}