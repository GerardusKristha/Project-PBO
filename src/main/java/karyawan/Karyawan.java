package karyawan;

import interfaces.Berbiaya;

public abstract class Karyawan implements Berbiaya {
    private String nama;
    private String id;
    protected int gajiPokok;

    public Karyawan(){
        this("","-00");
    }
    public Karyawan(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    @Override
    public String toString(){
        return "Nama: " + nama + "; ID: " + id;
    }
}
