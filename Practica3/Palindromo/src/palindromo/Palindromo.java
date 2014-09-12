public class Palindromo {
    
    public boolean comprobar(String palabra){ 
        if(palabra.length() == 1 || palabra.length() == 0) 
             return true; 
        else{ 
            if(palabra.charAt(0) == palabra.charAt(palabra.length()-1) )             
                return comprobar(palabra.substring(1,palabra.length()-1)); 
                        return false;             
        } 
    } 
    
     public boolean ajustar(String palabra){ 
        palabra.toLowerCase(); 
        String sinespacios = palabra.replaceAll(" ", ""); 
        return comprobar(sinespacios); 
    }
     
}
