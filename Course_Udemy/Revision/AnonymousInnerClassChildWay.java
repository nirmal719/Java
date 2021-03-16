class Test{
	void output(){
		System.out.println("In the base class");
	}
}

public class AnonymousInnerClassChildWay{
	static Test tt = new Test(){
		void output(){
			super.output();
			System.out.println("In the child class");
		}
	};
	public static void main(String [] args){
		tt.output();
	}
}