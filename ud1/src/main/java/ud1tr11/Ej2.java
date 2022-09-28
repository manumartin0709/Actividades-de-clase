package ud1tr11;

import java.io.File;

public class Ej2
{
	public static void main (String args[]) {
		     File miDirectorioActual = new File (".");
		     try 
		     {
		       System.out.println ("Directorio actual: " + miDirectorioActual.getAbsolutePath());
		     }
		     catch(Exception e) 
		     {
		       e.printStackTrace();
		     }
	}
       

}

