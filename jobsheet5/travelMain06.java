package jobsheet5;

public class travelMain06 {
    public static void main(String[] args) {
        travel06[] penginapan = {
                new travel06("Hotel 5 Star", "Jakarta", 150, (byte) 4),
                new travel06("Villa Unik", "Batu", 200, (byte) 5),
                new travel06("Guest House Asri", "Malang", 100, (byte) 3),
                new travel06("Resort Mevvah", "Bandung", 250, (byte) 4)
        };

        System.out.println("Daftar penginapan sebelum sorting berdasarkan harga:");
        travelSort06.printPenginapan(penginapan);

        travelSort06.bubbleSortByPrice(penginapan);
        System.out.println("\nDaftar penginapan setelah sorting berdasarkan harga:");
        travelSort06.printPenginapan(penginapan);

        travelSort06.selectionSortByRating(penginapan);
        System.out.println("\nDaftar penginapan setelah sorting berdasarkan rating:");
        travelSort06.printPenginapan(penginapan);
    }
}
