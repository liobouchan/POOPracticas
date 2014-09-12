class Prueba{
  public static void main( String args[] ){

    //Declaración de Variables a Utilizar
    String cadena = "1234";
    String cadenaf = "1.358";
    String cadenad = "102.3654";
    char c;

    for( int n = 0; n < cadena.length(); n++ ) {

      // c va a ser igual al valor n de la cadena String
      c = cadena.charAt(n);
      //Aqui se realiza la traducción de caracter a código a base 10
      int i = Character.digit(c, 10);
      //Se imprime el caracter convertido a número base 10
      System.out.println( "El numero entero es : " + i );
    }

    //Se crea un objeto flotante fo con el valor de la cadenaf
    Float fo = Float.valueOf( cadenaf );
    System.out.println( "El objeto Flotante es : " + fo );
    //Un flotante f va a ser igual al valor del objeto fo
    float f = fo.floatValue();
    System.out.println( "El numero flotante es : " + f );

    //Se crea un objeto Double D con el valor de cadenad
    Double D = Double.valueOf( cadenad );
    System.out.println( "El objeto Double es : " + D );
    //Una variable double va a ser igual al valor del objeto D
    double d = D.doubleValue();
    System.out.println( "El numero double es : " + d );

  }
}

