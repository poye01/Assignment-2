package IndividualAssignment2b;
public class Stack {
    // Node class to represent each element in the stack
    private static class Node {
        private int data;
        private Node next;
        private Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top; // top of the stack
    // Constructor to initialize the stack
    public Stack() {
        this.top = null;
    }
    // Method to push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    // Method to pop an element from the stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop.");
        }
        int data = top.data;
        top = top.next;
        return data;
    }
    // Method to peek at the top element of the stack without removing it
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot peek.");
        }
        return top.data;
    }
    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
    // Main method for testing
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek()); // Should print 30
        System.out.println("Popped element is: " + stack.pop()); // Should print 30
        System.out.println("Top element is: " + stack.peek()); // Should print 20
        stack.pop(); // Pop 20
        stack.pop(); // Pop 10
        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Should print true
    }
}

