package inheritance.multilevel;

public class MultilevelTest {
    public static void main(String[] args) {
        System.out.println("=== DEMO MULTILEVEL INHERITANCE ===\n");

        Kendaraan k = new Kendaraan("Yamaha", 2020);
        Mobil m = new Mobil("Toyota", 2022, 4);
        MobilSport s = new MobilSport("Ferrari", 2023, 2, true);

        // Demo setiap level
        k.display();
        k.percepat(30);

        m.display();
        m.nyalakanMesin();
        m.percepat(40);

        s.display();
        s.percepat(60);

        // Polymorphism
        System.out.println("\n=== Polymorphism ===");
        Kendaraan[] arr = {k, m, s};
        for (Kendaraan x : arr) {
            x.display();
        }

        // Type Casting
        System.out.println("\n=== Type Casting ===");
        if (s instanceof MobilSport) {
            MobilSport casted = (MobilSport) s;
            System.out.println("Turbo aktif? " + casted.turbo);
        }
    }
}

