interface MyNum{
	void numDisplay(int n);
}
class MyNumOperations{
	public void numOperations(int a){
		if(a%10 == 0)
			System.out.println("Divisible by 10");
		else if(a % 2 != 0)
			System.out.println("Odd Number");
		else 
			System.out.println("random number");
	}
}

public class NumOperationsReference{
	//public void callingMethod(MyNum mn, int j){
		//mn.numDisplay(j);
	//}
	public static void main(String [] args){
		int number = 22;
		//NumOperationsReference nor = new NumOperationsReference();
		MyNumOperations mno = new MyNumOperations();
		//nor.callingMethod(mno::numOperations,number);
		MyNum num = mno::numOperations(number);
	}
}