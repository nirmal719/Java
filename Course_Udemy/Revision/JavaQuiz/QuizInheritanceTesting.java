class A{
	int i = 10;
	public void print(){
		System.out.println(i++);
	}
}

class B extends A{
	int j = 20;
	public void print(){
		System.out.println(j++);
	}
}

public class QuizInheritanceTesting{
	public static void main(String [] args){
		//A a = new B();
		B b = new A();
		b.print();
		
	}
}