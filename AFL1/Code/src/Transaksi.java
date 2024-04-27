public class Transaksi {
    private int idTransaksi;
    private int idMember;
    private int pustakawan;
    private int jumlahItem;
    private String tglPeminjaman;
    private String tglPegembalian;

public Transaksi() {
}

public Transaksi(int idTransaksi, int idMember, int pustakawan, int jumlahItem, String tglPeminjaman,
        String tglPegembalian) {
    this.idTransaksi = idTransaksi;
    this.idMember = idMember;
    this.pustakawan = pustakawan;
    this.jumlahItem = jumlahItem;
    this.tglPeminjaman = tglPeminjaman;
    this.tglPegembalian = tglPegembalian;
}

public int getIdTransaksi() {
    return idTransaksi;
}

public void setIdTransaksi(int idTransaksi) {
    this.idTransaksi = idTransaksi;
}

public int getIdMember() {
    return idMember;
}

public void setIdMember(int idMember) {
    this.idMember = idMember;
}

public int getPustakawan() {
    return pustakawan;
}

public void setPustakawan(int pustakawan) {
    this.pustakawan = pustakawan;
}

public int getJumlahItem() {
    return jumlahItem;
}

public void setJumlahItem(int jumlahItem) {
    this.jumlahItem = jumlahItem;
}

public String getTglPeminjaman() {
    return tglPeminjaman;
}

public void setTglPeminjaman(String tglPeminjaman) {
    this.tglPeminjaman = tglPeminjaman;
}

public String getTglPegembalian() {
    return tglPegembalian;
}

public void setTglPegembalian(String tglPegembalian) {
    this.tglPegembalian = tglPegembalian;
}


}