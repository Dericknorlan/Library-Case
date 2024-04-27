public class Member {
    private int idMember;
    private String nama;
    private String fakultas;
    private String prodi;
    private String posisi;
    private int noHp;
    private char gender;
    private String usernama;
    private String password;

public Member() {
}

public Member(int idMember, String nama, String fakultas, String prodi, String posisi, int noHp, char gender,
        String usernama, String password) {
    this.idMember = idMember;
    this.nama = nama;
    this.fakultas = fakultas;
    this.prodi = prodi;
    this.posisi = posisi;
    this.noHp = noHp;
    this.gender = gender;
    this.usernama = usernama;
    this.password = password;
}

public boolean checkNull() {
    if (this.password != null) {
        return true;
    } else {
        return false;
    }
}

public int getIdMember() {
    return this.idMember;
}

public void setIdMember(int idMember) {
    this.idMember = idMember;
}

public String getNama() {
    return this.nama;
}

public void setNama(String nama) {
    this.nama = nama;
}

public String getFakultas() {
    return this.fakultas;
}

public void setFakultas(String fakultas) {
    this.fakultas = fakultas;
}

public String getProdi() {
    return this.prodi;
}

public void setProdi(String prodi) {
    this.prodi = prodi;
}

public String getPosisi() {
    return this.posisi;
}

public void setPosisi(String posisi) {
    this.posisi = posisi;
}

public int getNoHp() {
    return this.noHp;
}

public void setNoTelp(int noHp) {
    this.noHp = noHp;
}

public char isgender() {
    return this.gender;
}

public char getgender() {
    return this.gender;
}

public void setgender(char gender) {
    this.gender = gender;
}

public String getUsernama() {
    return this.usernama;
}

public void setUsernama(String usernama) {
    this.usernama = usernama;
}

public String getPassword() {
    return this.password;
}

public void setPassword(String password) {
    this.password = password;
}
}