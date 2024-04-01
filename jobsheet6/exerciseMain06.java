package jobsheet6;

public class exerciseMain06 {
    public static void main(String[] args) {
        int[] arr = {78, 13, 24, 9, 30, 22, 41};
        
        // membuat objek dari kelas binarySearchEx06
        binarySearchEx06 binarySearch = new binarySearchEx06();
        
        // mencari nilai 9 dalam array
        int target = 9;
        int resultIndex = binarySearch.search(arr, target);

        // menampilkan hasil pencarian
        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
