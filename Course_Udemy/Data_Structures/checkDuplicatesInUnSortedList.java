class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}
class CheckDuplicates{
	Node head;
	public void insertInEnd(int number){
		Node temp = head;
		Node newNode = new Node(number);
		if(head == null){
			head = newNode;
			return;
		}
		newNode.next = null;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
		return;
	}
	public void reverseList(){
		Node temp = head;
		Node nextNode = null;
		Node prevNode = null;
		while(temp != null){
			nextNode = temp.next;
			temp.next = prevNode;
			prevNode = temp;
			temp = nextNode;
		}
		head = prevNode;
	}
	public void checkDuplicates(){
		Node temp = head;
		Node nextNode = null;
		Node prevNode = null;
		while(temp != null){
			nextNode = temp.next;
			while(nextNode != null){
				if(temp.data == nextNode.data){
					
				}
				nextNode = nextNode.next;
			}
			temp = temp.next;
		}
	}
	
	public void display(){
		if(head == null){
			System.out.println("List is empty");
		}else{
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		}
	}
}
public class checkDuplicatesInUnSortedList{
	public static void main(String [] args){
		CheckDuplicates check = new CheckDuplicates();
		check.insertInEnd(9);
		check.insertInEnd(12);
		check.insertInEnd(2);
		check.insertInEnd(25);
		check.insertInEnd(9);
		check.insertInEnd(26);
		System.out.println("Original list: ");
		check.display();
		// System.out.println("\n"+"After reversing the list:");
		// check.reverseList();
		// check.display();
		check.checkDuplicates();
		System.out.println("\n"+"After removing duplicates:");
		check.display();
	}
}
