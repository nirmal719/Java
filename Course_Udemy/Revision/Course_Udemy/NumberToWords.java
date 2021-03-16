public class NumberToWords{
	public static void numberToWords(int number){
		if(number > 0){
			int printingNumber = reverse(number);
			int digitCount = getDigitCount(number) - getDigitCount(printingNumber);
			while(printingNumber != 0){
				int temp = printingNumber % 10;
				switch(temp){
					case 0: System.out.print("Zero ");
							break;
					case 1: System.out.print("One ");
							break;
					case 2: System.out.print("Two ");
							break;
					case 3: System.out.print("Three ");
							break;
					case 4: System.out.print("Four ");
							break;
					case 5: System.out.print("Five ");
							break;
					case 6: System.out.print("Six ");
							break;
					case 7: System.out.print("Seven ");
							break;
					case 8: System.out.print("Eight ");
							break;
					case 9: System.out.print("Nine ");
							break;
					default: System.out.print("No digit found");
							break;
					}
					printingNumber /= 10;
				}
				for(int i = 1; i <= digitCount; i++)
				{
					System.out.print("Zero ");
				}
				System.out.println();
			}else if(number == 0){
				System.out.print("Zero ");
			}else{
			System.out.print("Invalid Value");
			}
		}
	public static int reverse(int number){
		int reversedNumber = 0;
			while(number != 0){
				int temp = number % 10;
				reversedNumber = (reversedNumber * 10) + temp;
				number /= 10;
			}
		return reversedNumber;
	}
	public static int getDigitCount(int number){
		int count = 0;
		if(number > 0){
			while(number != 0){
				int temp = number % 10;
				count++;
				number /= 10;
			}
			return count;
		}else if(number == 0){
			return 1;
		}
		return -1;
	}
	public static void main(String [] args){
		System.out.println(getDigitCount(10));
		numberToWords(10);
		numberToWords(100);
		numberToWords(1000);
		numberToWords(10000);
		numberToWords(2435);
		System.out.println(reverse(-121));
		
	}
}