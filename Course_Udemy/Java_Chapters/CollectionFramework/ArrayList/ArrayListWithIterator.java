import java.util.*;

public class ArrayListWithIterator{
	public static void main(String [] args){
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for(int i = 0; i <= 100; i+=10){
			alist.add(i);
		}
		ListIterator<Integer> it = alist.listIterator();
		while(it.hasNext()){
			System.out.println("values are: "+it.next());
		}
		alist.set(10,999);
		System.out.println("after setting the value: " +alist);
		System.out.println(alist.subList(2,6));
		LinkedList <Integer> list = new LinkedList<>();
		list.add(21);
		list.add(22);
		list.add(31);
		list.add(33);
		ArrayList<Integer> arlist = new ArrayList<>(list);
		arlist.add(10);
		System.out.println(arlist);
		int capacity = arlist.size();
		arlist.ensureCapacity(6);
		int increment = 24;
		while(increment <= 34){
			arlist.add(increment);
			increment += 10;
		}
		System.out.println(arlist+ " " +capacity+ " " +arlist.size());
		try{
		Integer [] arr = new Integer[10];
		arr = arlist.toArray(arr);
		System.out.println("array values are: ");
		for (int i = 0; i < 10; i++){
			int sum = 10;
			System.out.print((arr[i] + sum) + " ");
		}
		} catch(NullPointerException npe){
			System.out.println("null values found: ");
		}
	}
}