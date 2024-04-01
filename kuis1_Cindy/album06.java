package kuis1_Cindy;

public class album06 {
    public String judul, penyanyi;
    public int jumlah, harga;

    public album06(String judul, String penyanyi, int jumlah, int harga) {
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public void printAlbum06() {
        System.out.println("Album Title   : " + judul);
        System.out.println("Singer        : " + penyanyi);
        System.out.println("Quantity      : " + jumlah);
        System.out.println("Price         : Rp." + harga);
    }

    public int hitungPenjualan06() {
        return jumlah * harga;
    }

    public static album06 cariAlbumKurangPopuler06(album06[] albums) {
        album06 kurangPopuler = albums[0];

        for (int i = 1; i < albums.length; i++) {
            if (albums[i].hitungPenjualan06() < kurangPopuler.hitungPenjualan06()) {
                kurangPopuler = albums[i];
            }
        }

        return kurangPopuler;
    }

    // untuk mengurutkan album berdasarkan harga secara descending
    public static void daftarAlbum06(album06[] albums) {
        for (int i = 0; i < albums.length - 1; i++) {
            // loop luar: i adalah indeks elemen yang akan "maju" ke posisi akhir
            for (int j = 0; j < albums.length - i - 1; j++) {
                // loop dalam: j adalah indeks elemen yang dibandingkan dengan elemen berikutnya
                if (albums[j].harga < albums[j + 1].harga) {
                    // membandingkan harga dua elemen berturut-turut
                    // jika harga elemen pertama lebih kecil dari harga elemen berikutnya,
                    // maka lakukan pertukaran (swap) elemen tersebut.
                    album06 temp = albums[j];
                    albums[j] = albums[j + 1];
                    albums[j + 1] = temp;
                    // setelah swap, elemen dengan harga lebih besar akan "naik" ke posisi lebih awal atau teratas dalam array
                }
            }
        }

        System.out.println("\nDaftar Album (urut berdasarkan harga secara descending):");
        for (album06 album : albums) {
            album.printAlbum06();
            System.out.println("Total Sales: Rp." + album.hitungPenjualan06());
            System.out.println("-----------------------");
        }
    }
}
