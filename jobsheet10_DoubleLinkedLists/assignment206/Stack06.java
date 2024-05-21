package assignment206;

public class Stack06 {
    Node06 head;
    int size;

    public Stack06() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(String item) {
        if (isEmpty()) {
            head = new Node06(null, item, null);
        } else {
            Node06 newNode = new Node06(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public String pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty, cannot pop!");
        } else if (size == 1) {
            String data = head.data;
            head = null;
            size--;
            return data;
        } else {
            String data = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return data;
        }
    }

    public String peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty, cannot peek!");
        }
        return head.data;
    }

    public void print() {
        if (!isEmpty()) {
            Node06 tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + " ");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty");
        }
    }
}
