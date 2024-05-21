package assignment306;

public class Queue06 {
    Node06 head, tail;
    int size;

    public Queue06() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int queueNumber, String name) {
        if (isEmpty()) {
            head = tail = new Node06(null, queueNumber, name, null);
        } else {
            Node06 newNode = new Node06(tail, queueNumber, name, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Node06 dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty, cannot dequeue!");
        } else if (size == 1) {
            Node06 temp = head;
            head = tail = null;
            size--;
            return temp;
        } else {
            Node06 temp = head;
            head = head.next;
            head.prev = null;
            size--;
            return temp;
        }
    }

    public void printQueue() {
        if (!isEmpty()) {
            Node06 tmp = head;
            while (tmp != null) {
                System.out.println("Queue Number: " + tmp.queueNumber + ", Name: " + tmp.name);
                tmp = tmp.next;
            }
            System.out.println("Queue length: " + size);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public int getSize() {
        return size;
    }

    public String getFront() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!");
        }
        return "Queue Number: " + head.queueNumber + ", Name: " + head.name;
    }
}
