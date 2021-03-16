class MyException extends Exception{
	int detail;
	MyException (int a){
		detail = a;
	}
	public String toString(){
		return "detail";
	}
}
public class ExceptionPractice{
	static void compute(int a) throws MyException{
		throw new MyException(a);
	}
	public static void main(String[] args){
		try{
			compute(3);
		}catch(MyException e){
			System.out.println("Exception");
		}
	}
}