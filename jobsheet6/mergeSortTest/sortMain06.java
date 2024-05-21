package jobsheet6.mergeSortTest;

public class sortMain06 {
    public static void main(String[] args) {
        mergeSorting06 mergeSort = new mergeSorting06();
        int[] arr = {10, 40, 30, 50, 70, 20, 100, 90};

        System.out.println("Initial Data:");
        mergeSort.printArray(arr);

        mergeSort.mergeSort(arr);

        System.out.println("Sorted Data:");
        mergeSort.printArray(arr);
    }
}
