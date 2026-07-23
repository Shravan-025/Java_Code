class FindPrimeNumber{
public static void main(String[] args){
	int n=10;
        int count = 0;
	for(int i=2;i<=100000;i++){
            boolean isPrime = true;
               
	    for(int j=2; j*j<=i ; j++){
			if(i%j == 0){
			      isPrime = false;
			      break;
			}			
	     }
             if(isPrime){
                      System.out.println(i);
                      count++;
             }
             if(count==n){break;}
	}
}
}