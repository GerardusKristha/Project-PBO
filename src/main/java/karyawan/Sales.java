package karyawan;

import interfaces.JumlahTerjual;

public class Sales extends Karyawan implements JumlahTerjual {
    public static final int KOMISI_PER_PENJUALAN=10000;
    private int jumlahTerjual;

    public Sales(String nama, String id){
        super(nama, id);
    }

    public void setJumlahTerjual(int jumlahTerjual){
        this.jumlahTerjual = jumlahTerjual;
    }
    public int getJumlahTerjual(){
        return jumlahTerjual;
    }

    public void addJumlahTerjual(int jumlahTerjual){
        this.jumlahTerjual += jumlahTerjual;
    }

    public int getBiaya(){
        return (jumlahTerjual *KOMISI_PER_PENJUALAN)+gajiPokok;
    }

    public void addPenjualan(int penjualan){
        this.jumlahTerjual += penjualan;
    }
}
