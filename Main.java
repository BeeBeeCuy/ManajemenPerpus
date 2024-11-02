public class Main {
    public static void main(String[] args) {
        Buku buku1=new Buku("001","Dasar Pemrograman",5);
        Buku buku2=new Buku("001","Pemrograman Web",3);

        Anggota anggota1=new Anggota("Irfan Habibi","402");
        Anggota anggota2=new Anggota("Chandra Liow","401");

        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        anggota1.tampilkanInfo();
        anggota2.tampilkanInfo();

        Peminjaman pinjam1=new Peminjaman(buku1,anggota1);
        pinjam1.tampilkanTransaksi();

        Pengembalian kembali1=new Pengembalian(buku1,anggota1);
        kembali1.tampilkanTransaksi();

        StatistikTransaksi.tampilkanStatistik();

    }
}