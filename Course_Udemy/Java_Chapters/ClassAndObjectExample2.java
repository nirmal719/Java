public class ClassAndObjectExample2{
 	private String name;
	public ClassAndObjectExample2(String name){
		this.name = name;
	}
	public static void main(String [] args){
		ClassAndObjectExample2 cao2 = new ClassAndObjectExample2("Raju");
		ClassAndObjectExample2 cao3 = cao2;
		System.out.println(cao3.name);
		cao2.name = "Rohan";
		cao2 = null;
		System.out.println(cao3.name);
		System.out.println(cao2.name);
	}
	
}