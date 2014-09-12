public class ProbadorTienda{
	public static void main(String args[]){
		Leer lector=new Leer();
		System.out.println("Escriba su numero de cuenta");
		int cuenta=lector.datoInt();
		System.out.println("Escriba su saldo inicial");
		int saldo=lector.datoInt();
		System.out.println("Escriba el total de articulos adquiridos en este mes");
		int articulos=lector.datoInt();
		System.out.println("Escriba el total de creditos aplicados en este mes");
		int creditos=lector.datoInt();
		Tienda miTienda=new Tienda(cuenta,saldo,articulos,creditos);
		miTienda.obtenerSaldo();
	}


}