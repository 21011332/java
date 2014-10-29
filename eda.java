class eda{
	public static void main(String[] args){
		
		
		int kotae=0;
		System.out.print("1=");
		
		int in0 = new java.util.Scanner(System.in).nextInt();
		System.out.print("+,-,*,/,%");
		
		String kigou = new java.util.Scanner(System.in).nextLine();
		System.out.print("2=");
		
		int in1 = new java.util.Scanner(System.in).nextInt();
		
		System.out.println(""+in0+kigou+in1+"="+kotae);
	}
}
		