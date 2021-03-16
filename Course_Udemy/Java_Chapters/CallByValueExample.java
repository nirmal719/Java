class CallByValue{
	int demo(int i){
		i *= 2;
		return i;
	}
}

public class CallByValueExample{
	public static void main(String [] args){
		CallByValue cbv = new CallByValue();
		int a = 10;
		System.out.println("a: "+a);
		int j = cbv.demo(a);
		System.out.println(" a - after: and j after: " +a + " " +j);
		// int k = cbv.demo(20);
		
	}
}