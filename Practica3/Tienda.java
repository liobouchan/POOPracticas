public class Tienda{
	private int NumCuenta,saldo,articulosACredito,creditosAplicados,creditoPermitido=5000;
	
	
	public Tienda(int cuenta,int saldoInicial,int articulos,int credito){
		NumCuenta=cuenta;
		saldo=saldoInicial;
		articulosACredito=articulos;
		creditosAplicados=credito;
	}
	
	public void obtenerSaldo(){
		saldo=saldo+articulosACredito-creditosAplicados;
		if(saldo<=creditoPermitido){
			System.out.println("Su saldo actual es de: "+saldo+" Para la cuenta: "+NumCuenta);
			
		}else{
			System.out.println("Limite de credito excedido para la cuenta: "+NumCuenta);
			
		}
	}
	


}