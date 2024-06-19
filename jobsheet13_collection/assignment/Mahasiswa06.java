package jobsheet13_collection.assignment;

public class Mahasiswa06 {
    String nim, nama, noTelp;

    public Mahasiswa06(String nim, String nama, String noTelp) {
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    @Override
    public String toString() {
        return nim + " " + nama + " " + noTelp;
    }
}
