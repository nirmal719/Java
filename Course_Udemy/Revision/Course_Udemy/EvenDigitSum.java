public class EvenDigitSum{
	public static int getEvenDigitSum(int number){
		int temp = 0;
		int sum = 0;
		if(number > 0){
			while(number != 0){
				temp = number % 10;
				if((temp % 2) == 0){
					sum += temp;
				}
				number /= 10;
			}
			return sum;
		}else{
			return -1;
		}
	}
	public static void main(String [] args){
		System.out.println("sum is: "+getEvenDigitSum(128746));
		System.out.println("sum is: "+getEvenDigitSum(252));
		System.out.println("sum is: "+getEvenDigitSum(-22));
	}

}