import model.Mahasiswa;          // import dari package model
import service.MahasiswaService; // import dari package service

public class MainApp {
    public static void main(String[] args) {
        MahasiswaService service = new MahasiswaService();

        Mahasiswa m1 = new Mahasiswa("Irfan", 2403074);
        Mahasiswa m2 = new Mahasiswa("Budi", 2403075);

        service.tambahMahasiswa(m1);
        service.tambahMahasiswa(m2);

        System.out.println("Daftar Mahasiswa:");
        service.tampilkanMahasiswa();
    }
}
