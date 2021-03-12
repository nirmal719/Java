public class UpToThreeDecimalPlaces{
	public static boolean areEqual(double a, double b){
		double a1 = a * 1000;
		double b1 = b * 1000;
		int a2 = (int)a1;
		int b2 = (int)b1;
		if(a2  == b2 ){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String [] args){
		boolean value = areEqual(3.175, 3.176);
		System.out.println(value);
		boolean value1 = areEqual(-3.1756, -3.175);
		System.out.println(value1);
		boolean value2 = areEqual(3.0, 3.0);
		System.out.println(value2);
		boolean value3 = areEqual(-3.123, 3.123);
		System.out.println(value3);
	}
}