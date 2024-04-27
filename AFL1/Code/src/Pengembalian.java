public class Pengembalian {
    private int idTransaksi;
    private boolean isRusak;
    private boolean isTelat;
    private int dendaTelat;
    private int dendaRusak;

public Pengembalian() {
}

public Pengembalian(int idTransaksi, boolean isRusak, boolean isStatusTelat, int dendaTelat, int dendaRusak) {
    this.idTransaksi = idTransaksi;
    this.isRusak = isRusak;
    this.dendaTelat = dendaTelat;
    this.dendaRusak = dendaRusak;
}

public int getIdTransaksi() {
    return idTransaksi;
}

public void setIdTransaksi(int idTransaksi) {
    this.idTransaksi = idTransaksi;
}

public boolean isRusak() {
    return isRusak;
}

public void setRusak(boolean isRusak) {
    this.isRusak = isRusak;
}

public boolean isTelat() {
    return isTelat;
}

public void setTelat(boolean isTelat) {
    this.isTelat = isTelat;
}

public int getDendaTelat() {
    return dendaTelat;
}

public void setDendaTelat(int dendaTelat) {
    this.dendaTelat = dendaTelat;
}

public int getDendaRusak() {
    return dendaRusak;
}

public void setDendaRusak(int dendaRusak) {
    this.dendaRusak = dendaRusak;
}
}