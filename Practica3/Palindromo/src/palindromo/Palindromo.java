package palindromo;

public class Palindromo {
    
    public boolean checar(String cadena){
        if(cadena.length() == 1 || cadena.length() == 0){
             return true; 
        }else{
            if(cadena.charAt(0) == cadena.charAt(cadena.length()-1) ){         
                return checar(cadena.substring(1,cadena.length()-1)); 
            }
            return false;
        } 
    } 

     public boolean quitarEspacios(String cadena){ 
        cadena.toLowerCase(); 
        String sinespacios = cadena.replaceAll(" ", ""); 
        return checar(sinespacios); 
    }
     
}
