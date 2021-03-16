class MyClass{
	int a = 10;
	int x = 9;
	int y = 8;
}

class FirstClass extends MyClass{
	int l = 98;
	
}

class SecondClass extends FirstClass{
	int b = 19;
}

public class DerivedTypeInference{
	static MyClass getObj(int which){
		switch(which){
			case 0: return new MyClass();
		}
		return new MyClass();
	}
	
	static FirstClass getObj1(int i){
		switch(i){
			case 0: return new FirstClass();
		}
		return new FirstClass();
	}
	
	static SecondClass getObj2(int j){
		switch(j){
			case 0: return new SecondClass();
		}
		return new SecondClass();
	}
	
	public static void main(String [] args){
		var mc = getObj(0);
		System.out.println(mc.a);
		
		var mc1 = getObj1(0);
		System.out.println(mc1.l);
		
		var mc2 = getObj2(0);
		System.out.println(mc2.b);
	}
}