package day_3;
	class Node2 {
	    int data;
	    Node2 next;
	    Node2(int data) { this.data = data; }
	}
	public class delete {
	    public static void main(String[] args) {	       
	        Node2 head = new Node2(1);
	        head.next = new Node2(2);
	        head.next.next = new Node2(3);
	        int pos = 1;
	        if (pos == 0) {
	            head = head.next; 
	        } else {
	            Node2 temp = head;
	            for (int i = 0; i < pos - 1 && temp != null; i++)
	                temp = temp.next;
	            if (temp != null && temp.next != null)
	                temp.next = temp.next.next;
	        }       
	        Node2 current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }        
	    }
	}



