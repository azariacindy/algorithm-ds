package jobsheet6;

public class binarySearchEx06 {
    public int search(int[] arr, int target) {
        // urutkan array menggunakan algoritma pengurutan Bubble Sort
        bubbleSortEx06.sort(arr);
        
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // element found, return its index
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // element not found
    }
}
