package jobsheet13_collection.pract1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class LoopCollection06 {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.push("Orange");
        fruits.push("Watermelon");
        fruits.push("Leci");
        fruits.push("Salak");

        // Printing the stack elements
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        // Popping elements from the stack
        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        System.out.println("");

        // Adding elements back to the stack
        fruits.push("Banana");
        fruits.push("Orange");
        fruits.push("Watermelon");
        fruits.push("Leci");
        fruits.push("Salak");

        // Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”
        fruits.set(fruits.size() - 1, "Strawberry");

        // Tambahkan 3 buah seperti “Mango”,”Guava”, dan “Avocado”
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");

        // Melakukan sorting
        Collections.sort(fruits);

        // Printing the elements after sorting
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        // Iterator
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }

        System.out.println("");
        // Stream forEach
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });

        System.out.println("");
        // Index-based loop
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
    }
}
