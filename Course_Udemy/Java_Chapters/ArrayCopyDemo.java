public class ArrayCopyDemo{
	public static void main(String [] args){
		int [] a = {1,2,3,4,5,6,7};
		int [] b = {10,20,30,40,50,60,70};
		System.arraycopy(b,0,a,3,a.length - 3);
		System.arraycopy(a,0,b,0,a.length);
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+ " ");
		}
		N
		
	}
}