package Praktikum04.Perpustakaan;
public class PerpustakaanDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Java", "Budi Santoso", 2020);
        Buku buku2 = new Buku("Basis Data", "Siti Aminah", 2019);

        buku1.setnamaPenulis("Praditya Rasya ");

        Anggota anggota1 = new Anggota("A001", "Puspa Widya");
        Anggota anggota2 = new Anggota("A002", "Yenny Anggraeni");

        Peminjaman p1 = new Peminjaman("P001", anggota1);
        p1.tambahBuku(buku1);
        p1.tambahBuku(buku2);
        p1.buatPeminjaman();
        p1.kembalikanBuku();

        Peminjaman p2 = new Peminjaman("P002", anggota1);
        p2.tambahBuku(buku2);
        p2.buatPeminjaman();

        buku1.tampilInfo();
        buku2.tampilInfo();

        System.out.println();

        anggota1.tampilInfoAnggota();
        anggota2.tampilInfoAnggota();
    }
}