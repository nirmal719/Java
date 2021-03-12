public class PrimeFinder{
	public static void main(String [] args){
		printPrime(22);
		printPrime(23);
		printPrime(29);
	}
	public static void printPrime(int number){
		int count = 0;
		if(number > 0){
			for(int i = 1; i <= number; i++){
				if(number % i == 0){
					count++;
				}
			}
			if(count == 2){
				System.out.println(number+" is a prime number");
			}else{
				System.out.println(number+ " is not a prime number");
			}
		}
	}
}