public class StringReading{
	public static void main(String [] args){
		// int array[] = {1,2,3,4,5,7};
		int number = 214;
		int i = 0;
		int indexValue = 0;
		int [] numArray = new int[3];
		int range = 2;
		System.out.println(number[0]);
		while(number % 10 != 0 && range >= 0){
			indexValue = number % 10;
			numArray[range] = indexValue;
			range--;
			number /= 10;
		}
		System.out.println(numArray[0]);
		for(int j = 0; j < 3; j++){
			System.out.print(numArray[j] + " ");
		}
	}
}