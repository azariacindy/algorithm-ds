package jobsheet9_LinkedList.pract1;

public class LinkedList06 {
    Node06 head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node06 currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }

            System.out.println("");
        } else {
            System.out.println("Linked List Kosong!");
        }
    }

    public void addFirst(int input) {
        Node06 newNode = new Node06(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node06 newNode = new Node06(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node06 currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input) {
        Node06 newNode = new Node06(input, null);

        if (!isEmpty()) {
            Node06 currentNode = head;

            while (currentNode != null) {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }

                currentNode = currentNode.next;
            }
        } else {
            System.out.println("Linked list kosong!");
        }
    }

    public void insertAt(int index, int input) {
        Node06 newNode = new Node06(input, null);
    
        if (isEmpty()) {
            head = newNode;
        } else {
            Node06 currentNode = head;
            Node06 previousNode = null;
            int currentIndex = 0;
    
            // Traverse the linked list to find the position to insert the new node
            while (currentNode != null && currentIndex < index) {
                previousNode = currentNode;
                currentNode = currentNode.next;
                currentIndex++;
            }
    
            // If the index is valid, insert the new node at the specified position
            if (currentIndex == index) {
                if (previousNode == null) { // Insertion at the beginning
                    newNode.next = head;
                    head = newNode;
                } else { // Insertion at other positions
                    newNode.next = currentNode;
                    previousNode.next = newNode;
                }
                System.out.println("Data inserted at index " + index);
            } else {
                System.out.println("Invalid index! Insertion failed.");
            }
        }
    }

    public int getData(int index) {
        Node06 currentNode = head;
        int currentIndex = 0;
    
        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next;
            currentIndex++;
        }
    
        if (currentNode == null) {
            System.out.println("Index out of bounds! Returning default value 0.");
            return 0; // Default value or throw an exception according to the requirements
        } else {
            return currentNode.data;
        }
    }    

    public int indexOf(int key) {
        Node06 currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }

        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
        System.out.println("List is empty!");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty!");
        } else if (head.next == null) {
            head = null;
        } else {
            Node06 currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }

                currentNode = currentNode.next;
            }
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Empty list, cannot remove last element.");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node06 currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }

                currentNode = currentNode.next;
            }
        }
    }

    public void insertBefore(int key, int input) {
        Node06 newNode = new Node06(input, null);
    
        if (!isEmpty()) {
            Node06 currentNode = head;
            Node06 previousNode = null;
    
            while (currentNode != null) {
                if (currentNode.data == key) {
                    if (previousNode == null) { // Insertion at the beginning
                        newNode.next = head;
                        head = newNode;
                    } else { // Insertion at other positions
                        newNode.next = currentNode;
                        previousNode.next = newNode;
                    }
                    break;
                }
    
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        } else {
            System.out.println("Linked list kosong!");
        }
    }

    public void removeAt(int index) {
        if (!isEmpty()) {
            if (index == 0) {
                removeFirst();
            } else {
                Node06 currentNode = head;
                Node06 previousNode = null;
                int currentIndex = 0;
    
                while (currentNode != null && currentIndex < index) {
                    previousNode = currentNode;
                    currentNode = currentNode.next;
                    currentIndex++;
                }
    
                if (currentNode != null) {
                    previousNode.next = currentNode.next;
                } else {
                    System.out.println("Invalid index! Removal failed.");
                }
            }
        } else {
            System.out.println("Empty list, cannot remove at index.");
        }
    }    
}
