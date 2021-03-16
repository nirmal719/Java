public class StaticBlockExample1{
	static int i;
	int j;
	public static void main(String [] args){
		display();
	}
	public static void display(){
		i = 10;
		System.out.println("In the static method " +i);
	}
	static{
		i = 20;
		System.out.println("In the static block " +i);
	}
}