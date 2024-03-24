package Tugas3;

public class Nilai {
    //atribut
    private MataKuliah mataKuliah;
    private int nilaiAngka;

    //konstruktor
    public Nilai(MataKuliah mataKuliah, int nilaiAngka) {
        this.mataKuliah = mataKuliah;
        this.nilaiAngka = nilaiAngka;
    }
  
    //method getter untuk menentukan nilai mahasiswa a/b/c/d/e
    public String getNilaiHuruf() {
        if (nilaiAngka >= 80 && nilaiAngka <= 100) {
            return "A";
        } else if (nilaiAngka >= 60 && nilaiAngka < 80) {
            return "B";
        } else if (nilaiAngka >= 50 && nilaiAngka < 60) {
            return "C";
        } else if (nilaiAngka >= 40 && nilaiAngka < 50) {
            return "D";
        } else {
            return "E";
        }
    }

    public String toString() {
        return "Mata Kuliah: " + mataKuliah.getKodeMK() + ", " + mataKuliah.getNamaMK() + ", Nilai: " + getNilaiHuruf();
    }
}
