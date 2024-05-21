package assignment306;

public class Node06 {
    int queueNumber;
    String name;
    Node06 prev, next;

    Node06(Node06 prev, int queueNumber, String name, Node06 next) {
        this.prev = prev;
        this.queueNumber = queueNumber;
        this.name = name;
        this.next = next;
    }
}
