package pract106;

public class Queue06 {
    int[] data;
    int front, rear, size, max;

    public Queue06(int n) {
        max = n;
        data = new int[max];
        size = 0 ;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Leading elements: " + data[front]);
        } else {
            System.out.println("Queue is still empty!");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue is still empty!");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Number of elements = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue successfully emptied");
        } else {
            System.out.println("Queue is still empty!");
        }
    }

    public void Enqueue(int dt) {
        if (IsFull()) { // check if the queue is full
            System.out.println("Queue is full! Program will be terminated."); // queue overflow
            System.exit(1); 
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) { // check if rear has reached the maximum limit
                    rear = 0; // if yes, return rear to the beginning of the queue
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }    

    public int Dequeue() {
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue is still empty! Program will be terminated."); // queue underflow
            System.exit(1);
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public static void menu() {
        System.out.println("Enter the desired operation: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-----------------");
    }
}
