public class Pengarang {
    private int idPengarang;
    private String namaPengarang;
    private String alamat;
    private int noHP;
    private String email;

public Pengarang() {}

public Pengarang(int idPengarang, String namaPengarang, String alamat, int noHP, String email) {
    this.idPengarang = idPengarang;
    this.namaPengarang = namaPengarang;
    this.alamat = alamat;
    this.noHP = noHP;
    this.email = email;
}

public int getIdPengarang() {
    return idPengarang;
}

public void setIdPengarang(int idPengarang) {
    this.idPengarang = idPengarang;
}

public String getNamaPengarang() {
    return namaPengarang;
}

public void setNamaPengarang(String namaPengarang) {
    this.namaPengarang = namaPengarang;
}

public String getAlamat() {
    return alamat;
}

public void setAlamat(String alamat) {
    this.alamat = alamat;
}

public int getNoHP() {
    return noHP;
}

public void setNoHP(int noHP) {
    this.noHP = noHP;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}
}