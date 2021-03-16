public class Details{
	public void show(String name, String ...hobbies){
		System.out.println("Hello " +name);
		for(String hobby : hobbies)
			System.out.println(hobby);
	}
	public void show(String name){
		System.out.println("Welcome " +name);
	}
	public void show(String ...hobbies){
		for (String hobby : hobbies)
			System.out.println(hobby);
	}
	public static void main(String [] args){
		Details details = new Details();
		//details.show("Raju", "sports","music");
		details.show("Raju");
	}
}