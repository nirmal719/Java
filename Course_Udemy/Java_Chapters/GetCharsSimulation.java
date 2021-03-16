import java.util.Scanner;

public class GetCharsSimulation{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String firstString = sc.nextLine();
		System.out.println("Enter the start indices of the string need to be extracted from: ");
		int start = sc.nextInt();
		System.out.println("Enter the end indices of the string till which it needs to be extracted: ");
		int end = sc.nextInt();
		char newOne[] = new char[end - start];
		System.out.println("Enter the start indices of the target array from which filling of array needs to be initialized: ");
		int startArrayIndices = sc.nextInt();
		for(int i = startArrayIndices; i < (end - start); i++){
			
		}
	}
	public static void readString(String s1){
		s1 = "Analogy found";
		
		
	}

}