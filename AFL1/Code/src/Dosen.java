public class Dosen extends Member {
    private int nik;

public Dosen() {
}

public Dosen(int idMember, String nama, String fakultas, String prodi, String posisi, int noHp, char gender,
        String usernama, String password, int nik) {
    super(idMember, nama, fakultas, prodi, posisi, noHp, gender, usernama, password);
    this.nik = nik;
}

public int getNik() {
    return nik;
}

public void setNik(int nik) {
    this.nik = nik;
}
}