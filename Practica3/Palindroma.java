public class Palindroma{
	public Palindroma(){
	}
	
	public boolean esPalindroma(String numero){
		String numero2="";
		for(int i=numero.length();i>0;i--){
			numero2=numero2+String.valueOf(numero.charAt(i-1));
		}
		System.out.println(numero2);
		if(numero.equals(numero2)){
			return true;
		}else{
			return false;
		}
	
	}

}