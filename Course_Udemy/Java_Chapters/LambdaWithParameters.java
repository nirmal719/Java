interface Addition{
	int sum(int a, int b);
	static int difference(int i, int j){
		if(i < j)
			return (j-i);
		else
			return (i-j);
	}
}

public class LambdaWithParameters{
	public static void main(String [] args){
		Addition add = (a,b)-> {
			if(a == 0)
				return b;
			else if(b == 0)
				return a;
			else
				return (a+b);
		};
		System.out.println(add.sum(0,20));
		int result = Addition.difference(10,20);
		System.out.println(result);
	}
}