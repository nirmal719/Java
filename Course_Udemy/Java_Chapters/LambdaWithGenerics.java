interface Versatile<T> {
	T foo (T t);
	static int division(int a, int b){
		int result = a+b;
		return result;
	}
}
interface Operations<P>{
	P arithmeticOperations(P p1, P p2);
}
interface DefaultOne{
	default int foo1(int a){
		System.out.println("Defining the method in interface and implementing in class " );
		return a;
	}
}
class Mul implements DefaultOne{
	public int foo1(int n){
		return n+10;
	}
}
public class LambdaWithGenerics{
	public static void main(String [] args){
		Versatile<String> vers = (str)-> {
			String result = "India";
			return (result + str);
		};
		Versatile<Integer> tile = (a)-> {
			int result = 0;
			if(a>0)
				result = 10 +a;
			else 
				result = (-1)*a;
			return result;
		};
		Operations<Integer> obj = (i,j)-> {
			int mod = i % j;
			return mod;
		};
		Mul mul = new Mul();
		int number = mul.foo1(10);
		// int product = mul.multiplication(10,2);
		int outcome = Versatile.division(102,20);
		Versatile obj1;
		// int outcome = div.division(10,20);
		System.out.println(outcome);
		// System.out.println(product);
		System.out.println(number);
		System.out.println(vers.foo(" - my Country"));
		System.out.println(tile.foo(-10));
		System.out.println(obj.arithmeticOperations(10,20));
	}
}