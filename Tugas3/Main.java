package Tugas3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("235150407111004", "Carloz Sainzzzzzzzzzzz");

        // membuat objek Matkul
        MataKuliah mataKuliah1 = new MataKuliah("MK001", "Pemrograman Lanjut");
        MataKuliah mataKuliah2 = new MataKuliah("MK002", "Dasar Basis Data");
        MataKuliah mataKuliah3 = new MataKuliah("MK003", "Pemodelan Proses Bisnis");
        MataKuliah mataKuliah4 = new MataKuliah("MK004", "Jaringan Data");
        MataKuliah mataKuliah5 = new MataKuliah("MK005", "Pancasila");
        MataKuliah mataKuliah6 = new MataKuliah("MK006","Pemrogaman Dasar");
        MataKuliah mataKuliah7 = new MataKuliah("MK007", "Arsitektur Komputer");

        // membuat objek Nilai
        Nilai nilai1 = new Nilai(mataKuliah1, 85);
        Nilai nilai2 = new Nilai(mataKuliah2, 75);
        Nilai nilai3 = new Nilai(mataKuliah3,30);
        Nilai nilai4 = new Nilai(mataKuliah4,100);
        Nilai nilai5 = new Nilai(mataKuliah5,50);
        Nilai nilai6 = new Nilai(mataKuliah6,65);
        Nilai nilai7 = new Nilai(mataKuliah7, 45);



        // menyimpan nilai dalam ArrayList
        ArrayList<Nilai> nilaiList = new ArrayList<>();
        nilaiList.add(nilai1);
        nilaiList.add(nilai2);
        nilaiList.add(nilai3);
        nilaiList.add(nilai4);
        nilaiList.add(nilai5);
        nilaiList.add(nilai6);
        nilaiList.add(nilai7);


        // show KHS
        System.out.println("Mahasiswa: " + mahasiswa.getNIM() + ", " + mahasiswa.getNama());
        for (Nilai nilai : nilaiList) {
            System.out.println(nilai);
        }
    }
}