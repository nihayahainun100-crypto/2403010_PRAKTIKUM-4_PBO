public class Mahasiswa extends Orang {
    protected String jurusan;

    public Mahasiswa(String nama, String jurusan) {
        super(nama);
        this.jurusan = jurusan;
    }

    public void belajar() {
        System.out.println(nama + " belajar di jurusan " + jurusan);
    }
}
