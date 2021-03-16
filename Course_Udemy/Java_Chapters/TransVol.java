public class TransVol{
	transient int i = 10;
	public static void main(String [] args){
		TransVol trv = new TransVol();
		int b = 20;
		System.out.println(trv.i + " "+ b);
		int c = trv.i+b;
		System.out.println(trv.i + " " + b + " "+ c);
	}
}