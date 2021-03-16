public class RuntimeMemoryDemo{
	public static void main(String [] args){
		Runtime r = Runtime.getRuntime();
		long mem1, mem2;
		int [] values = new int[1000];
		System.out.println("Total memory is: " +r.totalMemory());
		mem1 = r.freeMemory();
		System.out.println("free memory initially is: " +r.freeMemory());
		r.gc();
		System.out.println("free memory after garbage collection is: " +r.freeMemory());
		for(int i = 0; i < 1000; i++){
			values[i] = new Integer(i);
		}
		mem2 = r.freeMemory();
		System.out.println("free memory is: " +r.freeMemory());
		System.out.println("total memory used by initialization: " +(mem2-mem1));
	}
}