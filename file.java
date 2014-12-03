import java.util.Random;
import java.io.*;
class file {
 
     public static void main(String[] args){
        Random b = new Random();
		
		int a = b.nextInt(101);
		System.out.println(a);
		try{
		File file = new File("tensu.txt");
		FileWriter fw = new FileWriter(file); 
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		pw.println(a);
		pw.close();
		}catch(Exception e)
		{
		System.out.println(e.toString());
 		}
	}
	
}	