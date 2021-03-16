public class PowThread{
	public int calculateResult(int base1, int power1, int base2, int power2){
		int result;
		
		PowCalculator t1 = new PowCalculator(base1, power1);
		PowCalculator t2 = new PowCalculator(base2, power2);
		
		t1.start();
		t2.start();
		
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		int result1 = t1.getResult();
		int result2 = t2.getResult();
		result = result1 + result2;
		
		return result;
	
	}
	
	private static class PowCalculator extends Thread{
		private int result = 1;
		private final int base;
		private final int power;
		
		public PowCalculator(int base, int power){
			this.base = base;
			this.power = power;
		}
		
		public void run(){
			/* for(int i = power; i > 0; i--){
				result *= base;
			} */
			
			for(int i = 0; i < power; i++){
				result *= base;
			}
			
		}
		public int getResult(){
			return result;
		}
	}
	
	public static void main(String [] args){
		PowThread pt = new PowThread();
		int outcome = pt.calculateResult(4,3,5,3);
		System.out.println(outcome);
	}

}