class MyException2 extends Exception{
	int detail;
	MyException2(int a){
		detail = a;
	}
	public String toString(){
		return "detail";
	}
}
public class ExceptionPractice3{
	static void compute (int a) throws MyException2{
		throw new MyException2(a);
	}
	public static void main(String [] args){
		try{
			compute(3);
		}catch(DivideByZeroException de){
			System.out.print("Exception");
		}
	}
}