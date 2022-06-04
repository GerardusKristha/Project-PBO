package cat;

public class Ecer extends Cat{

    public Ecer(NamaCat merek, int jumlahTerjual){
        super(merek,jumlahTerjual);
        margin = autoMarginEcer();
    }

    public Ecer(NamaCat merek, int hargaPokok, int margin){
        super(merek, hargaPokok, margin);
    }

    public int autoMarginEcer(){
        int margin = 0;
        switch (merek){
            case NIPPON -> margin = 20000;
            case JOTUN -> margin = 15000;
            case DULUX -> margin = 17000;
        }
        return margin;
    }

    @Override
    public void setJumlahTerjual(int penjualan) {
        this.jumlahTerjual = penjualan;
    }
}
