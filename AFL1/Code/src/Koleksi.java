public abstract class Koleksi {
    private int idKoleksi;
    private int stok;
    private String judul;
    private int tahunTerbit;
    private String kategori;
    private int idPustakawan;

public Koleksi() {
}

public Koleksi(int idKoleksi, int stok, String judul, int tahunTerbit, String kategori, int idPustakawan) {
    this.idKoleksi = idKoleksi;
    this.stok = stok;
    this.judul = judul;
    this.tahunTerbit = tahunTerbit;
    this.kategori = kategori;
    this.idPustakawan = idPustakawan;
}

public int getIdKoleksi() {
    return this.idKoleksi;
}

public void setIdKoleksi(int idKoleksi) {
    this.idKoleksi = idKoleksi;
}

public int getStok() {
    return this.stok;
}

public void setStok(int stok) {
    this.stok = stok;
}

public String getJudul() {
    return this.judul;
}

public void setJudul(String judul) {
    this.judul = judul;
}

public int getTahunTerbit() {
    return this.tahunTerbit;
}

public void setTahunTerbit(int tahunTerbit) {
    this.tahunTerbit = tahunTerbit;
}

public String getKategori() {
    return this.kategori;
}

public void setKategori(String kategori) {
    this.kategori = kategori;
}

public int getidPustakawan() {
    return this.idPustakawan;
}

public void setidPustakawan(int idPustakawan) {
    this.idPustakawan = idPustakawan;
}
}