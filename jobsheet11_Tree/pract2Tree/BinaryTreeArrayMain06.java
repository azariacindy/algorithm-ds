package pract2Tree;

public class BinaryTreeArrayMain06 {
    public static void main(String[] args) {
        BinaryTreeArray06 bta = new BinaryTreeArray06();
        int[] data = {6, 4, 8, 3, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);

        System.out.println("");
        System.out.println("In-Order Traversal:");
        bta.traverseInOrder(0);
        System.out.println();
        
        System.out.println("Pre-Order Traversal:");
        bta.traversePreOrder(0);
        System.out.println();
        
        System.out.println("Post-Order Traversal:");
        bta.traversePostOrder(0);
        System.out.println();

        // Adding a new data to the tree
        bta.add(5);
        bta.add(10);

        System.out.println("In-Order Traversal after adding new data:");
        bta.traverseInOrder(0);
        System.out.println();
        
        System.out.println("Pre-Order Traversal after adding new data:");
        bta.traversePreOrder(0);
        System.out.println();
        
        System.out.println("Post-Order Traversal after adding new data:");
        bta.traversePostOrder(0);
        System.out.println();
    }
}
