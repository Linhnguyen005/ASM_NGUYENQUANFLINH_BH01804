class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLinkedList {
    private Node top;

    public StackLinkedList() {
        top = null;
    }

    // Push operation
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed " + value + " onto the stack.");
    }

    // Pop operation
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;  // Return a sentinel value or throw an exception
        } else {
            int value = top.data;
            top = top.next;  // Move top to the next node
            System.out.println("Popped " + value + " from the stack.");
            return value;
        }
    }

    // Peek operation
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;  // Return a sentinel value or throw an exception
        } else {
            return top.data;  // Return the top element
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}
