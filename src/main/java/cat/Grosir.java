package cat;

public class Grosir extends Cat{

    public static final int MIN_JUMLAH = 10;

    public Grosir(NamaCat merek, int jumlahTerjual){
        super(merek, jumlahTerjual);
        margin = autoMarginGrosir();
    }

    public Grosir(NamaCat merek, int hargaPokok, int margin){
        super(merek, hargaPokok, margin);
    }

    @Override
    public void setJumlahTerjual(int penjualan) {
        if(penjualan >= MIN_JUMLAH){
            this.jumlahTerjual = penjualan;
        } else {
            System.out.println("Tidak cukup");
        }
    }

    public int autoMarginGrosir(){
        int margin = 0;
        switch (merek){
            case NIPPON -> margin = 18000;
            case JOTUN -> margin = 12000;
            case DULUX -> margin = 15500;
        }
        return margin;
    }
}
