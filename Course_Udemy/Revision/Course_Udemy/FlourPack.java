/* Q. write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.
The parameter bigCount represents the count of big four bags (5 kilos each)
The parameter smallCount represents the count of big four bags (1 kilos each)
The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value
of goal. The method should return true if it is possible to make a package with goal kilos of
flour.

If the sum is greater than goal, ensure that only full bags are used towards the goal amount
For example, if goal = 9, bigCount = 2, smallCount = 0 , the method should return false since
each big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1
and smallCount = 5, the method should return true because of 1 full bigCount bag
and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.
if any of the parameters are negative, return false.
*/


public class FlourPack {
    // write your code here
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if((bigCount >= 0) && (smallCount >= 0) && (goal >= 0)){
            int bigKilo = 5 * bigCount;
            int smallKilo = 1 * smallCount;
            int sum = bigKilo + smallKilo;
            int remaining = sum - goal;
            int smallLeft = goal - smallCount;
            int bigLeft = goal - bigCount;
            if((remaining % 5 == 0) && (bigLeft < smallLeft)){
                return true;
            }else if((smallLeft % 5 == 0) && (bigCount > smallCount) || (bigLeft % 5 == 0) && (smallLeft < 5)){
                return true;
            }else if((sum % goal == 0) && (sum > goal)){
                return true;
            }else if(remaining == goal + smallCount){
                return true;
            }else if(sum == goal){
                return true;
            }else if((remaining < 5) && (remaining > 0) && (smallCount > bigCount)){
                return true;
            }
            return false;
        }
        return false;
    }
	public static void main(String [] args){
		System.out.println(canPack(2,1,5));
		System.out.println(canPack(1,0,4));
		System.out.println(canPack(1,0,5));
		System.out.println(canPack(0,5,4));
		System.out.println(canPack(2,2,11));
		System.out.println(canPack(-3,2,12));
	}
}