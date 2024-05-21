package activities1;

public class DoubleLinkedListsMain06 {
    public static void main(String[] args) {
        DoubleLinkedLists06 dll = new DoubleLinkedLists06();
        // dll.print();
        // System.out.println("Size : " + dll.size());
        // System.out.println("===================================");
        // dll.addFirst(3);
        // dll.addLast(4);
        // dll.addFirst(7);
        // dll.print();
        // System.out.println("Size : " + dll.size());
        // System.out.println("===================================");
        // try {
        //     dll.add(40, 1);
        // } catch (Exception e) {
        //     System.out.println("Error: " + e.getMessage());
        // }
        // dll.print();
        // System.out.println("Size : " + dll.size());
        // System.out.println("===================================");
        // dll.clear();
        // dll.print();
        // System.out.println("Size : " + dll.size());


        // dll.addLast(50);
        // dll.addLast(40);
        // dll.addLast(10);
        // dll.addLast(20);
        // dll.print();
        // System.out.println("Size : "+ dll.size());
        // System.out.println("===================================");
        // try {
        //     dll.removeFirst();
        //     dll.print();
        //     System.out.println("Size : "+ dll.size());
        // } catch (Exception e) {
        //     System.out.println("Error: " + e.getMessage());
        // }
        // System.out.println("===================================");
        // try {
        //     dll.removeLast();
        //     dll.print();
        //     System.out.println("Size : "+ dll.size());
        // } catch (Exception e) {
        //     System.out.println("Error: " + e.getMessage());
        // }
        // System.out.println("===================================");
        // try {
        //     dll.remove(1);
        //     dll.print();
        //     System.out.println("Size : "+ dll.size());
        // } catch (Exception e) {
        //     System.out.println("Error: " + e.getMessage());
        // }

        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("===================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("===================================");

        try {
            dll.add(40, 1);
            dll.print();
            System.out.println("Size : "+ dll.size());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("===================================");
        try {
            System.out.println("Data in the head of linked list is : " + dll.getFirst());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            System.out.println("Data in the tail index linked list is : " + dll.getLast());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            System.out.println("Data in the index 1st linked list is : " + dll.get(1));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
