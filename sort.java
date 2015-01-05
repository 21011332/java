import java.util.Random;  
import java.io.*; 
import java.util.*; 
 class sort {  
 
 
 	public static void main(String args[])  {
 		
		try{  
			File file = new File("tensu.csv");  
			FileReader fr = new FileReader(file);  
			BufferedReader br = new BufferedReader(fr);  
			String datas = br.readLine();  
			String[] str1Ary = datas.split(",");  
			int [] idatas=new int[str1Ary.length];  
			List<Integer> list = new ArrayList<Integer>();
             for (int i=0; i<str1Ary.length; i++) { 
             	
             	list.add(Integer.valueOf(str1Ary[i]).intValue()); 
             	System.out.println(list.get(i));
             

             	
             	
             }
			Collections.sort(list);
			for (int j:list){ 
             System.out.println("ソート後：" + j);
			}
             	
			br.close();  
		} catch(Exception e){  
			System.out.println(e.toString());  
		}  
 	}
 }
 