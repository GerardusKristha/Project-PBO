package karyawan;

public class Manajer extends Karyawan{

    private int tunjangan;

    public Manajer(String nama, String id){
        super(nama, id);
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getBiaya(){
        return tunjangan+gajiPokok;
    }
}
