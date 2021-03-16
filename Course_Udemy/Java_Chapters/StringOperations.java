public class StringOperations{
	public static void main(String [] args){
		char name [] = {'a','b','b','x','r','t','o'};
		String s = new String (name);
		// System.out.println(s);
		
		String s1 = new String(name,2,3);
		// System.out.println(s1);
		
		String s2 = new String(s);
		// System.out.println(s2);
		
		byte ascii[] = {98,99,100,101};
		String s3 = new String(ascii);
		System.out.println(s3);
		String s4 = new String(ascii,2,2);
		System.out.println(s4);
		
		String s5 = "four : " + (2+2);
		System.out.println(s5);
	
	}

}