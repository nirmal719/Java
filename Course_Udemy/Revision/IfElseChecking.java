public class IfElseChecking{
	int i = 10;
	void checkingLogic(){
		if(i == 10){
			i += 2;
		}
		System.out.println(i);
	}
	public static void main(String [] args){
		IfElseChecking ife = new IfElseChecking();
		ife.checkingLogic();
	}
}