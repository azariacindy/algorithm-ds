package pract1Tree;

public class BinaryTree06 {
    Node06 root;

    public BinaryTree06() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if(isEmpty()) { // tree is empty
            root = new Node06(data);
        } else {
            Node06 current = root;
            while (true) {
                if(data < current.data) { // Checks whether the data to be added is smaller than the current node's data. If yes, then the new data should be placed in the left subtree.
                    if(current.left != null) { // Checks whether the left child of the current node exists (not null). If it does, it means that it is necessary to continue the comparison further in the left subtree.
                        current = current.left; // Updates the current node's reference to the left child, and the loop will continue from this child node in the next iteration.
                    } else { // If the left child of the current node is null, then the right position for the new data is here.
                        current.left = new Node06(data); // Creates a new node with the data to be added and sets it as the left child of the current node.
                        break; // stop looping
                    }
                } else if(data > current.data) {
                    if(current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node06(data);
                        break;
                    }
                } else { // data is already exist
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean hasil = false;
        Node06 current = root;
        while(current != null) {
            if(current.data == data) {
                hasil = true;
                break;
            } else if(data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    void traversePreOrder(Node06 node) {
        if(node != null) {
            System.out.print(" " + node.data);;
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node06 node) {
        if(node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node06 node) {
        if(node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node06 getSuccessor(Node06 del) {
        Node06 successor = del.right;
        Node06 successorParent = del;
        while(successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if(isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        // find node(current) that will be deleted
        Node06 parent = root;
        Node06 current = root;
        boolean isLeftChild = false;
        while(current != null) {
            if(current.data == data) {
                break;
            } else if(data < current.data) {
            parent = current;
            current = current.left;
            isLeftChild = true;
            } else if(data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // deletion
        if(current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            // if there is no child, simply delete it
            if(current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if(isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if(current.left == null) {
                // if there is only one child(right)
                if(current == root) {
                    root = current.right;
                } else {
                    if(isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if(current.right == null) {
                // if there is only one child(left)
                if(current == root) {
                    root = current.left;
                } else {
                    if(isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                // if there are two childs
                Node06 successor = getSuccessor(current);
                if(current == root) {
                    root = successor;
                } else {
                    if(isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    // no1
    void addRecursive(int data) {
        root = addRecursive(root, data);
    }
    
    Node06 addRecursive(Node06 current, int data) {
        if (current == null) {
            return new Node06(data);
        }
    
        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            // Data already exists
            return current;
        }
    
        return current;
    }
    
    // no2
    void max() {
        Node06 current = root;
        while(current.right != null) {
            current = current.right;
        }
        System.out.println(current.data);
    }

    void min() {
        Node06 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println(current.data);
    }
    

    // no3
    void printLeafNodes() {
        printLeafNodes(root);
    }
    
    private void printLeafNodes(Node06 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            printLeafNodes(node.left);
            printLeafNodes(node.right);
        }
    }
    
    // no4
    int countLeafNodes() {
        return countLeafNodes(root);
    }
    
    private int countLeafNodes(Node06 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }
}
