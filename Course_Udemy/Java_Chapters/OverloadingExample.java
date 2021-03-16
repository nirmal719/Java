public class OverloadingExample{
	void calcArea(int i){
		System.out.println("method 1: "+i*i);
	}
	void calcArea(int i, int j){
		System.out.println("method 2: " +i*j);
	}
	public void calcArea(int a){
		System.out.println("print error");
	}
	public static void main(String [] args){
		OverloadingExample shape = new OverloadingExample();
		shape.calcArea(10);
		shape.calcArea(10,20);
		shape.calcArea((int)10.5f);
	}
}
