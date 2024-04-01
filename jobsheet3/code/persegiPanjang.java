public class persegiPanjang {
    public int panjang;
    public int lebar;

    public void cetakInfo() {
        System.out.println("Long: " + panjang + ", Width: " + lebar + ", Broad: " + hitungLuas() + ", Perimeter: " + hitungKeliling());
    }

    // dua parameter
    public persegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    // satu parameter
    public persegiPanjang(int s) {
        panjang = s;
        lebar = s;
    }

    public int hitungLuas() {
        return panjang * lebar;
    }

    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
