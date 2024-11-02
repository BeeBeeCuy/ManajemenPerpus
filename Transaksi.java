import java.util.Date;

public class Transaksi {
    public Buku buku;
    public Anggota anggota;
    public Date tglTransaksi;

    public Transaksi(Buku buku, Anggota anggota) {
        this.buku = buku;
        this.anggota = anggota;
        this.tglTransaksi = new Date();
    }
    public void tampilkanTransaksi(){
        System.out.println("Tanggal Transaksi : "+this.tglTransaksi);
        anggota.tampilkanInfo();
        buku.tampilkanInfo();
    }
}
