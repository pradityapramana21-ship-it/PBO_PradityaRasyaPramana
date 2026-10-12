package Praktikum04.Perpustakaan;
public class Buku {
        private String judul;
        private String penulis;
        private int tahunTerbit;
        private boolean tersedia;

        public Buku(String judul, String penulis, int tahunTerbit) {
                this.judul = judul;
                this.penulis = penulis;
                this.tahunTerbit = tahunTerbit;
                this.tersedia = true;
        }
        public String getJudul() {
                return judul;
        }
        public void setTersedia(boolean tersedia) {
                this.tersedia = tersedia;
        }
        public void setnamaPenulis(String penulis) {
                this.penulis = penulis;
        }
        public void tampilInfo() {
                String status;
                if (tersedia) {
                        status = "Tersedia";
                } else {
                        status = "Dipinjam"; }
        System.out.println(judul + " - " + penulis + " (" + tahunTerbit + "), Status: " + status);
}
}