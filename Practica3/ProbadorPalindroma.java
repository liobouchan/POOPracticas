public class ProbadorPalindroma{
	public static void main(String args[]){
		boolean validacion;
		Palindroma miNumero=new Palindroma();
		Leer lector=new Leer();
		String numero=String.valueOf(lector.datoInt());
		if(numero.length()==5){
			validacion=miNumero.esPalindroma(numero);
			if(validacion){
				System.out.println("El numero: "+numero+" es palindromo");
			}else{
				System.out.println("El numero: "+numero+" no es palindromo");
			}
		}else{
			System.out.println("El numero debe ser de 5 digitos");
		}
	
	}



}