public class LargestPrime {
    // write your code here
    public static int getLargestPrime(int number){
        int count = 0;
        int primeNumber = 0;
		int sum = 0;
        if(number > 0){
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    for(int temp = 1; temp <= i; temp++){
                      if(i % temp == 0){
                          count++;
                        }
                      }
                    }
					 if(count > 2){
                           break;
                        }else{
							primeNumber = i;
							System.out.println(primeNumber+ " "+i);
							sum += primeNumber;
						}
					primeNumber = 0;	
                }
            }
		return (sum - primeNumber);
    }
	public static void main(String [] args){
		System.out.println(getLargestPrime(21));
	}
}