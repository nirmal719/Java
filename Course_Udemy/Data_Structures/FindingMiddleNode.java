class Node{
	int data;
	Node next;
	
	Node(int d){
		data = d;
		next = null;
	}
}

class MiddleNode{
	Node head;
	public void insertFromBegin(int number){
		Node newNode = new Node(number);
		if(head == null){
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	public int calculateLength(){
		Node temp = head;
		int length = 0;
		while(temp != null){
			temp = temp.next;
			length++;
		}
		return length;
	}
	
	public int findingMiddleNodeInList(){
		Node temp = head;
		int size = calculateLength();
		for(int i = 0; i < size/2 && temp != null; i++){
			temp = temp.next;
		}
		return temp.data;
	}
	
	public int middleNodeThroughReference(){
		Node p1 = head;
		Node n1 = head;
		int size = calculateLength();
		if(size % 2 == 0){
			while(n1.next.next != null){
				p1 = p1.next;
				n1 = n1.next.next;
			}
			return p1.data;
		}else{
			while(n1.next != null){
				p1 = p1.next;
				n1 = n1.next.next;
			}
			return p1.data;
		}
	}
	
	public void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}
	
}

public class FindingMiddleNode{
	public static void main(String [] args){
		MiddleNode mn = new MiddleNode();
		for(int i = 60; i >= 10; i-=10){
			mn.insertFromBegin(i);
		}
		int middleNode = mn.findingMiddleNodeInList();
		System.out.println(middleNode);
		int middleNodeReference = mn.middleNodeThroughReference();
		System.out.println(middleNodeReference);
		mn.display();
	}
}