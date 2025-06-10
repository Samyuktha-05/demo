package day_3;


	class node1 {
	    int data;
	    node1 next;
	    node1(int data) {
	        this.data = data;
	    }
	}
	public class traversal {
	    public static void main(String[] args) {
	        node1 head = new node1(10);
	        head.next = new node1(20);
	        head.next.next = new node1(30);
	        node1 current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	    }
	}



