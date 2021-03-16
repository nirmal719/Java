class Node {
	int data;
	Node next;
	
	Node(int d){
		data = d;
		next = null;
	}
}

class ListCreationInLoop{
	static Node head;
	public void insert(int number){
		Node newNode = new Node(number);
		if(head == null){
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
		return;
	}
	public boolean detectLoop(){
		Node p1 = head;
		Node n1 = head;
		int loopLength = 0;
		boolean loopDetection = false;
		while(p1 != null && n1 != null && n1.next != null){
			p1 = p1.next;
			n1 = n1.next.next;
			loopLength++;
			if(p1 == n1){
				System.out.println("length of the loop: "+loopLength);
				loopDetection = true;
				return loopDetection;
			}
		}
		return loopDetection;
	}
}

public class LoopCreation{
	public static void main(String [] args){
		ListCreationInLoop lc = new ListCreationInLoop();
		for(int i = 50; i >= 10; i-=10){
			lc.insert(i);
		}
		lc.head.next.next.next.next.next = lc.head.next;
		boolean loopTester = lc.detectLoop();
		if(loopTester){
			System.out.println("loop detected");
		}else{
			System.out.println("loop not detected");
		}
	}
}