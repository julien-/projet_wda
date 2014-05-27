package Outils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class Outils {

	public static void copyFile(String source, String dest)
	{
		FileChannel in = null; // canal d'entrée
		FileChannel out = null; // canal de sortie
		 
		try {
		  // Init
		  in = new FileInputStream(source).getChannel();
		  out = new FileOutputStream(dest).getChannel();
		 
		  // Copie depuis le in vers le out
		  in.transferTo(0, in.size(), out);
		} catch (Exception e) {
		  e.printStackTrace(); // n'importe quelle exception
		} finally { // finalement on ferme
		  if(in != null) {
		  	try {
			  in.close();
			} catch (IOException e) {}
		  }
		  if(out != null) {
		  	try {
			  out.close();
			} catch (IOException e) {}
		  }
		}
	}

}
