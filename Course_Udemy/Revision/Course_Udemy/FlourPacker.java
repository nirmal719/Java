public class FlourPack{
	public static boolean canPack(int bigCount, int smallCount, int goal){
		if((bigCount >= 0) && (smallCount >= 0) && (goal >= 0)){
			int bigKilo = bigCount * 5;
			int smallKilo = smallCount * 5;
			int sum = bigKilo + smallKilo;
			int diff = sum - goal;
			int compare = 0;
			if(sum == goal){
				return true;
			}else if(diff == 1 && (smallKilo != 0)){
				return true;
			}else if(compare == goal + smallCount){
				return true;
			}
			return false;
		}
		return false;
	}
	public static void main(String [] args){
		System.out.println(canPack(2,1,5));
	}
}