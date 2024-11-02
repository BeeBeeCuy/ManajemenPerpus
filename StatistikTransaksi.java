class StatistikTransaksi {
    private static int totalPeminjaman = 0;
    private static int totalPengembalian = 0;

    public static void tambahPeminjaman() {
        totalPeminjaman++;
    }

    public static void tambahPengembalian() {
        totalPengembalian++;
    }

    public static void tampilkanStatistik() {
        System.out.println("\nStatistik Transaksi:");
        System.out.println("Total Peminjaman: " + totalPeminjaman);
        System.out.println("Total Pengembalian: " + totalPengembalian);
    }
}
