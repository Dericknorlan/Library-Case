public class Mahasiswa extends Member {
    private int nim;

public Mahasiswa() {
}

public Mahasiswa(int idMember, String nama, String fakultas, String prodi, String posisi, int noHp,
        char gender, String usernama, String password, int nim) {
    super(idMember, nama, fakultas, prodi, posisi, noHp, gender, usernama, password);
    this.nim = nim;
}

public int getNim() {
    return nim;
}

public void setNim(int nim) {
    this.nim = nim;
}
}