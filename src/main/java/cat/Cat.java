package cat;

import interfaces.Berbiaya;
import interfaces.JumlahTerjual;

public abstract class Cat implements JumlahTerjual, Berbiaya {

    protected int jumlahTerjual;
    protected int hargaPokok;
    protected NamaCat merek;
    protected int margin;

    public Cat(NamaCat merek, int jumlahTerjual){
        this.merek = merek;
        this.jumlahTerjual = jumlahTerjual;
        hargaPokok = autoHargaPokok();
    }

    public Cat(NamaCat merek, int hargaPokok, int margin){
        this.merek = merek;
        this.hargaPokok = hargaPokok;
        this.margin = margin;
    }

    public NamaCat getMerek() {
        return merek;
    }

    public void setMerek(NamaCat merek) {
        this.merek = merek;
    }

    public int getJumlahTerjual(){
        return jumlahTerjual;
    }

    public abstract void setJumlahTerjual(int penjualan);

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public int getBiaya(){
        return (margin + hargaPokok) * jumlahTerjual;
    }

    private int autoHargaPokok(){
        int hargaPokok=0;
        switch (merek){
            case DULUX -> hargaPokok = 175000;
            case JOTUN -> hargaPokok = 160000;
            case NIPPON -> hargaPokok = 180000;
        }
        return hargaPokok;
    }
    public int getHargaPokok(){
        return hargaPokok;
    }

    public void setHargaPokok(int hargaPokok) {
        this.hargaPokok = hargaPokok;
    }

    public String toString(){
        return "Merek : " + merek;
    }
}
