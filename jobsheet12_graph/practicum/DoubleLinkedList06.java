package practicum;

public class DoubleLinkedList06 {
    Node06 head;
    int size;

    public DoubleLinkedList06() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node06(null, item, null);
        } else {
            Node06 newNode = new Node06(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node06 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node06 newNode = new Node06(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Invalid index");
        } else {
            Node06 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                Node06 newNode = new Node06(current, item, null);
                current.next = newNode;
            } else {
                Node06 newNode = new Node06(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
            size++;
        }
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public int get(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Index out of bounds");
        }
        Node06 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void remove(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Index out of bounds");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node06 current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            if (current.next != null) {
                current.next.prev = current;
            }
            size--;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is empty, cannot remove!");
        } else if (size == 1) {
            head = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list is empty, cannot remove!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node06 current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.prev.next = null;
        size--;
    }

    public void print() {
        if (!isEmpty()) {
            Node06 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked list is empty");
        }
    }

    public void sortDescending() {
        if (!isEmpty()) {
            Node06 current = head, index = null;
            int temp;
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data < index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public boolean search(int item) {
        Node06 tmp = head;
        while (tmp != null) {
            if (tmp.data == item) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }
}
