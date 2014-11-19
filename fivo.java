class fibo {
 
     public static void main(String[] args){
        int n0 = 1, n1 = 1, n2;
	int [] hai = new int[11];
	
	hai[0] = 0;
 	
 	hai[1] = 1;
	
	for (int i=2;i<=10;i++){
 	     hai[i] = hai[i-1] + hai[i-2];
 		}
 
		
	for (int i=1;i<=10;i++){
		System.out.println(hai[i]);
	}

        System.out.print(n0 + " " + n1 + " ");

        for(int i = 1; i < 18; i++){
 
            n2 = n0 + n1;
            System.out.print(n2 + " ");
			n0 = n1;

            n1 = n2;
			}
			System.out.println();
    }
}