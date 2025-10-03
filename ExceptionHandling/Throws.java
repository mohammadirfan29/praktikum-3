package ExceptionHandling;
import java.io.*;

public class Throws {
    // Method ini melempar IOException
    public static void bacaFile(String namaFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(namaFile));
        System.out.println(br.readLine());
        br.close();
    }

    public static void main(String[] args) {
        try {
            bacaFile("contoh.txt");
        } catch (IOException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }
}
