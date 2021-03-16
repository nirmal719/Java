public class LinkedList1{
	static Node head;
	static class Node{
		int data;
		Node next;
		
	Node(int d){
		data = d;
		next = null;
	}
	}
	
	public static void firstAdd(int d){
		Node temp = head;
		Node firstNode = new Node(d);
		if (temp == null){
			head = firstNode;
			return;
		}
		firstNode.next = head;
		head = firstNode;
	}
	
	public static void lastAdd(int d){
		Node n = head;
		Node lastNode = new Node(d);
		
		if (n == null){
			head.next = lastNode;
			return;
		}
		
		while(n.next != null){
			n = n.next;
		}
		n.next = lastNode;
		lastNode.next = null;
		return;
	}
	
	public static void addAtPosition(int position,int d){
		Node temp = head;
		Node positionNode = new Node(d);
		Node previous = null;
		if (temp == null){
			head.next = positionNode;
			return;
		}
		
		for (int i = 0;i<position;i++){
			
			temp = temp.next;
		}
		previous = temp;
		positionNode.next = previous.next;
		previous.next = positionNode;
		return;
	}
	
	public static void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

public static void main(String [] args){
	LinkedList1 list1 = new LinkedList1();
	
	list1.firstAdd(10);
	list1.firstAdd(20);
	list1.firstAdd(30);
	
	list1.lastAdd(90);
	list1.lastAdd(29);
	list1.lastAdd(39);
	
	list1.addAtPosition(2,15);
	list1.addAtPosition(1,24);
	
	list1.display();
}

}
	
	
	