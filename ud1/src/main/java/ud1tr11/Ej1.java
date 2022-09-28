package ud1tr11;

import java.io.File;
import java.util.Arrays;

public class Ej1 {
	
	public static void main(String [] Args)
	{
		File directorio = new File("c:/");                                         
        String[] lista = directorio.list();
        Arrays.sort(lista);
        for (int i = 0; i < lista.length; i++) 
        {
            System.out.println(lista[i]);
        }
	}
	

}
