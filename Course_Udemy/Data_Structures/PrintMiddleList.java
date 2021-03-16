public class PrintMiddleList{
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
	
	public int lengthList(){
		Node temp = head;
		int count = 0;
		while(temp != null){
			count += 1;
			temp = temp.next;
		}
		return count;
	}
	
	public void findMiddleList(){
		Node temp = head;
		int length = lengthList();
		int middleValue = (length % 2) + (length/2);
		for (int i = 1;i< middleValue;i++){
			temp = temp.next;
		}
		System.out.println("Middle Node's Value is:= " +temp.data);
	}
	
	public static void main(String [] args){
		PrintMiddleList pml = new PrintMiddleList();
		pml.insertList(10);
		pml.insertList(20);
		pml.insertList(30);
		pml.insertList(40);
		pml.insertList(50);
		pml.insertList(60);
		pml.insertList(70);
		
		pml.findMiddleList();
	}
}