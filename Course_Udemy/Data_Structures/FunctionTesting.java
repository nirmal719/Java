public class FunctionTesting{
	public int addition(int i, int j){
		int result = i+j;
		return result;
	}
	public int mean(){
		int a = 10, b =20;
		int sum = addition(a,b);
		int mean = sum/2;
		return mean;
	}
	public void display(){
		int meanVal = mean();
		System.out.println("Mean value is: " +meanVal);
	}
	
	public static void main(String [] args){
		FunctionTesting ft = new FunctionTesting();
		// ft.mean(10,20);
		ft.display();
	}

}