class Node {
	int data;
	Node next;
	
	Node(int d){
		data = d;
		next = null;
	}
}

class DeletionOperation{
	Node head;
	
	public void insertFromStart(int number){
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
	public boolean isElementAvailable(int element){
		Node temp = head;
		boolean isElementPresent = false;
		while(temp != null){
			if(temp.data == element){
				isElementPresent = true;
				break;
			}else{
				temp = temp.next;
			}
			isElementPresent = false;
		}
		return isElementPresent;
	}
	
	public int searchElement(int element){
		Node temp = head;
		int position =1;
		boolean elementAvailability = isElementAvailable(element);
		if(elementAvailability == false){
			System.out.println("Element is not in the list" +"\n "+"please check the entered element: ");
			return 0;
		}else{
			while(temp.data != element && temp != null){
				if(temp.data == element){
					break;
				}else{
					temp = temp.next;
					position++;
				}
			}
		}
		return position;
	}
	
	public void deleteNodeAtPosition(int position){
		Node temp = head;
		int size = calculateLength();
		if(position > size){
			System.out.println("check entered position and reenter " + "\n"+" Original list is: ");
			return;
		}else if (position == 0 ){
			head = temp.next;
			return;
		}else{
			int i = 0;
		while(i < position -1 && temp != null){
			temp = temp.next;
			i++;
		}
		temp.next = temp.next.next;
		return;
		}
	}
	
	
	public void display(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}

public class NodeDeletion{
	public static void main(String [] args){
		DeletionOperation dop = new DeletionOperation();
		for(int i = 10; i <= 50; i+=10){
			dop.insertFromStart(i);
		}
		int elementData = 10;
		dop.isElementAvailable(elementData);
		int positionOfElement = dop.searchElement(elementData);
		System.out.println("element found at: "+positionOfElement);
		dop.deleteNodeAtPosition(3);
		dop.display();
	}

}

