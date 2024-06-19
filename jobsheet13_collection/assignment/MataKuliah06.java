package jobsheet13_collection.assignment;

public class MataKuliah06 {
    String kodeMK, namaMk;
    int sks;

    public MataKuliah06(String kodeMK, String namaMk, int sks) {
        this.kodeMK = kodeMK;
        this.namaMk = namaMk;
        this.sks = sks;
    }

    @Override
    public String toString() {
        return kodeMK + " " + namaMk + " " + sks;
    }
}
