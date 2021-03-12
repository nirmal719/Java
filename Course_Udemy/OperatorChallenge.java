public class OperatorChallenge{
	public static void main(String [] args){
		double d1 = 20.00;
		double d2 = 80.00;
		double result = d1 + d2 * 100;
		double remainder = result % 40.00;
		boolean isRemainder = false;
		if(remainder == 0){
			isRemainder = true;
		}else{
			isRemainder = false;
		}
		if(!isRemainder){
			System.out.println("Got some remainder: "+remainder);
		}else{
			System.out.println("No remainder");
		}
	}
}