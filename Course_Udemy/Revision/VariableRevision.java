class Revision{
	static int i = 0;
	Revision (int a){
		i = a;
		System.out.println(i);
	}
	void print(){
		i = 20;
		System.out.println(i);
	}
}
public class VariableRevision{
	static int j = 10;
	public static void main(String [] args){
		Revision rev = new Revision(10);
		rev.print();
		System.out.println(new VariableRevision().j);
	}
}