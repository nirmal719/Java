class AddSub{
	int a;
	int b;
	
	AddSub(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int addition(){
		return a+b;
	}
	
	public int subtraction(){
		if(a > b){
			return a-b;
		}else{
			return b-a;
		}
	}
}

class AddThread implements Runnable{
	// Thread t1;
	AddSub adsb = new AddSub(10,20);
	AddThread(){
		/* t1 = new Thread(this, "t1");
		t1.start(); */
		System.out.println("Inside First thread ");
	}
	public void run(){
		int sum = adsb.addition();
		System.out.println(sum);
	}

}

class SubThread implements Runnable{
	// Thread t2;
	AddSub adsb = new AddSub(10,20);
	SubThread(){
		/* t2 = new Thread(this,"t2");
		t2.start(); */
		System.out.println("Inside Second thread ");
	}
	public void run(){
		int sub = adsb.subtraction();
		System.out.println(sub);
	}
}

public class TwoThreads{
	public static void main(String [] args){
		AddThread ad = new AddThread();
		SubThread sb = new SubThread();
		Thread t1 = new Thread(ad,"t1");
		Thread t2 = new Thread(sb,"t2");
		t1.start();
		System.out.println("Exiting the first thread");
		t2.start();
		System.out.println("Exiting the second thread");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("Interruption occured");
		}
		System.out.println("Exiting the main thread");
	}
}