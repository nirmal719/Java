class Outer2{
	int i = 10;
	void print(){
		System.out.println((i+2));
		class Inner2{
				void conditionalCalculator(){
					int result = i%2;
					System.out.println(i);
					System.out.println(i+ " " +result);
				}
		}
		Inner2 in2 = new Inner2();
		in2.conditionalCalculator();
	}
}
public class LocalInnerClassExample{
	public static void main(String [] args){
		Outer2 out2 = new Outer2();
		out2.print();
	}
}
