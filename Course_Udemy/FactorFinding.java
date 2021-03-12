public class FactorFinding{
	public static void findingFactors(int number){
		int count = 0;
		int sum = 0;
		int demo = 0;
		if(number > 0){
			for(int i = 2; i < number; i++){
				if(number % i == 0){
					count = i;
					sum += count;
				for(int temp = 2; temp <= 10; temp++){
					if(count % temp == 0){
						demo++;
					}
				}
				}
				if(demo == 0){
					System.out.println(count);
				}
			}
		}
	}
	public static void main(String [] args){
		findingFactors(21);
		findingFactors(45);
	}
}