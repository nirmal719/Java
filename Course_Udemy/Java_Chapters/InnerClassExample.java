class OuterExample{
	int x = 10;
	void display(){
		// System.out.println("x: "+ x);
		InnerExample inner = new InnerExample();
		inner.print();
	}
		class InnerExample{
			int y = 20;
			void print(){
				System.out.println("x: " + x +", y : " +y);
			}
		}
	}

public class InnerClassExample{
	public static void main(String [] args){
		OuterExample outer = new OuterExample();
		outer.display();
		// InnerExample inner = new InnerExample();
		// inner.print();
	}
}