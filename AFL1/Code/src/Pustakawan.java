public class Pustakawan {
    private int idPustakawan;
    private String nama;
    private char gender;
    private int noHp;
    private String email;
    private String password;
    private String jabatan;
    

public Pustakawan() {}

public Pustakawan(int idPustakawan, String nama, char gender, int noHp, String email, String password,
        String jabatan) {
    this.idPustakawan = idPustakawan;
    this.nama = nama;
    this.gender = gender;
    this.noHp = noHp;
    this.email = email;
    this.password = password;
    this.jabatan = jabatan;
}

public int getIdPustakawan() {
    return idPustakawan;
}

public void setIdPustakawan(int idPustakawan) {
    this.idPustakawan = idPustakawan;
}

public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}

public char getGender() {
    return gender;
}

public void setGender(char gender) {
    this.gender = gender;
}

public int getNoHp() {
    return noHp;
}

public void setNoHp(int noHp) {
    this.noHp = noHp;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public String getJabatan() {
    return jabatan;
}

public void setJabatan(String jabatan) {
    this.jabatan = jabatan;
}
}