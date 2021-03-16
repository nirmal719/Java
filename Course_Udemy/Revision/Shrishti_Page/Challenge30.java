interface BonusDetails{
	double calcBonus(int amount);
}
class Employee {
	void show(BonusDetails details, int amount){
		System.out.println("Bonus " + details.calcBonus(amount));
	}
}
public class Challenge30{
	public static void main(String [] args){
		Employee employee = new Employee();
		/* employee.show(new BonusDetails(){
			public double calcBonus(int amount){
				return amount * 4;
			}
		}, 2000); */
		// employee.show((amount) -> return amount*4, 2000);
		// employee.show((amount)->amount*4, 2000);
		employee.show((amount)->{
			return amount *4;
		},200);
	}
}