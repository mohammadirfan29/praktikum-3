package ExceptionHandling;

public class TryCatchFinally {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3};

        try {
            // mencoba akses indeks ke-5 padahal array hanya punya 3 elemen
            System.out.println("Angka: " + angka[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        } finally {
            System.out.println("Blok finally tetap dijalankan, meskipun ada error.");
        }
    }
}
