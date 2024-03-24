package Tugas3;

public class MataKuliah {
    //atribut
    private String kodeMK;
    private String namaMK;

    //konstruktor
    public MataKuliah(String kodeMK, String namaMK) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
    }


    //method getter
    public String getKodeMK() {
        return kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }
}
