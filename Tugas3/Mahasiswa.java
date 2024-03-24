package Tugas3;

public class Mahasiswa {
    // atribut
    private String NIM;
    private String nama;


    // konstruktor
    public Mahasiswa(String NIM, String nama) {
        this.NIM = NIM;
        this.nama = nama;
    }

    // setter getter
    public String getNIM() {
        return NIM;
    }


    public void setNIM(String nIM) {
        NIM = nIM;
    }


    public String getNama() {
        return nama;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }

    

}
