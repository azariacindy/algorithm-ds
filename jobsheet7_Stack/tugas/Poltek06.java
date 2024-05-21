package tugas;

public class Poltek06 {
    private char[] stack;
    private int top;
    private int maxSize;

    public Poltek06(int maxSize) {
        this.maxSize = maxSize;
        stack = new char[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(char c) {
        if (!isFull()) {
            top++;
            stack[top] = c;
        } else {
            System.out.println("Stack is full. Cannot push character.");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            char poppedChar = stack[top];
            top--;
            return poppedChar;
        } else {
            return '\0'; // Return null character if stack is empty
        }
    }
}
