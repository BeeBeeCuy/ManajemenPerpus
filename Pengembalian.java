class Pengembalian extends Transaksi {
    public Pengembalian(Buku buku, Anggota anggota) {
        super(buku, anggota);
        buku.setStok(buku.getStok() + 1);
        StatistikTransaksi.tambahPengembalian(); // Update total pengembalian
        System.out.println("Buku Berhasil Dikembalikan");
    }
}