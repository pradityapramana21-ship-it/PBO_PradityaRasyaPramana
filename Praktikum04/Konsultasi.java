package Praktikum04;
import java.time.LocalDate;
import Praktikum04.Pegawai;
public class Konsultasi {
    private LocalDate tanggal;
    private Pegawai dokter;
    private Pegawai perawat;

public LocalDate getTanggal() {
    return tanggal;
}
public void setTanggal(LocalDate tanggal) {
    this.tanggal = tanggal;
}
public Pegawai getDokter() {
    return dokter;
}
public void setDokter(Pegawai dokter) {
    this.dokter = dokter;
}
public Pegawai getPerawat() {
    return perawat;
}
public void setPerawat(Pegawai perawat) {
    this.perawat = perawat;
}
public String getInfo() {
    String info = "";
    info += "\nTanggal: " + tanggal;
    info += ", Dokter: " + dokter.getInfo();
    info += ", Perawat: " + perawat.getInfo();
    info += "\n";

    return info;
}
}
