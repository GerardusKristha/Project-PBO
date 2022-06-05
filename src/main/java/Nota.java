import cat.Cat;
import interfaces.Berbiaya;
import karyawan.Sales;

import java.util.Arrays;

public class Nota implements Berbiaya {

    public static final int TOTAL_CAT_NOTA = 3;

    private String id;
    private Sales sales;
    private Cat[] cat;
    private int jumlahEntry = 0;


    public Nota(String id, Sales sales) {
        this.id = id;
        this.sales = sales;
        cat = new Cat[TOTAL_CAT_NOTA];
    }

    public Cat[] getCat() {
        return cat;
    }

    public void setCat(Cat[] cat, int jumlahEntry) {
        if (this.jumlahEntry != 0) {
            for (int i = 0; i < this.jumlahEntry; i++) {
                sales.removeJumlahTerjual(this.cat[i].getJumlahTerjual());
            }
        }
        this.cat = cat;
        this.jumlahEntry = jumlahEntry;
        for (int i = 0; i < jumlahEntry; i++) {
            sales.addJumlahTerjual(cat[i].getJumlahTerjual());
        }

    }

    public void addCat(Cat cat) {
        if (jumlahEntry < 3) {
            this.cat[jumlahEntry] = cat;
            jumlahEntry++;
            sales.addJumlahTerjual(cat.getJumlahTerjual());
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    public int getJumlahEntry() {
        return jumlahEntry;
    }

    @Override
    public int getBiaya() {
        int biaya = 0;
        for (int i = 0; i < jumlahEntry; i++) {
            biaya += cat[i].getBiaya();
        }
        return biaya;
    }

    public String toString() {
        return "ID Nota: " + id + "; Sales : " + sales.toString() + "Cat : " + Arrays.toString(cat) + "";
    }
}
