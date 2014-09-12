package palindromo;

import java.util.Scanner;
public class MainPalindromo {
    public static void main(String[] args){
        
        Palindromo palindromo = new Palindromo();
        Scanner scan = new Scanner(System.in);
        String cadena;

        System.out.print("Ingresar una cadena de texto: ");
        cadena = scan.nextLine();

        if(palindromo.quitarEspacios( cadena )){
            System.out.println("La cadena "+cadena+" es palindromo");
        }
        else{
            System.out.println("La cadena "+cadena+" NO es palindromo");
        }

    }

}
