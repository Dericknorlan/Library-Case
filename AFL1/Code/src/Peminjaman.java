public class Peminjaman {
    private int idTransaksi;
    private int idKoleksi;
    private int jumlahPinjam;
    private String tglPeminjaman;

public Peminjaman() {
}

public Peminjaman(int idTransaksi, int idKoleksi, int jumlahPinjam, String tglPeminjaman) {
    this.idTransaksi = idTransaksi;
    this.idKoleksi = idKoleksi;
    this.jumlahPinjam = jumlahPinjam;
    this.tglPeminjaman = tglPeminjaman;
}

public int getIdTransaksi() {
    return idTransaksi;
}

public void setIdTransaksi(int idTransaksi) {
    this.idTransaksi = idTransaksi;
}

public int getIdKoleksi() {
    return idKoleksi;
}

public void setIdKoleksi(int idKoleksi) {
    this.idKoleksi = idKoleksi;
}

public int getJumlahPinjam() {
    return jumlahPinjam;
}

public void setJumlahPinjam(int jumlahPinjam) {
    this.jumlahPinjam = jumlahPinjam;
}

public String getTglPeminjaman() {
    return tglPeminjaman;
}

public void setTglPeminjaman(String tglPeminjaman) {
    this.tglPeminjaman = tglPeminjaman;
}
}