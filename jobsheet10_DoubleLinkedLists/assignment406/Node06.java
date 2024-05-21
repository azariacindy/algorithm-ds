package assignment406;

public class Node06 {
    Student06 data;
    Node06 prev, next;

    Node06(Node06 prev, Student06 data, Node06 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
