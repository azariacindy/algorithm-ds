package kuis2_Cindy;

public class Node06 {
    Pesanan06 data;
    Node06 prev, next;

    public Node06(Node06 prev, Pesanan06 data, Node06 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
