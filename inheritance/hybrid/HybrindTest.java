

public class HybrindTest {
    public static void main(String[] args) {
        // Hierarchical
        Dosen d1 = new Dosen("Pak Budi", "Pemrograman Java");
        d1.info();
        d1.mengajar();

        System.out.println();

        // Multilevel + Hybrid
        AsistenDosen ad1 = new AsistenDosen("Ainun", "Informatika", "Struktur Data");
        ad1.info();
        ad1.belajar();
        ad1.bekerja();
    }
}
