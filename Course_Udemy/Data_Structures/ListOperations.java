import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}

class LinkedListOperations{
Scanner sc = new Scanner(System.in);
	Node head;
	
	public void insertFromEnd(int number){
		Node temp = head;
		Node newNode = new Node(number);
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
	
	public int calculateLength(){
		Node temp = head;
		int length = 0;
		while(temp != null){
			temp = temp.next;
			length++;
		}
		return length;
	}
	
	public boolean searchingKeyInList(int key){
		Node temp = head;
		boolean isKeyAvailable = false;
		if(key == head.data){
			isKeyAvailable = true;
		}else {
			while(temp != null && temp.next != null){
				if(temp.next.data == key){
					isKeyAvailable = true;
					break;
				}else{
					temp = temp.next;
				}
				isKeyAvailable = false;
			}
		}
		return isKeyAvailable;
	}
	
	public void deleteNodeKey(int key){
		Node temp = head;
		boolean keyAvailability = searchingKeyInList(key);
		if(keyAvailability == false){
			System.out.println("key not available in the List");
			System.out.print("Original list is: ");
			return;
		}else{
			if(key == head.data){
				head = temp.next;
			}else {
				while(temp != null && temp.next.next != null){
					if(temp.next.data == key ){
						temp.next = temp.next.next;
						break;
					}else{
						temp = temp.next;
					}
				}
				if(key == temp.next.data && temp.next.next == null){
					temp.next = temp.next.next;
				}
			}
		}
		
	}
	
	public void deleteNodePosition(int position){
		Node temp = head;
		int size = calculateLength();
		if(position > size){
			System.out.println("check the node position which is to be deleted And enter again: ");
			position = sc.nextInt();
		}
		else if (position == size){
			while(temp.next != null){
				temp = temp.next;
			}
		}else{
			for(int i = 0; i < position && temp != null; i++){
				temp = temp.next;
			}
			temp.next = temp.next.next;
			return;
		}
	}
	
	public void insertFromStart(int number){
		Node newNode = new Node(number);
		if(head == null){
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void displayFromHead(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}

public class ListOperations{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
		LinkedListOperations llo = new LinkedListOperations();
		//int inputPosition = sc.nextInt();
		for(int i = 10; i <= 50; i+=10){
			llo.insertFromEnd(i);
		}
		llo.searchingKeyInList(10);
		llo.deleteNodeKey(10);
		//llo.deleteNodePosition(inputPosition);
		llo.displayFromHead();
	}
}