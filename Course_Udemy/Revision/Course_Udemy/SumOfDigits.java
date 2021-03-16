public class SumOfDigits{
	private static int sumDigits(int number){
		int digit = 0;
		int temp = 0;
		if(number >= 10){
			while(number != 0){
				digit = number % 10;
				temp += digit;
				number /= 10;
			}
			return temp;
		}else{
			return -1;
		}
	}
	public static void main(String [] args){
		int result = sumDigits(125);
		System.out.println(result);
		int result1 = sumDigits(1);
		System.out.println(result1);
	}
}