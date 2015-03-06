class ProbarEjemploDeExcepciones {
	public static void main(String[] args) {
		int b [] = {1,2,3,4,5,6,7,8,9};
		EjemploDeExcepciones ede = new EjemploDeExcepciones(b, 10, 0);
		ede.dividir();
		try {
			Class.forName("EjemploClassNotFound");
			System.out.print("\nEjemploDeExcepciones se cargo exitosamente.\n");
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		finally{
			System.out.print("\nCompile la clase EjemploDeExcepciones para que se pueda cargar esta misma.\n");
		}
	}
}
