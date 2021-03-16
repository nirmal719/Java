public class PrimeFactor{
	public static void factorPrime(int number){
		int count = 0;
		if(number >= 0){
			for(int i = 2; i <= number; i++){
				if(number % i == 0){
					count = i;
					int demo = 0;
					int storeVal = 0;
					for(int j = count; j >= 1; j--){
						if(count % j == 0){
							demo++;
							storeVal = count;
						}
					}
					if(demo == 2){
						System.out.println(count+ " " +storeVal);
					}
				}
			}
		}
	}
	public static void main(String [] args){
		factorPrime(21);
		// factorPrime(45);
	}
}