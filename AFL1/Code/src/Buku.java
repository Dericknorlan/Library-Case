public class Buku extends Koleksi {
    private String edisi;
    private String jenisSampul;

public Buku() {
}

public Buku(int idKoleksi, int stok, String judul, int tahunTerbit, String kategori, int idPustakawan, String edisi, String jenisSampul){
    super(idKoleksi, stok, judul, tahunTerbit, kategori, idPustakawan);
    this.edisi = edisi;
    this.jenisSampul = jenisSampul;
}

public String getEdisi() {
    return this.edisi;
}

public void setEdisi(String edisi) {
    this.edisi = edisi;
}

public String getJenisSampul() {
    return jenisSampul;
}

public void setJenisSampul(String jenisSampul) {
    this.jenisSampul = jenisSampul;
}
}
