class Gen <T> {
	T ob;
	Gen(T o){
		ob = o;
	}
	T getOb(){
		return ob;
	}
}
public class GenericRawType{
	public static void main(String [] args){
		Gen<Integer> ob1 = new Gen<Integer>(98);
		System.out.println(ob1.getOb());
		Gen<String> ob2 = new Gen<String>("Raw Type");
		ob2.getOb();
		Gen ob3 = new Gen(new Double(829.90));
		Double d = (Double) ob3.getOb();
		System.out.println("after casting: "+d);
		ob2 = ob3;
	}
}
