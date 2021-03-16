public class GCD{
	public static int findGCD(int a, int b){
		if((a > 10) && (b > 10)){
			if(a > b){
				int temp = a % b;
				if( temp == 0){
					return b;
				}else{
					while(temp > 0){
						a = b;
						b = temp;
						temp = a % b;
					}
					return b;
				}
			}else if(b > a){
				int temp = b % a;
				if (temp == 0){
					return a;
				}else{
					while(temp > 0){
						b = a;
						a = temp;
						temp = b % a;
					}
					return a;
				}
			}
		}
		return -1;
	}
	public static void main(String [] args){
		System.out.println(findGCD(153,81));
		System.out.println(findGCD(81,153));
		System.out.println(findGCD(25,15));
		System.out.println(findGCD(12,30));
		System.out.println(findGCD(9,18));
	}
}