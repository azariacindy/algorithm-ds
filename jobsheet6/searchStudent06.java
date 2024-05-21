package jobsheet6;

import java.util.Arrays;

public class searchStudent06 {
    students06[] listStd;
    int idx;

    public searchStudent06(int amountStudent) {
        listStd = new students06[amountStudent];
    }

    // Method to add student data to the list
    public void add(students06 std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }

    // Method to display all student data
    public void display() {
        for (students06 student : listStd) {
            if (student != null) {
                student.display();
                System.out.println("----------------------------------");
            }
        }
    }

    // Method to perform binary search by student's NIM
    public int findBinarySearchByNIM(int find) {
        // Sort the array before performing binary search
        Arrays.sort(listStd, (a, b) -> Integer.compare(a.nim, b.nim));
        // Perform binary search
        int left = 0;
        int right = idx - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (listStd[mid].nim == find) {
                return mid; // Element found, return index
            }
            if (listStd[mid].nim < find) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Element not found
    }

    // Method to perform sequential search by student's name
    public int findSeqSearchByName(String name) {
        for (int i = 0; i < idx; i++) {
            if (listStd[i].name.equals(name)) {
                return i; // Element found, return index
            }
        }
        return -1; // Element not found
    }

    // Method to display the position of the found data
    public void showPositionByNIM(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data with NIM " + x + " is found in index-" + pos);
        } else {
            System.out.println("Data with NIM " + x + " is not found");
        }
    }
    
    public void showPositionByName(String name, int pos) {
        if (pos != -1) {
            System.out.println("Data with Name " + name + " is found in index-" + pos);
        } else {
            System.out.println("Data with Name " + name + " is not found");
        }
    }        

    // Method to display the data
    public void showData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t : " + x);
            System.out.println("Name \t : " + listStd[pos].name);
            System.out.println("Age \t : " + listStd[pos].age);
            System.out.println("GPA \t : " + listStd[pos].gpa);
        } else {
            System.out.println("Data : " + x + " is not found");
        }
    }
}
