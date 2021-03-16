interface AnonymousOne{
	int i = 20;
	void resultPrinting(int j);
}

public class AnonymousInnerWithInterface{
	static int val;
	public AnonymousInnerWithInterface(int b){
		val = b;
	}
	public static void innerValue(){
		AnonymousOne aone = new AnonymousOne(){
			public void resultPrinting(int b){
				if(b > 10){
					val += b;
					System.out.println("Correct Mode");
				}else{
					val -= b;
					System.out.println("Mode needs to be changed");
				}
				}
			};
			aone.resultPrinting(24);
		}
	public static void main(String [] args){
		AnonymousInnerWithInterface in = new AnonymousInnerWithInterface(12);
		innerValue();
	}
}