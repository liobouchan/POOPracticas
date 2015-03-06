public class OperacionesMatematicas extends ManejoDeExcepciones{
	private double a, b;
	private ManejoDeExcepciones mde = new ManejoDeExcepciones();

	public OperacionesMatematicas() {
		a = mde.numeroAleatorio();
		b = mde.numeroAleatorio();
	}

	public void ejecutarOperacionesMatematicas() {
		System.out.println("La division de " + a + " y " + b + " es " + mde.dividir(a,b));	
		System.out.println("La raiz cuadrada de " + a + " es " + mde.raizCuadrada(a));
		System.out.println("El logaritmo de " + b + " es " + logaritmo(b));
	}
}