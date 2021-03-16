public class InsertionSorting{
	public static void main(String [] args){
		int [] a = {5,4,10,6,1,2};
		int temp = 0;
		
		for(int i = 0; i < a.length; i++){
			for(int j = i+1; j < a.length;j++){
				temp = a[j];
				if(a[i] > temp){
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	
	}

}