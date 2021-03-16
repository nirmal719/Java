import java.util.Scanner;

public class CharacterExtraction{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String s = new String("new One");
		System.out.println("Enter the index position which needs to be extracted: ");
		int i = sc.nextInt();
		char value = s.charAt(i);
		System.out.println(value);
		
		char target[] = new char[5];
		String s1 = "second one";
		s1.getChars(0,5,target,0);
		System.out.println(target);
		
		String s2 = "charArray example";
		System.out.println(s2.toCharArray());
	}
}