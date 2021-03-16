import java.util.ArrayList;

public class ArrayListDemo{
	public static void main(String [] args){
		ArrayList <String> arr = new ArrayList<String> ();
		System.out.println("Initial size of list: "+arr.size());
		arr.add("Nirmal");
		arr.add("Suma");
		arr.add("Rehan");
		arr.add("Hyma");
		arr.add("Birbal");
		arr.add("Ram");
		System.out.println("size of list after addition: "+arr.size());
		arr.remove("Hyma");
		arr.remove("Suma");
		System.out.println("size of list after removal: "+arr.size());
		System.out.println("Contents of arraylist: "+arr);
	}
}