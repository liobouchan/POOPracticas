import java.util.*;

public class ManejoDeExcepciones extends Exception{
	public double dividir(double a, double b) {
		if(b == 0) {
			throw new ArithmeticException("\n\nB no puede ser cero\n");
		}
		return a/b;
	}

	public double raizCuadrada(double a) {
		if(a < 0) {
			throw new ArithmeticException("El numero no puede ser negativo al sacar la raiz cuadrada");
		}
		return Math.sqrt(a);
	}

	public double logaritmo(double a) {
		if(a < 0) {
			throw new ArithmeticException("El numero no puede ser negativo al sacar su logaritmo.");
		}
		return Math.log(a);
	}

	public double numeroAleatorio() {
		double a = (double)(Math.random());
		if(a < 0) {
			throw new ArithmeticException("El numero no puede generado no puede ser negativo.");
		}
		return a;
	}

}