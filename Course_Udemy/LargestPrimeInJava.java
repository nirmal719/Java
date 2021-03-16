public class LargestPrimeInJava{
	public static void main(String [] args){
		// System.out.print(getLargestPrime(45)+ " ");	
		getLargestPrime(45);
	}
	public static void getLargestPrime(int number){
		int count = 0;
		int demo = 0;
		int val = 0;
		if(number > 0){
			for(int i = 2; i < number;i++){
				if(number % i == 0){
					count = i;
					for(int j = 1; j <= count; j++){
						if(count % j == 0){
							demo++;
							val = count;	
						}
					}
					if(demo == 2){
						// return count;
						System.out.print(val + " ");
					}
				}
				
			}
		}
	} 
}