import java.util.*;

public class ArrayListW3Exercise{	
	public static void main(String [] args){
		ArrayList<String> str = new ArrayList<>();
		str.add("Yellow");
		str.add("Red");
		str.add("Violet");
		str.add("Blue");
		str.add("Green");
		System.out.println("Collection output: "+str);
		String [] strArray = new String[str.size()];
		strArray = str.toArray(strArray);
		for(String iterator : strArray)
			System.out.print(iterator + " color ");
		System.out.println();
		ListIterator <String> strIterator = str.listIterator();
		while(strIterator.hasNext())
			System.out.print(strIterator.next()+ " ");
		str.add(0,"Black");
		System.out.println();
		System.out.println("after inserting the values: "+str);
		String retrieval = str.get(1);
		System.out.println(retrieval);
		str.set(1,"Orange");
		System.out.println("String now: "+str);
		str.remove(2);
		System.out.println("after removal: "+str);
		Scanner sc = new Scanner(System.in);
		String findElement = sc.nextLine();
		int findIndex = str.indexOf(findElement);
		System.out.println("finding the index of "+findElement + ": "+ findIndex);
		// strArray = str.toArray(strArray);
		// String temp = null;
		/* for(int i = 0; i < str.size();i++){
			for(int j = i+1; j < str.size(); j++){
				if(strArray[i] > strArray[j]){
					temp = strArray[i];
					strArray[i] = strArray[j];
					strArray[j] = temp;
				}
			}
		}
		for(String afterSort: strArray)
			System.out.print(afterSort + " ");
		System.out.println(); */
		Collections.sort(str);
		ArrayList<String> sortedArray = new ArrayList<>();
		sortedArray = str;
		System.out.println(sortedArray);
		ArrayList<String> atr = new ArrayList<>();
		atr.add("A");
		atr.add("B");
		atr.add("C");
		atr.add("D");
		Collections.copy(str,atr);
		System.out.println(str+ " " +atr+ " ");
		Collections.shuffle(str);
		System.out.println(str);
	}
}