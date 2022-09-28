package ud1tr11;

import java.io.File;
import java.util.Arrays;

public class Ej3 {
	public static void main (String args[]) {
	     File miDirectorioActual = new File (".");
	     
	     try 
	     {
	       System.out.println ("Directorio actual: " + miDirectorioActual.getAbsolutePath());
	       String[] lista = miDirectorioActual.list();
	       Arrays.sort(lista);
	       for (int i = 0; i < lista.length; i++) 
	       {
	            System.out.println(lista[i]);
	       }
	     }
	     catch(Exception e) 
	     {
	       e.printStackTrace();
	     }
}

}
