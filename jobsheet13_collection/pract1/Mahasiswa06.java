package jobsheet13_collection.pract1;

public class Mahasiswa06 {
    String nim, nama, notelp;

    public Mahasiswa06() {}

    public Mahasiswa06(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim:" + nim + ", nama: " + nama + ", notelp: " + notelp + '}';
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
