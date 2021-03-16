public class ExceptionPractice4{
	public static void main(String [] args){
		try{
			int a = args.length;
			int b = 10/a;
			System.out.println("a");
			try{
				if(a == 1)
					a = a/a-a;
				if(a == 2){
					int arr[] = new int[8];
					arr[8] = 9;
				}
			}catch(ArrayIndexOutOfBoundsException are){
				System.out.println("Type A");
			}
		catch(ArithmeticException ae){
			System.out.println("Type B");
		}
		}
	}
}