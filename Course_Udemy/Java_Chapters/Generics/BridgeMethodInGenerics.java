class A<T> {
	T ob;
	A(T o){
		ob = o;
	}
	T getOb(){
		return ob;
	}
}
class B extends A<String>{
	B(String o){
		super(o);
	}
	String getOb(){
		System.out.println("inside getOb method");
		return ob;
	}
}
public class BridgeMethodInGenerics{
	public static void main(String [] args){
		B str = new B("Test Drive");
		System.out.println(str.getOb());
	}
}