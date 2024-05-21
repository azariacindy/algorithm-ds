package tugasQueue;

public class Queue06 {
    Patient06[] queue;
    int front, rear, size, max;

    public Queue06(int n) {
        max = n;
        queue = new Patient06[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Patient06 patient) {
        if (!isFull()) {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            queue[rear] = patient;
            size++;
        } else {
            System.out.println("Queue is full!");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int position = front;
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
            size--;
            return position;
        } else {
            System.out.println("Queue is empty!");
            return -1;
        }
    }

    public void print() {
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.println(queue[i].toString());
                i = (i + 1) % max;
            }
            System.out.println(queue[i].toString());
            System.out.println("Number of Patients: " + size);
        } else {
            System.out.println("Queue is empty!");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Patient at the front of the queue: " + queue[front].toString());
        } else {
            System.out.println("Queue is empty!");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Patient at the rear of the queue: " + queue[rear].toString());
        } else {
            System.out.println("Queue is empty!");
        }
    }

    public void peekPosition(String name) {
        if (!isEmpty()) {
            for (int i = front; i != rear; i = (i + 1) % max) {
                if (queue[i].name.equals(name)) {
                    System.out.println("Patient " + name + " is at position " + (i - front + 1) + " in the queue");
                    return;
                }
            }
            if (queue[rear].name.equals(name)) {
                System.out.println("Patient " + name + " is at position " + (rear - front + 1) + " in the queue");
            } else {
                System.out.println("Patient " + name + " is not found in the queue!");
            }
        } else {
            System.out.println("Queue is empty!");
        }
    }

    public void listPatients() {
        if (!isEmpty()) {
            System.out.println("List of Patients:");
            int i = front;
            while (i != rear) {
                System.out.println(queue[i].toString());
                i = (i + 1) % max;
            }
            System.out.println(queue[i].toString());
        } else {
            System.out.println("Queue is empty!");
        }
    }
}
