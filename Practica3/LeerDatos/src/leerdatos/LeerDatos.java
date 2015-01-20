package leerdatos;
//Importamos una librería para usar alguno de sus miembros
import java.io.*;

class LeerDatos {

  public static String leer(){

    String s = "";
    //Variable sd con la posibilidad de leer datos del teclado
    DataInputStream sd = new DataInputStream(System.in);
    //Limpiamos el buffer
    System.out.flush();

    //Se tratara asignarle el valor a la variable leyendo una entrada por el suuario
    try{
      s = sd.readLine();
    }
    //Si existe un error nos manda la alerta y nos imprime el error
    catch(IOException e){
      System.out.println("ERROR: Se introdujo el dato");
      System.out.println(e);
    }
    return s;
  }

  public static void main( String args[] ){

    char ca;
    String cadena;
    int ban = 0;
    float a = (float)0.0;//, b;
    Float af;//, bf;

    while( ban!=1 ) {
      System.out.print( "Introduzca un flotante :: " );
      cadena = leer();
      ca = cadena.charAt(0);
      if( ca!='\r' ) {
        af = Float.valueOf( cadena );
        a += af.floatValue();
      }
      else{
        ban = 1;
      }
    }
    System.out.print( "La suma de sus numeros es :: " + a );
  }
}