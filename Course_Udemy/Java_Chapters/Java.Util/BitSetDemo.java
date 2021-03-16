import java.util.BitSet;

public class BitSetDemo{
	public static void main(String [] args){
		BitSet bits1 = new BitSet(10);
		BitSet bits2 = new BitSet(10);
		for(int i = 0; i < 10; i++){
			if(i % 2 == 0)
				bits1.set(i);
			if(i % 4 == 0)
				bits2.set(i);
		}
		bits2.and(bits1);
		System.out.println("bits2 and bits1");
		System.out.println(bits2);
		bits2.or(bits1);
		System.out.println("bits2 or bits1");
		System.out.println(bits2);
	}
}