class Employee{
	int allowance = 1000;
	void calcBonus(){
		allowance += 200;
		System.out.println("EmpBonus");
	}
}

class Manager extends Employee{
	int allowance = 500;
	void calcBonus(){
		allowance += 200;
		System.out.println("MgrBonus");
	}
}

public class OverridingExample2{
	public static void main(String [] args){
		Employee employee = new Manager();
		Manager mgr = new Manager();
		System.out.println(mgr.allowance);
		mgr.calcBonus();
		System.out.println(mgr.allowance);
		System.out.println(new Manager().allowance);
		new Manager().calcBonus();
		System.out.println(new Manager().allowance);
		employee.calcBonus();
		System.out.println(employee.allowance);
	}
}
