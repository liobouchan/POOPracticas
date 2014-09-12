import java.util.Scanner;
public class ChecarPalindromo {
    public static void main(String[] args)
    {
    Palindromo palabra = new Palindromo();
    Scanner leer = new Scanner(System.in);
    String numero;
        
    System.out.println("Ingresa la palabra: ");
    numero=leer.nextLine();
    
    if(palabra.ajustar(numero))
    {
        System.out.println("La palabra "+numero+" es palindromo");
    }
    else
    {
        System.out.println("La palabra "+numero+" NO es palindromo");
    }
           
    }
    
}
