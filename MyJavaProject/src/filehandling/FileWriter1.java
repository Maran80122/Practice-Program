package filehandling;

import java.io.FileWriter;
public class FileWriter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter("output.txt",true);
			fw.append("heyy"); //first to write a hello word
		
			
			
			
			
			
//		FileWriter fw=new FileWriter("output.txt");
//		fw.write("hello worrd"); 
//		fw.write("heyyy");
//		fw.append("vankam");
		fw.close();
		System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println("somehting");
		}
		
	}

}
