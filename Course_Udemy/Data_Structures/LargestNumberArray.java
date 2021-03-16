public class LargestNumberArray{
	public static void main(String [] args){
		int [] num = {90, 20, -130, 58, 163};
		int size = num.length;
		int second = 0;
		int temp = 0;
		for(int i = 0; i < size; i++){
			for(int j = i+1; j < size; j++){
				if(num[i] > num[j]){
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}
		System.out.println("largest number is: "+num[size-1]);
	}
}