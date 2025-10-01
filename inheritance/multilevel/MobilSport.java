package inheritance.multilevel;

// Level 3: MobilSport
public class MobilSport extends Mobil {
    boolean turbo;

    public MobilSport(String merek, int tahun, int pintu, boolean turbo) {
        super(merek, tahun, pintu);
        this.turbo = turbo;
    }

    
    public String info() {
        return super.info() + " | Turbo: " + turbo;
    }

    
    public void percepat(double tambahan) {
        double bonus = turbo ? 20 : 0;
        kecepatan += tambahan + bonus;
        System.out.println("Mobil sport melaju! Kecepatan: " + kecepatan + " km/jam");
    }
}
