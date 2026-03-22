package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReader1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr= new FileReader("readertxt.txt");
			// int c=fr.read();
//			 System.out.println((char)c);
//			 c=fr.read();
//			 System.out.println((char)c);
//			 c=fr.read();
//			 System.out.println((char)c);   <****or**** > 
			   

//	       BufferedReader br=new BufferedReader(fr);
//	       String line=br.readLine();
			 
			 
			 while(c !=-1)
			 {
				 System.out.println((char)c);
				 c=fr.read(); 
			 }
			 
			 
			 fr.close();
	        }
		catch(Exception e)
		{
			
		}
	}
}


