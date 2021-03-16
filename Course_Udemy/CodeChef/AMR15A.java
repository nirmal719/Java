import java.util.Scanner;

public class AMR15A{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int [N];
		for(int i = 0; i< N; i++){
			arr[i] = sc.nextInt();
		}
		int evenBattle = 0;
		int oddBattle = 0;
		for(int j = 0; j < N; j++){
			if (arr[j] % 2 == 0){
				evenBattle += 1;
			}else{
				oddBattle += 1;
			}
		}
		if(evenBattle > oddBattle){
			System.out.println("READY FOR BATTLE");
		}else{
			System.out.println("NOT READY");
		}
	}
}