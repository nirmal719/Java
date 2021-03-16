// import java.math.BigInteger;
import java.util.Scanner;

public class CalculatePower{
	/*
	public BigInteger CalculateResult(BigInteger base1, BigInteger power1, BigInteger base2, BigInteger power2){
		BigInteger result;
		
		
		return result;
	
	}
	*/
	private static class PowerCalculatingThread extends Thread{
		/* private BigInteger result = BigInteger.ONE;
		private BigInteger base;
		private BigInteger power; */
		
		private int result = 1;
		private int base;
		private int power;
		
		public PowerCalculatingThread(int base, int power){
			this.base = base;
			this.power = power;
		}
		
		@Override
		public void run(){
			/* for(BigInteger i = power; i.compareTo(power) > 0; i = i.subtract(BigInteger.ONE)){
				result = result.multiply(base);
			} */
			
			for (int i = power; i > 0; i--){
				result *= base;
			}
		}
		/* public BigInteger getResult(){
			return result;
		}
	 */
	 
	 public int getResult(){
		 return result;
	 }
	}
	
	public static void main(String [] args){
		// Scanner sc = new Scanner(System.in);
		//BigInteger base1 = sc.nextBigInteger();
		/* BigInteger result1;
		BigInteger result2;
		BigInteger result; */
		// PowerCalculatingThread t1 = new PowerCalculatingThread(new BigInteger("4"),new BigInteger("5"));
		int result1;
		int result2;
		int result;
		PowerCalculatingThread t1 = new PowerCalculatingThread(4,5);
		PowerCalculatingThread t2 = new PowerCalculatingThread(5,5);
		/* try{
			t1.start();
			Thread.sleep(1000);
		} catch(InterruptedException e){
			System.out.println("first thread interrupted");
		}
		
		try{
			t2.start();
			Thread.sleep(100);
		}catch(InterruptedException e1){
			System.out.println("second thread interrupted");
		} */
		
		t1.start();
		t2.start();
		
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		result1 = t1.getResult();
		System.out.println(result1);
		result2 = t2.getResult();
		System.out.println(result2);
		// result = result1.add(result2);
		result = result1 + result2;
		System.out.println(result);
		
	}
}