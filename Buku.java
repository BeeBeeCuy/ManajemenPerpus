public class Buku {
    private String kodeBuku;
    private String namaBuku;
    private int stok;

    public Buku(String kodeBuku, String namaBuku, int stok) {
        this.kodeBuku = kodeBuku;
        this.namaBuku = namaBuku;
        this.stok = stok;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void tampilkanInfo(){
        System.out.println("Data Buku");
        System.out.println("Kode : "+this.kodeBuku+"\nJudul : "+this.namaBuku+"\nStok : "+this.stok+"\n");
    }
}
