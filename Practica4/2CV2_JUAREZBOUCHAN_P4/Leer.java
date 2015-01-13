import java.io.*;
 
public class Leer
{
	public Leer(){
	}
	
   public String dato ()
   {
      String x = "";
      try
      {
         InputStreamReader isr = new InputStreamReader (System.in);
         BufferedReader in = new BufferedReader (isr);
         x = in.readLine ();
      }
      catch (IOException e)
      {
         System.err.print ("Error: " + e.getMessage ());
      }
      return x;
   }
   public int datoInt ()
   {
      try
      {
         return Integer.parseInt (dato ());
      }
      catch (NumberFormatException e)
      {
         return 0;
      }
   }
   public long datoLong ()
   {
      try
      {
         return Long.parseLong (dato ());
      }
      catch (NumberFormatException e)
      {
         return 0l;
      }
   }
   public float datoFloat ()
   {
      try
      {
         return (new Float (dato ())).floatValue ();
      }
      catch (Exception e)
      {
         return Float.NaN;
      }
   }
   public double datoDouble ()
   {
      try
      {
         return (new Double (dato ())).doubleValue ();
      }
      catch (Exception e)
      {
         return Double.NaN;
      }
   }
   
}