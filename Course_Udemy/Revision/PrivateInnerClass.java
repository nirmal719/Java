class RootOuterClass{
	private int i = 10;
	 private void output(){
		 System.out.println("In the outer class");
	 }
	class RootInnerClass extends RootOuterClass{
		private void output(){
			System.out.println("In the inner class");
		}
		void display(){
			System.out.println(i);
		}
	}
}
public class PrivateInnerClass{
	public static void main(String [] args){
		RootOuterClass.RootInnerClass ric = new RootOuterClass().new RootInnerClass();
		ric.display();
	}
}
