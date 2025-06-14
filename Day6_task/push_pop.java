package day_6;

public class push_pop {	
	    int[] stack = new int[10]; 
	    int top = -1;             
	    void push(int value) {
	        top = top + 1;
	        stack[top] = value;
	    }	    
	    int pop() {
	        int value = stack[top];
	        top = top - 1;
	        return value;
	    }

	    public static void main(String[] args) {
	        push_pop s = new push_pop();
	        s.push(5);
	        s.push(10);
	       System.out.println(s.pop()); 
	       System.out.println(s.pop());  
	    }
	}



