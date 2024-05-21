package assignment406;

public class StudentList06 {
    Node06 head, tail;
    int size;

    public StudentList06() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Student06 student) {
        if (isEmpty()) {
            head = new Node06(null, student, null);
        } else {
            Node06 newNode = new Node06(null, student, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Student06 student) {
        if (isEmpty()) {
            addFirst(student);
        } else {
            Node06 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node06 newNode = new Node06(current, student, null);
            current.next = newNode;
            size++;
        }
    }

    public void addAtIndex(int index, Student06 student) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
            return;
        }
        if (index == 0) {
            addFirst(student);
        } else if (index == size) {
            addLast(student);
        } else {
            Node06 current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node06 newNode = new Node06(current, student, current.next);
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }
    
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node06 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node06 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }    

    public void print() {
        if (!isEmpty()) {
            Node06 tmp = head;
            while (tmp != null) {
                System.out.println("NIM: " + tmp.data.nim + ", Name: " + tmp.data.name + ", GPA: " + tmp.data.gpa);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Student list is empty");
        }
    }

    public Student06 searchByNIM(String nim) {
        Node06 tmp = head;
        while (tmp != null) {
            if (tmp.data.nim.equals(nim)) {
                return tmp.data;
            }
            tmp = tmp.next;
        }
        return null;
    }

    public void sortByGPA() {
        if (!isEmpty()) {
            Node06 current = head, index = null;
            Student06 temp;
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.gpa < index.data.gpa) {
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
}
