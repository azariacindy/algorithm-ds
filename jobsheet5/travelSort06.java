package jobsheet5;

public class travelSort06 {
    // Bubble Sort untuk sorting berdasarkan harga
    public static void bubbleSortByPrice(travel06[] penginapan) {
        int n = penginapan.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (penginapan[j].harga > penginapan[j + 1].harga) {
                    travel06 temp = penginapan[j];
                    penginapan[j] = penginapan[j + 1];
                    penginapan[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort untuk sorting berdasarkan rating
    public static void selectionSortByRating(travel06[] penginapan) {
        int n = penginapan.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (penginapan[j].rating > penginapan[minIndex].rating) {
                    minIndex = j;
                }
            }
            travel06 temp = penginapan[minIndex];
            penginapan[minIndex] = penginapan[i];
            penginapan[i] = temp;
        }
    }

    // Fungsi untuk menampilkan daftar penginapan
    public static void printPenginapan(travel06[] penginapan) {
        for (travel06 p : penginapan) {
            p.show();
            System.out.println("---------------------------");
        }
    }
}
