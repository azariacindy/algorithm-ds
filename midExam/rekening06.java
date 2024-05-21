package midExam;

public class rekening06 {
    private String noRek, nama, namaIbu, phone, email;
    private transaction06[] transactions; // Array to store transactions
    private int transactionCount; // Counter for transactions

    public rekening06(String noRek, String nama, String namaIbu, String phone, String email) {
        this.noRek = noRek;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.phone = phone;
        this.email = email;
        this.transactions = new transaction06[100]; // Assuming maximum of 100 transactions per account
        this.transactionCount = 0; // Initialize transaction count
    }

    public String getNoRek() {
        return noRek;
    }

    public String getNama() {
        return nama;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    // Method to add transaction
    public void addTransaction(double saldoAwal, double saldoAkhir, String tanggalTransaksi, String type) {
        transaction06 transaction = new transaction06(saldoAkhir - saldoAwal, saldoAwal, saldoAkhir, tanggalTransaksi, type);
        transactions[transactionCount++] = transaction; // Add transaction and increment count
    }

    // Method to display transaction details
    public void displayTransactions() {
        for (int i = 0; i < transactionCount; i++) {
            System.out.println("Transaction " + (i + 1) + ":");
            System.out.println("Type: " + transactions[i].getType());
            System.out.println("Transaction Date: " + transactions[i].getTanggalTransaksi());
            System.out.println("Initial Balance: " + transactions[i].getSaldoAwal());
            System.out.println("Final Balance: " + transactions[i].getSaldoAkhir());
            System.out.println("Amount: " + transactions[i].getSaldo());
            System.out.println();
        }
    }

    // Method to get saldo akhir
    public double getSaldoAkhir() {
        double saldoAwal = 0;
        for (int i = 0; i < transactionCount; i++) {
            saldoAwal += transactions[i].getSaldo();
        }
        return saldoAwal;
    }
}
