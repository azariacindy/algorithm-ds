public class mahasiswa06 {
    private String nama;
    private long nim; // uses a 62-bit long because if you use an int it is only 32-bit 
    private char jenisKelamin;
    private double ipk;
    
    // Constructor untuk membuat objek Mahasiswa
    public mahasiswa06(String nama, int nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
    
    // Metode untuk mencetak informasi mahasiswa
    public void cetakInfo() {
        System.out.println("Name: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Gender: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
    }
    
    // Getter untuk mendapatkan nilai IPK
    public double getIpk() {
        return ipk;
    }
}
