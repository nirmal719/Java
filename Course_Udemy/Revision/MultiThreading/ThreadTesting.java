/* public class ThreadTesting extends Thread{
	public void run(){
		String Str = "Needy Person";
		System.out.println(Str);
	}
	public static void main(String [] args){
		ThreadTesting tt = new ThreadTesting();
		tt.start();
	}
} */
class Divisor{
	int i = 10;
	int j = 20;
	public int divide(){
		if(j/i < 2){
			System.out.println("wrong division");
		}else{
			System.out.println("Right Division");
		}
		int result = j/i;
		return result;
	}
}
class Multiplication{
	int i = 10;
	public void multiply(){
		int result1 = 0;
		for(int j = 0; j < i; j++){
			result1 = j * i;
			System.out.println(result1);
		}
	}
}

class Divider extends Thread{
	public void run(){
		Divisor dd = new Divisor();
		int divisor = dd.divide();
		System.out.println(divisor);
	}
}
class Multiplier extends Thread{
	public void run(){
		Multiplication mm = new Multiplication();
		mm.multiply();
	}
}
public class ThreadTesting {
	public static void main(String [] args){
		try{
			Divider tt = new Divider();
			Multiplier tt1 = new Multiplier();
			tt.start();
			Divider.sleep(100);
			System.out.println("Thread 2 started now");
			tt1.start();
		}catch(InterruptedException ie){
			System.out.println("Thread Interrupted");
		}
	}
}