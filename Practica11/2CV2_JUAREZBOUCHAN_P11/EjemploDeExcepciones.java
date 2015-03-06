public class EjemploDeExcepciones {
	private int arreglo [];
	private int a, b;

	public EjemploDeExcepciones() {
		arreglo = new int[5];
		llenarArreglo(arreglo);
		a = 0; b = 0;
	}

	public EjemploDeExcepciones(int arreglo[], int a, int b) {
		this.arreglo = new int[5];
		copiarArreglos(this.arreglo, arreglo);
		this.a = a; this.b = b;
	}

	public EjemploDeExcepciones(EjemploDeExcepciones unaEjemploDeExcepciones) {
		arreglo = new int[5];
		copiarArreglos(this.arreglo, unaEjemploDeExcepciones.arreglo);
		this.a = unaEjemploDeExcepciones.a; this.b = unaEjemploDeExcepciones.b;
	}

	public void copiarArreglos(int a [], int b []) {
		int i = 0;

		try {
			for (i = 0; i < b.length; i++)
				a[i] = b[i];
		} catch(ArrayIndexOutOfBoundsException aioobe) {
			aioobe.printStackTrace();
		}
		finally {
			for (i = 0; i < 5; i++)
				a[i] = b[i];
			System.out.print("\nSe trataron de copear un arreglo de 10 elementos a uno de 5 por lo que se genero una excepcion por parte del arreglo de 5. Copeando solo cinco elemntos del arreglo de 10 se resuelve el problema.\n");
			imprimirArreglo(a);
			System.out.print("\n\n");
		}
	}

	public int generarNumeroAleatorio() {
		return (int)( Math.random() * 30);
	}

	public void llenarArreglo(int arreglo []) {
		for( int i=0; i<arreglo.length; i++ )
			arreglo[i] = generarNumeroAleatorio();
	}

	public void imprimirArreglo(int arreglo []) {
		for( int i=0; i<arreglo.length; i++ ) {
			System.out.print( " " + arreglo[i] );
		}
	}

	public void dividir() {
		int c = 0;
		
		try {
			c = a/b;
		} catch(ArithmeticException ae){
			ae.printStackTrace();
		}finally {
			b = 1;
			c = a/b;
			System.out.println("\nEl error al dividir entre cero se compone cambiando el valor del divisor a uno mayor o menor que cero, en este caso le asignaremos un 1. Por lo tanto la division de " + a + " y " + b + " es " + c + ".\n");
		}
	}
	public void destructor() {
		arreglo = null;
		System.gc();
	}
}