public class Elapsed{
	public static void main(String [] args){
		long start, end = 0L;
		start = System.nanoTime();
		System.out.println(start);
		for(long i = 0; i < 100000000L; i++)
			end = System.nanoTime();
		System.out.println(end);
		System.out.println("Elapsed time is: " +(end-start));
	}
}