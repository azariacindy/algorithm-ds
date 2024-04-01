public class coba {
    public static void main(String[] args) {
        int[] daftarNilai = new int[5];
        daftarNilai[0] = 7;
        daftarNilai[1] = 3;
        daftarNilai[2] = 8;
        daftarNilai[3] = 2;
        daftarNilai[4] = 1;

        // foreach
        for (int num : daftarNilai) {
            System.out.println(num);
        }

        System.out.println("=========");

        // for biasa
        for (int i = 0; i < daftarNilai.length; i++) {
            System.out.println(daftarNilai[i]);
        }
    }
}
