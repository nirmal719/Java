import java.util.Random;

public class RandomDemo2{
	public static void main(String [] args){
		Random r = new Random();
		double value;
		for(int i = 0; i < 10; i++){
			value = r.nextGaussian();
			System.out.print(value+ " ");
		}
	}
}