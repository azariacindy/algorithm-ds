package jobsheet13_collection.pract1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa06 {
    List<Mahasiswa06> mahasiswas = new ArrayList<>();

    public void add(Mahasiswa06... mahasiswas) {
        Collections.addAll(this.mahasiswas, mahasiswas);
    }

    public void remove(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa06 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void print() {
        mahasiswas.forEach(mhs -> {
            System.out.println(mhs.toString());
        });
    }

    public int binarySearch(String nim) {
        ascSort(); // Ensure the list is sorted before binary search
        int index = Collections.binarySearch(mahasiswas, new Mahasiswa06(nim, null, null), Comparator.comparing(Mahasiswa06::getNim));
        return index >= 0 ? index : -1;
    }

    public void ascSort() {
        Collections.sort(mahasiswas, Comparator.comparing(Mahasiswa06::getNim));
    }

    public void dscSort() {
        Collections.sort(mahasiswas, (m1, m2) -> m2.getNim().compareTo(m1.getNim()));
    }
}
