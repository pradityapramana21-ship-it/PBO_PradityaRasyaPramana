package Praktikum04.Perpustakaan;
import java.util.ArrayList;
public class Anggota {
    private String nama;
    private String idAnggota;
    private ArrayList<Peminjaman> riwayatPeminjaman;

    public Anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.riwayatPeminjaman = new ArrayList<Peminjaman>();
    }

    public void tambahPeminjaman(Peminjaman satuPeminjaman) {
        riwayatPeminjaman.add(satuPeminjaman);
    }

    public void tampilInfoAnggota() {
        System.out.println("ID Anggota : " + idAnggota);
        System.out.println("Nama       : " + nama);
        if (riwayatPeminjaman.isEmpty()) {
            System.out.println("Belum ada riwayat peminjaman");
        } else {
            System.out.println("Riwayat Peminjaman :");
            for (Peminjaman satuPeminjaman : riwayatPeminjaman) {
                System.out.println(satuPeminjaman.getInfo());
            }
        }
        System.out.println();
}
}