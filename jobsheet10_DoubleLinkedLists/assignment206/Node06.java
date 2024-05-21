package assignment206;

public class Node06 {
    String data;
    Node06 prev, next;

    Node06(Node06 prev, String data, Node06 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
