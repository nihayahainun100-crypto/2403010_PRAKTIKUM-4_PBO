
public class AsistenDosen extends Mahasiswa implements Pekerja {
    private String matkul;

    public AsistenDosen(String nama, String jurusan, String matkul) {
        super(nama, jurusan);
        this.matkul = matkul;
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " membantu mengajar mata kuliah " + matkul);
    }
}


