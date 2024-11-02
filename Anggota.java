public class Anggota {
    private String namaAnggota;
    private String idAnggota;

    public Anggota(String namaAnggota, String idAnggota) {
        this.namaAnggota = namaAnggota;
        this.idAnggota = idAnggota;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public void tampilkanInfo(){
        System.out.println("Data Anggota ");
        System.out.println("ID : "+this.idAnggota+"\nNama : "+this.namaAnggota+"\n");
    }
}
