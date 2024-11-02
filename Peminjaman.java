class Peminjaman extends Transaksi {
    public Peminjaman(Buku buku, Anggota anggota) {
        super(buku, anggota);
        if (buku.getStok() > 0) {
            buku.setStok(buku.getStok() - 1);
            StatistikTransaksi.tambahPeminjaman();
            System.out.println("Buku Berhasil Dipinjam");
        } else {
            System.out.println("Buku Gagal Dipinjam");
        }
    }
}