class ClassExample{
	int a;
	ClassExample(int i){
		a = i;
		System.out.println(a);
	}
}

public class InstanceVariables{
	public static void main(String [] args){
		/* ClassExample obj = new ClassExample();
		obj.a = 10;
		System.out.println(obj.a);
		ClassExample obj1 = new ClassExample();
		obj1.a = 20;
		System.out.println(obj1.a); */
		new ClassExample(10);
		ClassExample csa;
		csa = new ClassExample(20);
	}
}
