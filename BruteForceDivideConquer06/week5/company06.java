package week5;

public class company06 {
    public String nama;
    public double[] keuntungan;

    public company06(String nama, int jumlahBulan) {
        this.nama = nama;
        this.keuntungan = new double[jumlahBulan];
    }

    public double totalKeuntungan() {
        double total = 0;
        for (double untung : keuntungan) {
            total += untung;
        }
        return total;
    }
}
