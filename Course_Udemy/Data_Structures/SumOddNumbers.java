public class SumOddNumbers{
	public static void main(String [] args){
		int [] num = {94,95,56,83,12,27,64};
		int size = num.length;
		int sum = 0;
		for(int i = 0; i < size; i++){
			if(i % 2 != 0){
				sum += num[i];
			}
		}
		System.out.println(sum);
	}
	/* public static int calculateLength(int [] a){
		int size = 0;
		for (int i = 0; ;i++){
			if(a[i] == null){
				size++;
				break;
			}else{
				size++;
			}
		}
		return size;
	} */
}