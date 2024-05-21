package tugas;

public class receiptStack06 {
    private receipt06[] stack;
    private int top, maxSize;

    public receiptStack06(int maxSize) {
        this.maxSize = maxSize;
        stack = new receipt06[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(receipt06 receipt) {
        if (!isFull()) {
            top++;
            stack[top] = receipt;
            System.out.println("Receipt added to the stack.");
        } else {
            System.out.println("Stack is full. Cannot add receipt.");
        }
    }

    public receipt06 pop() {
        if (!isEmpty()) {
            receipt06 poppedReceipt = stack[top];
            top--;
            return poppedReceipt;
        } else {
            System.out.println("Stack is empty. Cannot retrieve receipt.");
            return null;
        }
    }
}
