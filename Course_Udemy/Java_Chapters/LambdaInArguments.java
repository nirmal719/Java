interface Details{
	int details(int n, int o);
}
public class LambdaInArguments{
	public static int sum(Details dt,int a, int b){
		return dt.details(a,b);
	} 
	public static void main(String [] args){
		int result = sum((a,b)->{
				if(a == 0)
					return b;
				else if(b == 0)
					return a;
				else 
					return a+b;
			},10,0);
		System.out.println(result);
	}
}