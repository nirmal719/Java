public class ThreadJoinDemo extends Thread{
	static Thread mainthread;
	public void run(){
		try{
			for(int i = 1; i<=5; i++){
				System.out.println("Child thread" +i);
				Thread.sleep(1000);
				mainthread.join();
			}
			}catch(Exception e){
				System.out.println(e);
		}
	}
	public static void main(String [] args){
		ThreadJoinDemo tjd = new ThreadJoinDemo();
		tjd.start();
		mainthread = Thread.currentThread();
		try{
			for(int j = 1; j<= 5; j++){
				System.out.println("main thread: "+j);
				Thread.sleep(1000);s
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}