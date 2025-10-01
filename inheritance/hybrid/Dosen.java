public class Dosen extends Orang {
    private String mataKuliah;

    public Dosen(String nama, String mataKuliah) {
        super(nama);
        this.mataKuliah = mataKuliah;
    }

    public void mengajar() {
        System.out.println(nama + " mengajar mata kuliah " + mataKuliah);
    }
}
