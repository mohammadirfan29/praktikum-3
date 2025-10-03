package ExceptionHandling;

public class Throw {
    public static void main(String[] args) {
        int umur = 15;
        
        if (umur < 18) {
            throw new IllegalArgumentException("Umur harus >= 18 tahun");
        }

        System.out.println("Akses diperbolehkan.");
    }
}
