public class CheckingLoopInList{
	static Node head;
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
		newNode.next = null;
		
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void loopChecking(){
		Node firstNode = head, secondNode = head;
		int demo = 0;
		int measuringLength = 0;
		while(firstNode != null && secondNode != null && secondNode.next != null){
			firstNode = firstNode.next;
			secondNode = secondNode.next.next;
			measuringLength += 1;
			if(firstNode == secondNode){
				demo = 1;
				break;
			}
		}
			if(demo == 1){
				System.out.println("Loop detected");
				System.out.println("length of loop is : " +measuringLength);
			}
			else{
				System.out.println("Loop Not detected");
			}
		}
	
	public static void main(String [] args){
		CheckingLoopInList chl = new CheckingLoopInList();
		
		chl.insertList(10);
		chl.insertList(2);
		chl.insertList(20);
		chl.insertList(3);
		chl.insertList(30);
		
		head.next.next.next.next = head;
		chl.loopChecking();
	}
		
}
