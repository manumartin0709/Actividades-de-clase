package ud1tr11;

import java.io.File;
import java.io.IOException;

public class Ej4 
{
	public static void main(String [] Args)
	{
		
		File dir1 = new File("dir1");
		File dir2 = new File("dir2");
		
		File f11 = new File(dir1, "f11.doc");
		File f21 = new File(dir2, "f21.txt");
		try
		{
			if(!dir1.exists() && !dir2.exists() && !f11.exists() && !f21.exists())
			{
				dir1.mkdir();
				dir2.mkdir();
				f11.createNewFile();
				f21.createNewFile();
			}
			if(f11.exists())
			{
				File f12 = new File(dir1, "f12.doc");
				f11.renameTo(f12);
				
			}
			//mueve el fichero f21.txt al directorio d1 y elimina el directorio d2
			if(f21.exists())
			{
				f21.renameTo( new File (dir1,"f21.txt"));
			    dir2.delete();	
			}
		}catch (IOException e)
		{
			e.getMessage();
		}
		
		
	}
	

}
