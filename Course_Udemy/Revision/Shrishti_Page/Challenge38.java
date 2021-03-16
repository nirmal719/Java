class Employee{
	static void check() throws RuntimeException{
		try{
			System.out.println("checking");
			if(true)
				throw new RuntimeException();
			System.out.println("testing");
		}catch(Exception e){
			System.out.println("exception");
		}
	}
}
public class Challenge38{
	public static void main(String [] args) {
		try{
			Employee.check();
			System.out.println("completed");
		}catch(RuntimeException e){
			System.out.println("runtime");
		}
		/* Employee.check();
		System.out.println("completed"); */
	}
}
