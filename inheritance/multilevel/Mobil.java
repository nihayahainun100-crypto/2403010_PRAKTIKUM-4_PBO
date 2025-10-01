package inheritance.multilevel;

public class Mobil extends Kendaraan {
    int pintu;

    public Mobil(String merek, int tahun, int pintu) {
        super(merek, tahun);
        this.pintu = pintu;
    }

    
    public String info() {
        return super.info() + " | Pintu: " + pintu;
    }

    public void nyalakanMesin() {
        System.out.println("Mesin mobil dinyalakan");
    }
}
