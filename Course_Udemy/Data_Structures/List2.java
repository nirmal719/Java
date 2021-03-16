public class List2{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void insertAtLast(int d){
		Node temp = head;
		Node newNode = new Node(d);
		
		if (temp == null){
			head = newNode;
			return;
		}
		newNode.next = null;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public int countIteration(){
		Node temp1 = head;
		int count = 0;
		while(temp1 != null){
			count += 1;
			temp1 = temp1.next;
		}
		return count;
	}
	
	public void sortingList(){
		Node temp = head;
		int d = 0;
		int iteration = countIteration();
		for (int i = 0; i< iteration;i++){
		while(temp.next != null){
			if (temp.data < temp.next.data){
				d = temp.next.data;
				temp.next.data = temp.data;
				temp.data = d;
			}
			temp = temp.next;
		}
		temp = head;
	}
		System.out.print("sorted list: ");
		display();
		System.out.println();
	}
	
	public void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	
	}
	
	
	public static void main(String [] args){
		List2 list2 = new List2();
		
		list2.insertAtLast(10);
		list2.insertAtLast(20);
		list2.insertAtLast(30);
		list2.insertAtLast(40);
		list2.insertAtLast(50);
		list2.sortingList();
	}
}
