class Details{
	static int x = 100;
	static{
		System.out.println("Welcome");
	}
}
class Com_Shrishti_Training_Details{
	static{
		System.out.println("Hello Shrishti");
	}
}
public class Challenge26{
	static{
		System.out.println("Hello");
	}
	public static void main(String [] args) throws Exception{
		Class.forName("Com_Shrishti_Training_Details");
		// Class.forName("Details");
	}
}
