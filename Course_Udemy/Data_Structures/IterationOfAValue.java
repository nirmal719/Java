public class IterationOfAValue{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void insertList(int d){
		Node temp = head;
		Node newNode = new Node(d);
		if(temp == null){
			head = newNode;
			return;
		}
		newNode.next= null;
		
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
 /* 	public int lengthList(){
		Node temp = head;
		int count = 0;
		while(temp != null){
			count += 1;
			temp = temp.next;
		}
		return count;
	} */
	
	public void valueIteration(int anyValue){
		Node temp = head;
		int iterationOfAValue = 0;
		// int length = lengthList();
		while(temp.next != null){
			if(temp.data == anyValue){
				iterationOfAValue += 1;
				System.out.println("iteration value: " +iterationOfAValue);
			}
			else if(temp.next.data == anyValue){
				iterationOfAValue += 1;
			}
			temp = temp.next;
		}
		System.out.println("Iteration of the given value is:= " +(iterationOfAValue-1));
	}
	
	public static void main(String [] args){
		IterationOfAValue itav = new IterationOfAValue();
		
		itav.insertList(10);
		itav.insertList(20);
		itav.insertList(30);
		itav.insertList(40);
		itav.insertList(50);
		itav.insertList(30);
		itav.insertList(30);
		
		itav.valueIteration(30);
	
	}


}