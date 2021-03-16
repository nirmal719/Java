class Outer1{
	int i = 10;
	void print(){
		System.out.println(i);
	}
	class Inner1{
		int j = 20;
		void print1(){
			System.out.println(i+ " " +j);
		}
	}
}

public class InnerClassRevision{
	public static void main(String [] args){
		Outer1 out = new Outer1();
		out.print();
		Outer1.Inner1 in;
		in = out.new Inner1();
		in.print1();
	}

}