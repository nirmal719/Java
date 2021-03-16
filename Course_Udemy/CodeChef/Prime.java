import java.util.Scanner;

public class Prime{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int [] arr = new int[T];
		for(int i = 0; i < T; i++){
			arr[i] = sc.nextInt();
		}
		int counter = 0;
		for(int j = 0; j < T; j++){
			for(int k = 2; k <= arr[j] - 1; k++){
				if(arr[j] % k == 0){
					counter += 1;
					break;
				}
			}
			System.out.println(counter);
			if(counter > 0){
				System.out.println("Not Prime");
			}else{
			System.out.println("Prime");
			}
			counter = 0;
		}
		
	}
}