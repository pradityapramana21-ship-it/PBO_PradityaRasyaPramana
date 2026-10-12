package Praktikum04.Perpustakaan;

import java.time.LocalDate;
import java.util.ArrayList;

public class Peminjaman {
    private String idPeminjaman;
    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;
    private String status;
    private Anggota anggota;
    private ArrayList<Buku> daftarBuku;

    public Peminjaman(String idPeminjaman, Anggota anggota) {
        this.idPeminjaman = idPeminjaman;
        this.anggota = anggota;
        this.daftarBuku = new ArrayList<Buku>();
    }

    public void tambahBuku(Buku satuBuku) {
        daftarBuku.add(satuBuku);
    }

    public void buatPeminjaman() {
        this.tanggalPinjam = LocalDate.now();
        this.status = "Dipinjam";
        for (Buku satuBuku : daftarBuku) {
            satuBuku.setTersedia(false);
        }
        anggota.tambahPeminjaman(this);
    }

    public void kembalikanBuku() {
        this.tanggalKembali = LocalDate.now();
        this.status = "Dikembalikan";
        for (Buku satuBuku : daftarBuku) {
            satuBuku.setTersedia(true);
        }
    }

    public String getInfo() {
        String info = "   " + idPeminjaman + " | Pinjam: " + tanggalPinjam
                + " | Kembali: " + tanggalKembali + " | " + status + "\n";
        for (Buku satuBuku : daftarBuku) {
            info += "      - " + satuBuku.getJudul() + "\n";
        }
        return info;
    }
}