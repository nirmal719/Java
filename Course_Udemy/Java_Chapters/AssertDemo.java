public class AssertDemo{
	static int val = 10;
	
	static int getNum(){
		return val--;
	}
	public static void main(String [] args){
		int n;
		for(int i=0; i < 10; i++){
			n = getNum();
		assert n > 5;
		System.out.println("n is " +n);
		}
	}
}