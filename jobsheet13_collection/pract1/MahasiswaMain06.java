package jobsheet13_collection.pract1;

public class MahasiswaMain06 {
    public static void main(String[] args) {
        ListMahasiswa06 lm = new ListMahasiswa06();
        Mahasiswa06 mhs1 = new Mahasiswa06("201234", "Noureen", "021xx1");
        Mahasiswa06 mhs2 = new Mahasiswa06("201235", "Akhleema", "021xx2");
        Mahasiswa06 mhs3 = new Mahasiswa06("201236", "Shannum", "021xx3");

        lm.add(mhs1, mhs2, mhs3);
        lm.print();

        // Update mahasiswa
        int indexToUpdate = lm.binarySearch("201235");
        if (indexToUpdate != -1) {
            lm.update(indexToUpdate, new Mahasiswa06("201235", "Akhleema lelas", "021xx2"));
        } else {
            System.out.println("Mahasiswa with nim '201235' not found.");
        }

        System.out.println("");
        lm.print();

        // Sorting and printing again
        System.out.println("\nSorted ascending:");
        lm.ascSort();
        lm.print();

        System.out.println("\nSorted descending:");
        lm.dscSort();
        lm.print();
    }
}
