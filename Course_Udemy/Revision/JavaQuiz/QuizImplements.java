interface A{
	void print();
	void increment();
}
abstract class B implements A{
	public void print(){
		System.out.println("implementing interface");
	}
}
class C extends B{
	public void print(){
		System.out.println("extending the class B");
	}
	public void increment(){
		int i = 10;
		System.out.println(i++);
	}
}

public class QuizImplements{
	public static void main(String [] args){
		C b = new C();
		b.print();
		b.increment();
	}
}