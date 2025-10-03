package service; // definisi package "service"

import model.Mahasiswa; // import kelas dari package lain

import java.util.ArrayList;
import java.util.List;

// Service untuk mengelola daftar Mahasiswa
public class MahasiswaService {
    private List<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    public void tampilkanMahasiswa() {
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println(m.getNim() + " - " + m.getNama());
        }
    }
}
