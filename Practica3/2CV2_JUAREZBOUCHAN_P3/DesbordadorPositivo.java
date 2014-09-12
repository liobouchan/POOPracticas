public class DesbordadorPositivo{
	
	public DesbordadorPositivo(){
	}
	
	public void desbordarBytePositivo(){
		byte numero=0;
		try{
			while(numero>=0){
			numero++;
			}
			numero--;
			System.out.println("El valor maximo del byte antes de desbordarse es: "+numero);
		}catch(Exception e){
			System.out.println(e.getMessage());
		
		}
	}
	
	public void desbordarShortPositivo(){
		short numero=0;
		try{
			while(numero>=0){
			numero++;
			}
			numero--;
			System.out.println("El valor maximo del short antes de desbordarse es: "+numero);
		}catch(Exception e){
			System.out.println(e.getMessage());
		
		}
	}
	
	public void desbordarIntPositivo(){
		int numero=0;
		try{
			while(numero>=0){
			numero++;
			}
			numero--;
			System.out.println("El valor maximo del int antes de desbordarse es: "+numero);
		}catch(Exception e){
			System.out.println(e.getMessage());
		
		}
	}
	
	public void desbordarLongPositivo(){
		long numero=1l;
		numero=Long.MAX_VALUE;
		System.out.println("El valor maximo del long antes de desbordarse es: "+numero);
	}
	
	public void desbordarCharPositivo(){
		char numero=1;
		try{
			while(numero>0){
			numero++;
			}
			numero--;
			System.out.println("El valor maximo del char antes de desbordarse es: "+numero+" que es equivalente a: "+(int)numero);
		}catch(Exception e){
			System.out.println(e.getMessage());
		
		}
	}
	public void desbordarFloatPositivo(){
		float numero=3.4f;
		try{
			while(numero<3.4E38f){
			numero= numero*10;
			}
			System.out.println("El valor maximo del float antes de desbordarse es: "+numero);
		}catch(Exception e){
			System.out.println(e.getMessage());
		
		}
	}
	
	public void desbordarDoublePositivo(){
		double numero=1.7;
		try{
			while(numero<1.7E307){
			numero= numero*10;
			}
			System.out.println("El valor maximo del doble antes de desbordarse es: "+numero);
		}catch(Exception e){
			System.out.println(e.getMessage());
		
		}
	}
	
	

	
}





