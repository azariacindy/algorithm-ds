package jobsheet5;

public class travel06 {
    String nama, kota;
    int harga;
    byte rating;

    public travel06(String n, String k, int h, byte r) {
        nama = n;
        kota = k;
        harga = h;
        rating = r;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public byte getRating() {
        return rating;
    }

    void show(){
        System.out.println("Name : "+ nama);
        System.out.println("City : "+ kota);
        System.out.println("Price : "+ harga);
        System.out.println("Rating : "+ rating);
    }
}
