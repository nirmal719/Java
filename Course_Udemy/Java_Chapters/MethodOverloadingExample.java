class MethodOverloading{
	void test(){
		System.out.println("No Parameters");
	}
	/* void test(int i){
		System.out.println(" i:" +i);
	} */
	void test(int i, int j ){
		System.out.println("i and j: " +i + " " +j);
	}
	void test(double d){
		System.out.println("d : " +d);
	}
}
public class MethodOverloadingExample{
	public static void main(String [] args){
		MethodOverloading mol = new MethodOverloading();
		int i = 99;
		mol.test(i);
		mol.test(10,i);
		mol.test();
		// mol.test(938.98);
	}
}