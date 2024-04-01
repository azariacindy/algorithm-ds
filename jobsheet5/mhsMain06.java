package jobsheet5;

public class mhsMain06 {
    public static void main(String[] args) {
        dafMhsBpres06 dafMhs = new dafMhsBpres06();

        mhs06 mhs1 = new mhs06("Azaria", 2020, 20, 3.5);
        mhs06 mhs2 = new mhs06("Cindy", 2019, 21, 3.7);
        mhs06 mhs3 = new mhs06("Sahasika", 2021, 19, 3.8);
        mhs06 mhs4 = new mhs06("Garcia", 2020, 20, 3.9);
        mhs06 mhs5 = new mhs06("Catrine", 2023, 18, 3.6);

        dafMhs.tambah(mhs1);
        dafMhs.tambah(mhs2);
        dafMhs.tambah(mhs3);
        dafMhs.tambah(mhs4);
        dafMhs.tambah(mhs5);

        System.out.println("Data Sebelum Diurutkan:");
        dafMhs.tampil();

        System.out.println("\nData Setelah Diurutkan Desc (Bubble Sort) berdasarkan IPK:");
        dafMhs.bubbleSort();
        dafMhs.tampil();

        System.out.println("\nData Setelah Diurutkan Asc (Selection Sort) berdasarkan IPK:");
        dafMhs.selectionSort();
        dafMhs.tampil();

        System.out.println("\nData Setelah Diurutkan Desc (Insertion Sort) berdasarkan IPK:");
        dafMhs.insertionSort();
        dafMhs.tampil();
    }
}
