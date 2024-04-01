import java.util.Scanner;

public class mahasiswaMain06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah mahasiswa
        System.out.print("Enter the number of students: ");
        int jumlahMahasiswa = scanner.nextInt();

        // Membuat array untuk menyimpan objek Mahasiswa
        mahasiswa06[] mahasiswaArray = new mahasiswa06[jumlahMahasiswa];

        // Input data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nEnter student data to-" + (i + 1));

            System.out.print("Enter a name: ");
            String nama = scanner.next();

            System.out.print("Enter the NIM: ");
            int nim = scanner.nextInt();

            System.out.print("Enter the gender (L/P): ");
            char jenisKelamin = scanner.next().charAt(0);

            System.out.print("Enter the IPK: ");
            double ipk = scanner.nextDouble();

            // Membuat objek Mahasiswa dan menyimpannya dalam array
            mahasiswaArray[i] = new mahasiswa06(nama, nim, jenisKelamin, ipk);
        }

        // Output data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nEnter student data to-" + (i + 1));
            mahasiswaArray[i].cetakInfo();
        }

        // Menghitung rata-rata IPK 
        double totalIpk = 0;
        for (mahasiswa06 mahasiswa : mahasiswaArray) { // foreach
            totalIpk += mahasiswa.getIpk();
        }
        double rataRataIpk = totalIpk / jumlahMahasiswa;

        System.out.println("\nAverage IPK: " + rataRataIpk);

        scanner.close();
    }
}
