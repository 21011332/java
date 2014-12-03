import java.math.*;

class ryuka {
 
     public static void main(String[] args){
        BigInteger ryuka = new BigInteger("0");
		BigInteger[] hai = new BigInteger[101];
	
	hai[0] = new BigInteger ("2");
 	hai[1] = new BigInteger("1");
	ryuka = ryuka.add(hai[1]);
	
	
	for (int i=2;i<=100;i++){
 	     hai[i] = hai[i-1].add(hai[i-2]);
		 
		 
		 ryuka = ryuka.add(hai[i]);
		 System.out.println(ryuka);
 		}
	}
}	