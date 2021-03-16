import java.util.*;

public class ForEachDemo{
	public static void main(String [] args){
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(10);
		arr1.add(3);
		arr1.add(4);
		arr1.add(2);
		arr1.add(8);
		int sum = 0;
		for(int value:arr1){
			sum += value;
		}
		System.out.println("contents of array: "+arr1);
		System.out.println("Sum of array: "+sum);
	}
}