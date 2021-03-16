interface A{
	int a = 10;
	void show();
}

interface B{
	int b = 19;
	void show1();
}

class State implements A{
	public void show(){
		System.out.println(a);
	}
}

class State1 implements B{
	public void show1(){
		System.out.println(b);
	}
}

public class ShowState{
	public static void main(String [] args){
		State st = new State();
		st.show();
		State1 st1 = new State1();
		st1.show1();
	}
}