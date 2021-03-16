public class ForLoopChallenge{
	public static void main(String [] args){
		int count = 0;
		int dividedNumber = 0;
		for(int i = 1; i <= 1000; i++){
			if((i % 3 == 0) && (i % 5 == 0)){
				System.out.println("Divisible number is: "+i);
				dividedNumber += i;
				count++;
			}if(count == 7){
				break;
			}  
		}
		System.out.println("sum of numbers is: "+dividedNumber);
	}
}

