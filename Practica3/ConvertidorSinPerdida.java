public class ConvertidorSinPerdida{
	private int numero1;
	private byte numero2;
	private float numero3;
	private char caracter;
	
	public ConvertidorSinPerdida(){
		numero1=0;
		numero2=0;
		numero3=0.0f;
		caracter='\0';
	}
	public ConvertidorSinPerdida(int num1,byte num2,float num3, char car){
		numero1=num1;
		numero2=num2;
		numero3=num3;
		caracter=car;
	}
	
	public void setNumero1(int num){
		numero1=num;
	}
	
	public int getNumero1(){
		return numero1;
	}
	
	public void setNumero2(byte num){
		numero2=num;
	}
	
	public byte getNumero2(){
		return numero2;
	}
	
	public long intToLong(){
		return (long)numero1;
	}
	
	public double intToDouble(){
		return (double)numero1;
	}
	
	public float intToFloat(){
		return (float)numero1;
	}
	
	public short byteToShort(){
		return (short)numero2;
	}
	
	public int shortToInt(){
		return (int)((short)numero2);
	}
	
	public double floatToDouble(){
		return (double)numero3;
	}
	
	public int charToInt(){
		return (int)caracter;
	}
	
	public double longToDouble(){
		return (double)((int)numero1);	
	}
	
	
}
