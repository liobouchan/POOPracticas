public class ProbadorDeConvertidor{
	public static void main(String[] args){
		Leer lector=new Leer();
		int n1;
		byte n2;
		float n3;
		char caracter;
		System.out.println("Escribe un numero entero");
		n1=lector.datoInt();
		System.out.println("Escribe un numero de tipo byte");
		n2=(byte)lector.datoInt();
		System.out.println("Escribe un numero de tipo float");
		n3=lector.datoFloat();
		System.out.println("Escribe un caracter"); 
		caracter=lector.dato().charAt(0);
		ConvertidorSinPerdida convertidor1=new ConvertidorSinPerdida(n1,n2,n3,caracter);
		System.out.println("En las siguientes conversiones no se pierde informacion");
		System.out.println("La conversion de entero a long del numero: "+n1+" es:");
		System.out.println(convertidor1.intToLong());
		System.out.println("La conversion de entero a float del numero: "+n1+" es:");
		System.out.println(convertidor1.intToFloat());
		System.out.println("La conversion de entero a double del numero: "+n1+" es:");
		System.out.println(convertidor1.intToDouble());
		System.out.println("La conversion de long a double del numero: "+n1+" es:");
		System.out.println(convertidor1.longToDouble());
		System.out.println("La conversion de byte a short del numero: "+n2+" es:");
		System.out.println(convertidor1.byteToShort());
		System.out.println("La conversion de short a entero del numero: "+n2+" es:");
		System.out.println(convertidor1.shortToInt());
		System.out.println("La conversion de float a double del numero: "+n3+" es:");
		System.out.println(convertidor1.floatToDouble());
		System.out.println("La conversion de char a entero del caracter: "+caracter+" es:");
		System.out.println(convertidor1.charToInt());
		double num1;
		long num2;
		int num3; 
		System.out.println("Escribe un numero double");
		num1=lector.datoDouble();
		System.out.println("Escribe un numero de tipo long");
		num2=lector.datoLong();
		System.out.println("Escribe un numero de tipo entero");
		num3=lector.datoInt();
		ConvertidorConPerdida convertidor2=new ConvertidorConPerdida(num1,num2,num3);
		System.out.println("En las siguientes conversiones se pierde informacion");
		System.out.println("La conversion de double a long del numero: "+num1+" es:");
		System.out.println(convertidor2.doubleToLong());
		System.out.println("La conversion de double a float del numero: "+num1+" es:");
		System.out.println(convertidor2.doubleToFloat());
		System.out.println("La conversion de float a int del numero: "+num1+" es:");
		System.out.println(convertidor2.floatToInt());
		System.out.println("La conversion de long a int del numero: "+num2+" es:");
		System.out.println(convertidor2.longToInt());
		System.out.println("La conversion de int a char del numero: "+num3+" es:");
		System.out.println(convertidor2.intToChar());
		System.out.println("La conversion de int a short del numero: "+num3+" es:");
		System.out.println(convertidor2.intToShort());
		System.out.println("La conversion de short a byte del numero: "+num3+" es:");
		System.out.println(convertidor2.shortToByte());
		
		
		
		
	}


}