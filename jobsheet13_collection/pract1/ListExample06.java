package jobsheet13_collection.pract1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample06 {
    public static void main(String[] args) {
        List<Object> l = new ArrayList<>();

        l.add(1);
        l.add(2);
        l.add(3);
        // l.add("Cireng");
        System.out.printf("Element 0: %s, total elements: %d, last element: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1));

        l.add(4);
        l.remove(0);
        System.out.printf("Element 0: %s, total elements: %d, last element: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1));

        LinkedList<String> names = new LinkedList<>();
        names.add("Azaria");
        names.add("Cindy");
        names.add("Sahasika");
        names.add("Garcia");
        names.add("Catrine");

        System.out.printf("Element 0: %s, total elements: %d, last element: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));
        names.set(0, "My kid");
        System.out.printf("Element 0: %s, total elements: %d, last element: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names: " + names.toString());

        names.push("Mei-mei");
        System.out.printf("Element 0: %s, total elements: %d, last element: %s\n",
                names.getFirst(), names.size(), names.getLast());
        System.out.println("Names: " + names.toString());
    }
}
