class Employee{
	static void print(){
		System.out.print("In Employee");
	}
}
class Manager extends Employee{
	static void print(){
		System.out.print("In Manager");
	}
}
public class Challenge24{
	public static void main(String [] args){
		Employee employee = new Manager();
		employee.print();
	}
}