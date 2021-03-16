class Node{
	int data;
	Node next;
	
	Node (int d){
		data = d;
		next = null;
	}
}

class RepetitiveInteger{
	Node head;
	public void insertFromEnd(int number){
		Node newNode = new Node(number);
		Node temp = head;
		if(temp == null){
			head = newNode;
			return;
		}
		newNode.next = null;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
	}
	public int findingRepetition(int value){
		Node temp = head;
		int timesOfIteration = 0;
		while(temp != null){
			if(temp.data == value){
				timesOfIteration++;
				temp = temp.next;
			}
			else{
				temp = temp.next;
			}
		}
		return timesOfIteration;
	}
	
	public void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}
}

public class RepetitionOfInteger{
	public static void main(String [] args){
		RepetitiveInteger rit = new RepetitiveInteger();
		rit.insertFromEnd(10);
		rit.insertFromEnd(20);
		rit.insertFromEnd(30);
		rit.insertFromEnd(20);
		rit.insertFromEnd(10);
		int val = 30;
		int repeatNumber = rit.findingRepetition(val);
		System.out.println(repeatNumber);
		
		rit.display();
	
	}

}