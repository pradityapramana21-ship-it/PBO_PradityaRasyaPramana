public class Motor {
    private String platNomor;
    private boolean statusMesin;
    private int kecepatan;

public String getPlatNomor() {
    return platNomor;
}
public void setPlatNomor(String platNomor) {
    this.platNomor = platNomor;
}
public boolean getStatusMesin() {
    return statusMesin;
}
public void setStatusMesin(boolean statusMesin) {
    this.statusMesin = statusMesin;
}
public int getKecepatan(){
    return kecepatan;
}
public void setKecepatan(int kecepatan) {
    if (!this.statusMesin && kecepatan > 0) {
        System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
    }
    else if (kecepatan > 100) {
            System.out.println("Kecepatan mencapai batas maksimal 100!");
            this.kecepatan = 100; }
    else if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh bernilai negatif!");
        }
    else{this.kecepatan = kecepatan;
}
}
public void displayInfo(){
    System.out.println("Plat Nomor: " + this.platNomor);
    System.out.println("Status Mesin: " + (this.statusMesin ? "On": "Off"));
    System.out.println("Kecepatan: " + this.kecepatan);
    System.out.println("==========================");
}
}