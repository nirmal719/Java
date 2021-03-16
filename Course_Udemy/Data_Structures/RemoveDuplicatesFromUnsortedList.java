class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}
class UnsortedList{
	Node head;
	public void insertInList(int number){
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
	public void removeDuplicates(){
		Node current = head;
		Node ahead = null;
		Node prev = null;
		while(current != null){
			ahead = current.next;
			while(ahead != null){
				if(current.data == ahead.next.data){
					ahead.next = ahead.next.next;
					break;
				}
				ahead = ahead.next;
			}
			current = current.next;
		}
	}
	
	public void display(){
		if(head == null){
			System.out.println("List is empty");
		}else{
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}
	
}
public class RemoveDuplicatesFromUnsortedList{
	public static void main(String [] args){
		UnsortedList unsort = new UnsortedList();
		unsort.insertInList(15);
		unsort.insertInList(5);
		unsort.insertInList(12);
		unsort.insertInList(5);
		unsort.insertInList(4);
		unsort.insertInList(3);
		System.out.println("Original List: ");
		unsort.display();
		unsort.removeDuplicates();
		System.out.println("\n"+"List after removing duplicates: ");
		unsort.display();
	}
}
