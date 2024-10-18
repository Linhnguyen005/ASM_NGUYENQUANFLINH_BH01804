class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Indicates an empty stack
    }

    // Push operation
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;  // Increment top and insert value
            System.out.println("Pushed " + value + " onto the stack.");
        }
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;  // Return a sentinel value or throw an exception
        } else {
            int value = stackArray[top--];  // Return top value and decrement top
            System.out.println("Popped " + value + " from the stack.");
            return value;
        }
    }

    // Peek operation
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;  // Return a sentinel value or throw an exception
        } else {
            return stackArray[top];  // Return the top element
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
}
