package inheritance.multilevel;

public class Kendaraan {
     String merek;
    int tahun;
    double kecepatan;

    public Kendaraan(String merek, int tahun) {
        this.merek = merek;
        this.tahun = tahun;
        this.kecepatan = 0;
    }

    public String info() {
        return "Kendaraan: " + merek + " (" + tahun + ")";
    }

    public void percepat(double tambahan) {
        kecepatan += tambahan;
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }

    public void display() {
        System.out.println(info());
    }
}
