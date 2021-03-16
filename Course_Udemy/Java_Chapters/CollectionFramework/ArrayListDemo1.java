import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1{
	public static void main(String [] args){
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		numbers.ensureCapacity(20);
		System.out.println("numbers' size: "+numbers.size());
		numbers.add(0);
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		System.out.println("numbers' size: "+numbers.size());
		System.out.println("numbers: "+numbers);
		Integer[] newArray = new Integer[numbers.size()];
		newArray = numbers.toArray(newArray);
		// System.out.print("numbers: "+"[");
		/* for(int i = 0; i < numbers.size()-1; i++){
			System.out.print(newArray[i]+ ", ");
		} */
		
		// System.out.print(newArray[numbers.size()-1]+"]");
		int product = 1;
		for(int content:newArray){
			product *= content;
			System.out.print(content+ " ");
		}
		System.out.println("product: "+product);
	}
}