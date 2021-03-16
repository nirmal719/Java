public class SumLastAndFirstDigit{
	public static int sumFirstAndLastDigit(int number){
		int reversedNumber = 0;
		int temp = 0;
		int lastDigit = number % 10;
		int remainingNumber = number / 10;
		if(number >= 10){
			while(remainingNumber != 0){
				temp = remainingNumber % 10;
				reversedNumber = (reversedNumber * 10) + temp;
				remainingNumber /= 10;
			}
			int firstDigit = reversedNumber % 10;
			int sum = lastDigit + firstDigit;
			return sum;
		}else if((number > 0) && (number < 10)){
			return (2 * number);
		}else{
			return -1;
		}
	}
	public static void main(String [] args){
		System.out.println("sum is: "+sumFirstAndLastDigit(252));
		System.out.println("sum is: "+sumFirstAndLastDigit(5));
		System.out.println("sum is: "+sumFirstAndLastDigit(-1));
	}
}