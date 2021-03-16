public class NthNodeList{
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
		newNode.next = null;
		
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void findNthNode(int position){
		Node temp = head;
		if (temp == null){
			System.out.println("List is empty, no further searching possible " );
		}
		else{
		for (int i = 1;i< position;i++){
			temp = temp.next;
		}
		System.out.println("Nth Node value is=: " +temp.data);
	}
	}
	
	// public void displayList(){
		// Node temp = head;
		// while(temp != null){
			// System.out.print(temp.data + " ");
			// temp = temp.next;
		// }
	// }
	
	public static void main(String [] args){
		NthNodeList nth = new NthNodeList();
		
		nth.insertList(10);
		nth.insertList(20);
		nth.insertList(30);
		nth.insertList(40);
		nth.insertList(50);
		
		nth.findNthNode(3);
	}
	
	

}