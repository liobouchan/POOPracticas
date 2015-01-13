public class ProgramaInteligente{
	private double x=0.0;
	private String[] operacion;
	private double[] operadores;
	public ProgramaInteligente(){
		operacion=new String[10];
		operadores=new double[10];
	}
	
	public double getX(){
		return x;
	}
	
	public void setOperador(int i, double numero){
		operadores[i]=numero;
	}
	
	public double getOperador(int i){
		return operadores[i];
	}
	
	public String getOperacion(int i){
		return operacion[i];
	}
	
	public double obtenerOperador(String operador, int numOperacion){
		String nuevoOperador="";
		double numero;
		for(int i=0;i<operador.length();i++){
			if(i==0){
				operacion[numOperacion]=String.valueOf(operador.charAt(i));
			}else{
				if(operador.charAt(i)=='<'||operador.charAt(i)=='>'){
					operacion[numOperacion]+=String.valueOf(operador.charAt(i));
				}else{
					nuevoOperador=nuevoOperador+String.valueOf(operador.charAt(i));
				}
			}
		}
		numero=Double.valueOf(nuevoOperador);
		return numero;
	}
	
	public void realizarOperaciones(double operador,int numOperacion){
		if(operacion[numOperacion].equals("+")){
			this.x+=operador;
		}else{
			if(operacion[numOperacion].equals("-")){
				this.x-=operador;
			}else{
				if(operacion[numOperacion].equals("*")){
					this.x*=operador;
				}else{
					if(operacion[numOperacion].equals("/")){
						if(operador!=0){
						this.x/=operador;
						}else{
							System.out.println("La division entre cero no esta definida");
						}
					}else{
							if(operacion[numOperacion].equals("%")){
								this.x%=operador;
							}else{
								if(operacion[numOperacion].equals("<<")){
									this.x=(int)x<<(int)operador;
								}else{
									if(operacion[numOperacion].equals(">>")){
										this.x=(int)x>>(int)operador;
									}else{
										System.out.println("Operacion no valida");
									}
								}
								
							}
							
						}
					
					}
					
				}
				
			}
			
		}
		
		
	
	}
	


