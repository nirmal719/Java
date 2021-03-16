public class TestApp{
	// int i[] = {0};
	int i = 0;
	public static void main(String [] args){
		TestApp tap = new TestApp();
		// int i[] = {1};
		int i = 1;
		alter(i);
		// System.out.println(tap.i[0]);
		System.out.println(i);
	}
	static void alter(int i){
		// int j[] = {2};
		int j = 2;
		j = i;
		// i = j;
		// System.out.println(j[0]);
	}
}