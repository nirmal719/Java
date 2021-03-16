class OuterClass{
	void outerMethod(){
		int c = 20;
		System.out.println("In the outer method");
		abstract class InnerClass{
			abstract void print();
			InnerClass(){
				System.out.println("In inner constructor");
			}
		}
		class Inner2 extends InnerClass{
			public void print(){
				System.out.println("in the extend inner class");
			}
		}
		Inner2 i2 = new Inner2();
		i2.print();
	}
}
public class MethodLocalInnerClass{
	public static void main(String [] args){
		OuterClass oc = new OuterClass();
		oc.outerMethod();
	}
}
