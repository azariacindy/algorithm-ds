package pract206;

public class Nasabah06 {
    String norek, nama, alamat;
    int umur;
    double saldo;
    
    Nasabah06[] data;
    int front, rear, size, max;

    public Nasabah06(int n) {
        max = n;
        data = new Nasabah06[max];
        size = 0 ;
        front = rear = -1;
    }

    Nasabah06(String norek, String nama, String alamat, int umur, double saldo) {
            this.norek = norek;
            this.nama = nama;
            this.alamat = alamat;
            this.umur = umur;
            this.saldo = saldo;
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
            System.out.println("Leading elements: " + data[front].norek + " " + data[front].nama + " " + 
                                data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
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
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat 
                                + " " + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat 
                                + " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Number of elements = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue successfully emptied!");
        } else {
            System.out.println("Queue is still empty!");
        }
    }

    public void Enqueue(Nasabah06 dt) {
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

    public Nasabah06 Dequeue() {
        Nasabah06 dt = new Nasabah06();
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

    public void peekRear() {
        if(!IsEmpty()) {
            System.out.println("Trailing elements: " + data[rear].norek + " " + data[rear].nama + " " +
                                data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue is still empty! No trailing element available.");
        }
    }

    Nasabah06() {

    }

    public static void menu() {
        System.out.println("-----------------------------");
        System.out.println("0. Exit");
        System.out.println("1. New queue");
        System.out.println("2. Outgoing queue");
        System.out.println("3. Front queue check");
        System.out.println("4. Check all queues");
        System.out.println("5. Check the back of the queue");
        System.out.print("Select menu: ");
    }
}
