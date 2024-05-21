package kuis2_Cindy;

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

    public void addLast(Pesanan06 item) {
        if (isEmpty()) {
            head = new Node06(null, item, null);
        } else {
            Node06 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node06 newNode = new Node06(current, item, null);
            current.next = newNode;
        }
        size++;
    }

    public void printAntrian() {
        System.out.println("=============================");
        if (isEmpty()) {
            System.out.println("There's no queue!");
            return;
        }
        Node06 tmp = head;
        while (tmp != null) {
            System.out.println("Order Code: " + tmp.data.kodePesanan + ", Name of Order: " + tmp.data.namaPesanan + ", Price: " + 
                            tmp.data.harga + ", Buyer's Name: " + tmp.data.pembeli.namaPembeli + ", No HP: " + tmp.data.pembeli.noHp);
            tmp = tmp.next;
        }
        System.out.println("=============================");
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("The queue is empty, it can't be removed!");
        } else {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
        }
    }

    public void removeByKodePesanan(int kode) throws Exception {
        if (isEmpty()) {
            throw new Exception("The queue is empty, it can't be removed!");
        } else {
            Node06 current = head;
            while (current != null && current.data.kodePesanan != kode) {
                current = current.next;
            }
            if (current == null) {
                throw new Exception("The order code wasn't found!");
            }
            if (current.prev != null) {
                current.prev.next = current.next;
            } else {
                head = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void laporanByNama() {
        if (isEmpty()) {
            System.out.println("There's no order!");
            return;
        }
        Pesanan06[] pesananArray = new Pesanan06[size];
        Node06 current = head;
        int index = 0;
        while (current != null) {
            pesananArray[index++] = current.data; // assign the data from the current node (Pesanan06 object) to the array at the current index
            current = current.next;
        }
        java.util.Arrays.sort(pesananArray, (a, b) -> a.namaPesanan.compareTo(b.namaPesanan)); // using a lambda expression as the comparator
        for (Pesanan06 p : pesananArray) { // // loop over each Pesanan06 object in the sorted array
            System.out.println("Name of Order: " + p.namaPesanan + ", Price: " + p.harga + ", Buyer's Name: " + p.pembeli.namaPembeli);
        }
    }

    public int hitungTotalPendapatan() {
        int total = 0;
        Node06 current = head;
        while (current != null) {
            total += current.data.harga;
            current = current.next;
        }
        return total;
    }
}
