package day_6;
	import java.util.Scanner;

	public class menu {
	    static int[] stack = new int[5];
	    static int top = -1;

	    static void push(int val) {
	        if (top == stack.length - 1) {
	            System.out.println("Stack overflow");
	            return;
	        }
	        stack[++top] = val;
	        System.out.println(val + " pushed");
	    }

	    static void pop() {
	        if (top == -1) {
	            System.out.println("Stack underflow");
	            return;
	        }
	        System.out.println(stack[top--] + " popped");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        while (true) {
	            System.out.println("\n1.Push  2.Pop  3.Exit");
	            System.out.print("Enter choice: ");
	            int ch = sc.nextInt();

	            switch (ch) {
	                case 1:
	                    System.out.print("Enter value to push: ");
	                    int val = sc.nextInt();
	                    push(val);
	                    break;
	                case 2:
	                    pop();
	                    break;
	                case 3:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice");
	            }
	        }
	    }
	}



