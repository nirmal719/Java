public class DuplicatesElementFinding{
	public static void main(String [] args){
		int [] arr = {2,1,23,5,4,5};
		int duplicateElement = 0;
		int repeatingInstances = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j< arr.length; j++){
				if(arr[i] == arr[j]){
					duplicateElement = arr[j];
					repeatingInstances++;
				}
			}	
		}
		if(repeatingInstances > 0){
				System.out.println("number "+duplicateElement+" is being repeated for "+repeatingInstances+ " times"); 
			}else{
				System.out.println("No number is getting repeated");
			}
		
		
	}
}