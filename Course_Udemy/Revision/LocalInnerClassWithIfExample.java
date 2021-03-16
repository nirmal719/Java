interface Summation{
	int i =10;
	int sum(int i);
}
interface Multiplication{
	int j = 20;
	double product(int j);
}

class InnerFuel{
	String information = null;
	InnerFuel(String b){
		information = b;
	}
	void informationPrinting(int condition){
		if(condition >= 10){
			System.out.println(information+ " - this information is right " +condition);
		}else{
			System.out.println(information+ " - this information is wrong" + condition);
		}
	}
}

class Outer3{
	String msg = "This is Outer Class";
	int i;
	Outer3(String a, int j){
		msg = a;
		i = j;
	}
	void outerMethod(){
		if(i >= 6){
			System.out.println(msg);
			class Inner3 implements Summation, Multiplication{
				String receiver = "Msg is received, I am in Inner class";
				int result = 0;
				double product = 0.0;
				void msgReceiver(){
					System.out.println(msg+ " " +receiver);
				}
				public int sum(int argValue){
					result = argValue + 10;
					return result;
				}
				public double product(int value){
					int d = 4;
					while(d > 0){
						product = d * value;
						d--;
					}
					return product;
				}
			}
			Inner3 in3 = new Inner3();
			in3.msgReceiver();
			System.out.println(in3.sum(20));
			System.out.println(in3.product(25));
		}else{
			System.out.println(i + " " +msg);
			class Inner31 extends InnerFuel{
				Inner31(){
					super("hope it works");
				}
				void informationPrinting(int race){
					if(race > 0 ){
						System.out.println("positive comment");
					}else{
						System.out.println("negative comment");
					}
				}
			}
			Inner31 in31 = new Inner31();
			in31.informationPrinting(-20);
		}
	}
}
public class LocalInnerClassWithIfExample{
	public static void main(String [] args){
		Outer3 out3 = new Outer3("why this kolaveri di",7);
		out3.outerMethod();
	}
}