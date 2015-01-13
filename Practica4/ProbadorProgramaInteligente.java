public class ProbadorProgramaInteligente{
	public static void main(String args[]){
		Leer lector=new Leer();
		boolean val=true;
		String operacion="";
		int numOperacion=0;
		double operador;
		ProgramaInteligente programa=new ProgramaInteligente();
		System.out.println("Escriba las operaciones deseadas");
		do{
			operacion=lector.dato();
			if(!operacion.equals("")){
			operador=programa.obtenerOperador(operacion,numOperacion);
			programa.setOperador(numOperacion,operador);
			programa.realizarOperaciones(operador,numOperacion);
			numOperacion++;
			}else{
				val=false;
			}
		}while(val&& numOperacion<10);
			System.out.println("Sus operaciones fueron:");
		for(int i=0;i<numOperacion;i++){
			System.out.println("X"+programa.getOperacion(i)+"="+programa.getOperador(i));
		}
		System.out.println("X="+programa.getX());
	}

}