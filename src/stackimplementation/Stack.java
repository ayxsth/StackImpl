package stackimplementation;

/**
 *
 * @author ayxst
 */
public class Stack {

    private final int[] stack;
    private int top;
    private final int size;

    Stack(int size) {
        stack = new int[size];
        top = -1;
        this.size = size;
    }

    public void push(int num) {
        if (isFull()) {
            throw new RuntimeException("The stack is full!");
        }
        stack[++top] = num;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("The stack is empty!");
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("The stack is empty!");
        }
        return stack[top];
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.println("-------");
            System.out.println("|  " + stack[i] + "  |");
            System.out.println("-------");
        }
    }

    private boolean isFull() {
        return top == size - 1;
    }

    private boolean isEmpty() {
        return top == -1;
    }
}
