package day_3;
class Node3 {
    int data;
    Node3 next;
    Node3(int data) { this.data = data; }
}

public class reverse {
    public static void main(String[] args) {
        Node3 head = new Node3(1);
        head.next = new Node3(2);
        head.next.next = new Node3(3);
        Node3 prev = null, curr = head;
        while (curr != null) {
            Node3 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
