public class DesbordadorNegativo{
	public DesbordadorNegativo(){
	}
	
	public void desbordarByteNegativo(){
		byte numero=0;
		try{
			while(numero<=0){
			numero--;
			}
			numero++;
			System.out.println("El valor minimo del byte antes de desbordarse es: "+numero);
		}catch(Exception e){
			System.out.println(e.getMessage());
		
		}
	}
	
	public void desbordarShortNegativo(){
		short numero=0;
		try{
			while(numero<=0){
			numero--;
			}
			numero++;
			System.out.println("El valor minimo del short antes de desbordarse es: "+numero);
		}catch(Exception e){
			System.out.println(e.getMessage());
		
		}
	}
	
	public void desbordarIntNegativo(){
		int numero=0;
		try{
			while(numero<=0){
			numero--;
			}
			numero++;
			System.out.println("El valor minimo del int antes de desbordarse es: "+numero);
		}catch(Exception e){
			System.out.println(e.getMessage());
		
		}
	}
	
	public void desbordarLongNegativo(){
		long numero=0l;
		numero=Long.MIN_VALUE;
		System.out.println("El valor minimo del long antes de desbordarse es: "+numero);
		
	}
	
	public void desbordarCharNegativo(){
		char numero=1;
		try{
			while(numero<=1){
			numero--;
			}
			numero++;
			System.out.println("El valor minimo del char antes de desbordarse es: "+numero+" que es equivalente a: "+(int)numero);
		}catch(Exception e){
			System.out.println(e.getMessage());
		
		}
	}
	public void desbordarFloatNegativo(){
		float numero=3.4f;
		try{
			while(numero>3.4E-38f){
			numero= numero/10;
			}
			System.out.println("El valor minimo del float antes de desbordarse es: "+numero);
		}catch(Exception e){
			System.out.println(e.getMessage());
		
		}
	}
	
	public void desbordarDoubleNegativo(){
		double numero=1.7;
		try{
			while(numero>1.7E-307){
			numero= numero/10;
			}
			System.out.println("El valor minimo del doble antes de desbordarse es: "+numero);
		}catch(Exception e){
			System.out.println(e.getMessage());
		
		}
	}


}