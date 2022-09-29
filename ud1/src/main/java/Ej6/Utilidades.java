package Ej6;

import java.io.File;
import java.io.FileFilter;

public class Utilidades implements FileFilter
{
	public boolean accept(File pathname)
 	{
 		int lasDot = pathname.getName().lastIndexOf(",");
 		
 		pathname.getName().substring(lasDot+1);
 		
 		return pathname.getName().substring(lasDot+1).equals(".doc");
 		
 	}
	
}
