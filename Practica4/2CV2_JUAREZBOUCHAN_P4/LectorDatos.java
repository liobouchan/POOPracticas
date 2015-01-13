public class LectorDatos{
public static void main( String args[] )

{

char ca;

String cadena;

int ban = 0;

float a = (float)0.0;//, b;

Float af;//, bf;

Leer lector=new Leer();
 

while( ban!=1 ) {

System.out.print( "Introduzca un flotante :: " );

cadena = lector.dato();



if( !cadena.equals("") ) {

af = Float.valueOf( cadena );

a += af.floatValue();

}

else ban = 1;

}

System.out.print( "La suma de sus n£meros es :: " + a );

}

}