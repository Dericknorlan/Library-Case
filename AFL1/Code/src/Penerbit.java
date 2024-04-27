public class Penerbit {
    private int idPenerbit;
    private String nama;
    private String alamat;
    private int noHP;
    private String email;

public Penerbit() {
}

public Penerbit(int idPenerbit, String nama, String alamat, int noHP, String email) {
    this.idPenerbit = idPenerbit;
    this.nama = nama;
    this.alamat = alamat;
    this.noHP = noHP;
    this.email = email;
}

public int getIdPenerbit() {
    return idPenerbit;
}

public void setIdPenerbit(int idPenerbit) {
    this.idPenerbit = idPenerbit;
}

public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
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