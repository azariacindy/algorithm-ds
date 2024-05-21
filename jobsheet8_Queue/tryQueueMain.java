
public class tryQueueMain {
    public static void main(String[] args) {
        tryQueue queue = new tryQueue(5);
        
        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Dequeue elements
        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println(queue.dequeue() + " dequeued from queue");

        // Enqueue more elements
        queue.enqueue(60);
        queue.enqueue(70);

        // Dequeue remaining elements
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue() + " dequeued from queue");
        }
    }
}
