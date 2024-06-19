package jobsheet13_collection.assignment;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Queue;
import java.util.LinkedList;

public class NilaiMain06 {
    String kodeN;
    double nilai;
    Mahasiswa06 mhs;
    MataKuliah06 mk;

    public NilaiMain06(String kodeN, double nilai, Mahasiswa06 mhs, MataKuliah06 mk) {
        this.kodeN = kodeN;
        this.nilai = nilai;
        this.mhs = mhs;
        this.mk = mk;
    }

    List<Mahasiswa06> mhsA = new ArrayList<>();
    List<MataKuliah06> mkA = new ArrayList<>();
    Queue<Mahasiswa06> mhsQueue = new LinkedList<>();

    public void addMhs(Mahasiswa06... mahasiswa) {
        mhsA.addAll(Arrays.asList(mahasiswa));
        mhsQueue.addAll(Arrays.asList(mahasiswa));
    }

    public void addMk(MataKuliah06... matkul) {
        mkA.addAll(Arrays.asList(matkul));
    }

    public void printMhs() {
        mhsA.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    public void printMk() {
        mkA.stream().forEach(mk -> {
            System.out.println("" + mk.toString());
        });
    }

    public int linearSearchMhs(String nim) {
        for (int i = 0; i < mhsA.size(); i++) {
            if (nim.equals(mhsA.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public int linearSearchMk(String matkul) {
        for (int i = 0; i < mkA.size(); i++) {
            if (matkul.equals(mkA.get(i).kodeMK)) {
                return i;
            }
        }
        return -1;
    }

    Mahasiswa06 searchMhs(String nim) {
        for (int i = 0; i < mhsA.size(); i++) {
            if (nim.equals(mhsA.get(i).nim)) {
                return mhsA.get(i);
            }
        }
        return null;
    }

    MataKuliah06 searchMk(String matkul) {
        for (int i = 0; i < mkA.size(); i++) {
            if (matkul.equals(mkA.get(i).kodeMK)) {
                return mkA.get(i);
            }
        }
        return null;
    }

    public void removeMhs() {
        if (!mhsQueue.isEmpty()) {
            Mahasiswa06 removedMhs = mhsQueue.poll();
            mhsA.remove(removedMhs);
            System.out.println("Mahasiswa removed: " + removedMhs);
        } else {
            System.out.println("Queue is empty. No mahasiswa to remove.");
        }
    }

    public String toString(int idx1, int idx2) {
        return mhsA.get(idx1).nim + " = " + mhsA.get(idx1).nama + "\n" + mkA.get(idx2).namaMk + "\n" + mkA.get(idx2).namaMk + "\n" +
                mkA.get(idx2).toString();
    }

    static Comparator<NilaiMain06> CompNilai = new Comparator<NilaiMain06>() {
        public int compare(NilaiMain06 n1, NilaiMain06 n2) {
            if (n1.nilai < n2.nilai) {
                return 1;
            } else {
                return -1;
            }
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NilaiMain06> na = new ArrayList<>();
        NilaiMain06 m = new NilaiMain06(null, 0, null, null);

        Mahasiswa06[] mhs = new Mahasiswa06[6];
        mhs[0] = new Mahasiswa06("200001", "Thalhah", "021xxx");
        mhs[1] = new Mahasiswa06("200002", "Zubair", "021xxx");
        mhs[2] = new Mahasiswa06("200003", "Abdur-Rahman", "021xxx");
        mhs[3] = new Mahasiswa06("200004", "Sa'ad", "021xxx");
        mhs[4] = new Mahasiswa06("200005", "Sa'id", "021xxx");
        mhs[5] = new Mahasiswa06("200006", "Ubaidah", "021xxx");

        m.addMhs(mhs);

        MataKuliah06[] mk = new MataKuliah06[5];
        mk[0] = new MataKuliah06("0001", "Internet of Things", 3);
        mk[1] = new MataKuliah06("0002", "Algoritma dan Struktur Data", 2);
        mk[2] = new MataKuliah06("0003", "Algoritma dan Pemrograman", 2);
        mk[3] = new MataKuliah06("0004", "Praktikum Algoritma dan Struktur Data", 3);
        mk[4] = new MataKuliah06("0005", "Praktikum Algoritma dan Pemrograman", 3);

        m.addMk(mk);

        int menu = 0;
        do {
            System.out.println("**************************************************");
            System.out.println(" Sistem Pengelolaan Data Nilai Mahasiswa Semester ");
            System.out.println("**************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Mahasiswa");
            System.out.println("6. Keluar");
            System.out.println("**************************************************");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Kode MK: ");
                    String kd = sc.nextLine();
                    System.out.print("NIM: ");
                    String nimMhs = sc.nextLine();
                    System.out.print("Nilai: ");
                    double nilai = sc.nextDouble();

                    Mahasiswa06 mahaSiswas = m.searchMhs(nimMhs);
                    MataKuliah06 mataKuliahs = m.searchMk(kd);
                    if (mahaSiswas != null && mataKuliahs != null) {
                        NilaiMain06 nil = new NilaiMain06(kd, nilai, mahaSiswas, mataKuliahs);
                        na.add(nil);
                    } else {
                        System.out.println("Mahasiswa atau Mata Kuliah tidak ditemukan.");
                    }
                    break;

                case 2:
                    System.out.println("Daftar Nilai Mahasiswa");
                    System.out.println("NIM\tNama\tMata Kuliah\tSKS\tNilai");
                    for (NilaiMain06 nilaiEntry : na) {
                        System.out.println(nilaiEntry.mhs.nim + "\t" + nilaiEntry.mhs.nama + "\t" + nilaiEntry.mk.namaMk + "\t" + nilaiEntry.mk.sks + "\t" + nilaiEntry.nilai);
                    }
                    break;

                case 3:
                    System.out.println("Cari Nilai Mahasiswa");
                    System.out.print("NIM: ");
                    nimMhs = sc.nextLine();
                    System.out.println("NIM\tNama\tMata Kuliah\tSKS\tNilai");
                    for (NilaiMain06 nilaiEntry : na) {
                        if (nilaiEntry.mhs.nim.equals(nimMhs)) {
                            System.out.println(nilaiEntry.mhs.nim + "\t" + nilaiEntry.mhs.nama + "\t" + nilaiEntry.mk.namaMk + "\t" + nilaiEntry.mk.sks + "\t" + nilaiEntry.nilai);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Urutkan Data Mahasiswa Berdasarkan NIM");
                    na.sort(Comparator.comparing(entry -> entry.mhs.nim));
                    System.out.println("NIM\tNama\tMata Kuliah\tSKS\tNilai");
                    for (NilaiMain06 nilaiEntry : na) {
                        System.out.println(nilaiEntry.mhs.nim + "\t" + nilaiEntry.mhs.nama + "\t" + nilaiEntry.mk.namaMk + "\t" + nilaiEntry.mk.sks + "\t" + nilaiEntry.nilai);
                    }
                    break;
                    
                case 5:
                    m.removeMhs();
                    break;

                case 6:
                    System.out.println("**************************************************");   
                    System.out.println("Terima Kasih");
                    System.out.println("**************************************************");
                    break;
            }
        } while (menu < 6 && menu > 0);

        sc.close();
    }
}
