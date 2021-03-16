public class ClassAndObject{
	private String name;
	private int empId;

	public ClassAndObject(String name, int empId){
		super();
		name = name;
		empId = empId;
	}
	public void print(){
		System.out.println("name: " + name);
		System.out.println("empid: " + empId);
	}
	public static void main(String [] args){
		ClassAndObject cao = new ClassAndObject("Raju", 100);
		cao.print();
	}
}