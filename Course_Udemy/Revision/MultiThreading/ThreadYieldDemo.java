class YieldDemo extends Thread{
	public void run(){
		for(int i = 0; i <=5;i++){
			System.out.println(Thread.currentThread().getName()+ " - " +i);
		} 
	}
}
public class ThreadYieldDemo{
	public static void main(String [] args){
		YieldDemo yd = new YieldDemo();
		yd.start();
		Thread.yield();
		for(int j = 0; j <=5; j++){
			System.out.println(Thread.currentThread().getName()+ " - " +j);
		}
	}
}