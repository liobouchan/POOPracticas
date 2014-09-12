package palindromo;

import java.util.Scanner;
public class MainPalindromo {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String cadena;

        System.out.print("Ingresar una cadena de texto: ");
        cadena = scan.nextLine();
        Palindromo palindromo = new Palindromo(cadena);

        if(palindromo.quitarEspacios( cadena )){
            System.out.println("La cadena "+cadena+" es palindromo");
        }
        else{
            System.out.println("La cadena "+cadena+" NO es palindromo");
        }
        palindromo.destroy();
        System.gc();
    }

}
