public class ArraySorting1{
	public static void main(String [] args){
		int [] num = {15,5,12,4,3};
		int temp = 0;
		int size = num.length;
		for(int i = 0; i < size; i++){
			for(int j = i+1; j < size; j++){
				if(num[i] > num[j]){
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}System.out.println("Sorted Array : " );
		for(int k = 0; k < size; k++){
			System.out.print(num[k] + " ");
		}
	}
}