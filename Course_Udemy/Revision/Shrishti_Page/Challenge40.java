interface Greetable{
	void sayHello(String name);
}
class Details{
	 static void showMsg(String name){
		System.out.print("Hello "+name);
	}
}
public class Challenge40{
	public static void main(String [] args){
		Greetable ref =  Details::showMsg;
		ref.sayHello("Raju");
	}
}