public class ConvertidorConPerdida{
	double numero1;
	long numero2;
	int numero3;
	
	public ConvertidorConPerdida(){
		numero1=0.0;
		numero2=0l;
		numero3=0;
		
	}
	
	public ConvertidorConPerdida(double num1,long num2,int num3){
		numero1=num1;
		numero2=num2;
		numero3=num3;
	}
	
	public long doubleToLong(){
		return (long)numero1;
	}
	
	public float doubleToFloat(){
		return (float)numero1;
	}
	
	public int floatToInt(){
		return (int)((float)numero1);
	}
	
	public int longToInt(){
		return (int)numero2;
	}
	
	public char intToChar(){
		return	(char)numero3;
	}
	
	public short intToShort(){
		return (short)numero3;
	}
	
	public byte shortToByte(){
		return (byte)((short)numero3);
	}
	
	


}