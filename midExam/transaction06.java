package midExam;

public class transaction06 {
    private double saldo, saldoAwal, saldoAkhir;
    private String tanggalTransaksi, type;

    public transaction06(double saldo, double saldoAwal, double saldoAkhir, String tanggalTransaksi, String type) {
        this.saldo = saldo;
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoAwal() {
        return saldoAwal;
    }

    public double getSaldoAkhir() {
        return saldoAkhir;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public String getType() {
        return type;
    }
}
