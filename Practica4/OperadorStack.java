
import java.io.DataInputStream;
import java.io.IOException;
import java.util.*;
public class OperadorStack {

    private String cadena,cadenamod,cadenamod2;
    private char identificador;
    private Float af;
    private float num = 0;
    private float X =0;
    private int contador=0;
    private String[] cadenaM = new String[20];
     Stack stack = new Stack();
     Stack stack2 = new Stack();



    public void solicitarInfo(){
   int i=0;
   System.out.print("Presione ENTER para terminar.\n\n");
   while(i==0){
    System.out.print( "Introduzca un operador seguido de un operando : " );
cadena=leer();



    if(cadena.equals("")){
  System.out.print( "'ENTER' detectado, imprimiendo resultado...\n" );
   i=1;
   break;
   }  // fin del if
         stack.push(cadena);// de esta extraere lo operadores y operandos
         stack2.push(cadena);// esta imprimira el resultado

        //cadenamod=String.valueOf(stack.pop());
        //System.out.print( "pop test : "+cadenamod );   //Estas dos lineas fueron para verificar el funcionamiento de mi Stack.

  // enviarInfo();
    contador++;
   }

    }
    public void enviarInfo(){
   // extraer();
    af = Float.valueOf( cadenamod );
    num += af.intValue();
    System.out.print( "El valor del operando: " +num+"\n" );
    procesa(num,identificador);
    }

public String extraer(){
    int aux=0;
    int size;
    while(aux<contador){
    cadenamod=String.valueOf(stack.pop());

    size=cadenamod.length();
    identificador = cadenamod.charAt(0);

    //System.out.print("Identificador/Operador: '"+identificador+"'\n");
    if(aux==0 &&(identificador=='/'||identificador=='*'||identificador=='>')){

        System.out.print("\nSu ultimo operador fue un '"+identificador+"', por lo que el valor inicial de X sera 1\n\n");
        X=1;

    }
    if((cadenamod.charAt(0)!='+')&&cadenamod.charAt(0)!='>'&&(cadenamod.charAt(0)!='*')&&(cadenamod.charAt(0)!='/')&&(cadenamod.charAt(0)!='-'))
    {
    System.out.print("Operacion no encontrada en '"+cadenamod+"'\n\n");
    System.exit(0);
    }

    if((cadenamod.charAt(0)=='>')&&(cadenamod.charAt(1)=='>'))
    {cadenamod2 = cadenamod.substring(2,size);
    cadenamod=cadenamod2;
identificador ='>';
       }
    else{
 cadenamod = cadenamod.substring(1,size);
    }
    af = Float.valueOf(cadenamod );
    num += af.floatValue();
   // System.out.print( "El valor del operando: " +num+"\n" );
    procesa(num,identificador);
    num=0;
    aux++;
    }
return cadenamod;
}



 public void procesa(float num,char identificador){
int x,x2,x3;
        switch(identificador)
{
case '>':
x=Math.round(X);
x2=Math.round(num);
x3=(x>>x2);
X=(float)x3;
break;
case '*':
    X*=num;
    break;
case '+':
    X+=num;
    break;
case '-':
    X-=num;
    break;
case '/':
   // System.out.print(" -/div/");
    X/=num;
    /**x2=(float)X/num;
    X=(int)x2;*/
break;

default:
    System.out.print("Default");
    break;
        }

    }


public void mostrarResultado(){
System.out.print("El resultado de sus operaciones X= "+stack2);
  /**for(int c=0;c<contador;c++){
   System.out.print(" "+stack.pop());
   }*/
   System.out.print(" = "+ X+"\n\n");
}




public  String leer()

{

 String s="";

DataInputStream sd = new DataInputStream(System.in);

System.out.flush();

try

{

s = sd.readLine();

}

catch(IOException e)

{

System.out.println("ERROR: Se introdujo el dato");

System.out.println(e);

}

return s;
}



}
