import java.util.*;
import java.io.*;

public class Main {
        private static ArrayList<Pustakawan> listPustakawan = new ArrayList<>();
        private static ArrayList<Member> listMember = new ArrayList<>();
        private static ArrayList<Buku> listBuku = new ArrayList<>();
        private static ArrayList<CD> listCD = new ArrayList<>();
        private static ArrayList<Pengarang> listPengarang = new ArrayList<>();
        private static ArrayList<Penerbit> listPenerbit = new ArrayList<>();
        private static ArrayList<Transaksi> listTransaksi = new ArrayList<>();
        private static ArrayList<Peminjaman> listPeminjaman = new ArrayList<>();
        private static ArrayList<Pengembalian> listPengembalian = new ArrayList<>();
        private static PrintWriter writer;

        public static void main(String[] args) {
                try {
                        writer = new PrintWriter(new File("output.txt"));
                } catch (FileNotFoundException e) {
                        System.out.println("Terjadi kesalahan saat membuat file.");
                        e.printStackTrace();
                }
                Scanner scans = new Scanner(System.in);
                String x = "y";
                while (x.equals("y")) { // Use equals method for string comparison
                        try {
                                System.out.println("Login Sebagai:\n 1. Member \n 2. Pustakawan");
                                System.out.print("Masukkan Angka 1/2: ");
                                int choice = scans.nextInt();
                                if (choice == 1) {
                                        System.out.println(" 1. Tambah Member\n 2. Pinjam Buku");
                                        System.out.print("Masukkan Angka 1/2: ");
                                        int choice1 = scans.nextInt();
                                        if (choice1 == 1) {
                                                inputMember(scans);
                                        } else if (choice1 == 2) {
                                                inputTransaksi(scans);
                                        }
                                } else if (choice == 2) {
                                        System.out.println(" 1. Tambah Buku\n 2. Cek Data Buku\n 3. Tambah CD\n 4. Cek Data CD\n 5. Cek Data Member\n 6. Tambah Pengarang\n 7. Tambah Penerbit\n 8. Tambah Pustakawan\n 9. Tambah Penminjaman\n 10. Tambah Pengembalian\n 11. Exit.");
                                        System.out.println("Pilih angka 1-11: ");
                                        int i = scans.nextInt();
                                        if (i == 1) {
                                                inputBuku(scans);
                                        } else if (i == 2) {
                                                checkBuku();;
                                        } else if (i == 3) {
                                                inputCD(scans);
                                        } else if (i == 4) {
                                                checkCD();
                                        } else if (i == 5) {
                                                checkMember();
                                        } else if (i == 6) {
                                                inputPengarang(scans);
                                        } else if (i == 7) {
                                                inputPenerbit(scans);
                                        } else if (i == 8) {
                                                inputPustakawan(scans);
                                        } else if (i == 9) {
                                                inputPeminjaman(scans);
                                        } else if (i == 10) {
                                                inputPengembalian(scans);
                                        } else if (i == 11) {
                                                System.out.println("Anda telah keluar dari program");
                                                break;
                                        }
                                }
                        } catch (java.util.InputMismatchException e) {
                                System.out.println("Invalid input. Please enter a valid integer.");
                                scans.nextLine(); // Consume the invalid input
                        }
                }
                scans.close(); // Close the scanner after you're done with all input operations
                writer.close(); // Close the PrintWriter after all operations
        }

        // Define inputMahasiswa(), inputTransaksi(), and inputBukuMajalah() methods
        // here

        // input Pustakawan
        private static void inputPustakawan(Scanner scans) {
                System.out.print("Masukkan idPustakawan: ");
                int idPustakawan = scans.nextInt();
                System.out.print("Masukkan Nama: ");
                String nama = scans.nextLine();
                System.out.print("Masukkan gender: ");
                char gender = scans.nextLine().charAt(0);
                System.out.print("Masukkan noHp: ");
                int noHp = scans.nextInt();
                System.out.print("Masukkan Jabatan: ");
                String jabatan = scans.nextLine();
                System.out.print("Masukkan Email: ");
                String email = scans.nextLine();
                System.out.print("Masukkan Password: ");
                String password = scans.nextLine();

                Pustakawan newPus = new Pustakawan(idPustakawan, nama, gender, noHp, jabatan, email, password);
                listPustakawan.add(newPus);
                System.out.println("Pustakawan berhasil ditambahkan.");

                writer.println("|==================================================================================================================|");
                writer.println("|                                                   Data Pustakawan                                                |");
                writer.println("|==================================================================================================================|");
                // Header tabel dengan format yang disesuaikan
                writer.printf("| %-3s | %-15s | %-6s | %-12s | %-12s | %-25s | %-10s |%n", "ID", "Nama", "Gender", "No HP", "Jabatan", "Email", "Password");
                writer.println("|==================================================================================================================|");
                // Loop untuk mencetak setiap baris data
                for (Pustakawan pus : listPustakawan) {
                // Mencetak data dengan format yang disesuaikan
                writer.printf("| %-3d | %-15s | %-6s | %-12s | %-12s | %-25s | %-10s |%n",
                                pus.getIdPustakawan(),
                                pus.getNama(),
                                pus.getGender(),
                                pus.getNoHp(),
                                pus.getJabatan(),
                                pus.getEmail(),
                                pus.getPassword());
                }
                writer.println("|==================================================================================================================|");

        }

        // input member
        private static void inputMember(Scanner scans) {
                System.out.println("\nProses Registrasi Member.....");
                System.out.print("Masukkan NIM/NIK\t: ");
                int idMember = scans.nextInt();
                scans.nextLine();
                System.out.print("Masukkan Nama\t\t: ");
                String nama = scans.nextLine();
                System.out.print("Masukkan Fakultas\t: ");
                String fakultas = scans.nextLine();
                System.out.print("Masukkan Prodi: ");
                String prodi = scans.nextLine();
                System.out.print("Masukkan Posisi: ");
                String posisi = scans.nextLine();
                System.out.print("Masukkan No HP: ");
                int noHp = scans.nextInt();
                System.out.print("Masukkan Gender: ");
                char gender = scans.next().charAt(0);
                System.out.print("Masukkan Usernama: ");
                String usernama = scans.nextLine();
                scans.nextLine();
                System.out.print("Masukkan Password: ");
                String password = scans.nextLine();

                Member newMember = new Member(idMember, nama, fakultas, prodi, posisi, noHp, gender, usernama, password);
                listMember.add(newMember);
                System.out.println("Member berhasil ditambahkan.");

                writer.println("|=======================================================================================================|");
                writer.println("|                                         Data Mahasiswa/Dosen                                          |");
                writer.println("|=======================================================================================================|");
                writer.printf("| %-8s | %-15s | %-10s | %-10s | %-10s | %-15s | %-6s | %-20s | %-10s |%n", "NIM/NIK",
                        "Nama", "Prodi", "Fakultas", "Posisi", "No HP", "Gender", "Username", "Password");
                writer.println("|=======================================================================================================|");
                for (Member member : listMember) {
                writer.printf("| %-8s | %-15s | %-10s | %-10s | %-10s | %-15s | %-6s | %-20s | %-10s |%n",
                                member.getIdMember(),
                                member.getNama(),
                                member.getProdi(),
                                member.getFakultas(),
                                member.getPosisi(),
                                member.getNoHp(),
                                member.getgender(),
                                member.getUsernama(),
                                member.getPassword());
                }
                writer.println("|=======================================================================================================|");

        }

        // cek data member
        private static void checkMember() {
                System.out.println("Checking Mahasiswa/Dosen data...");
                if (listMember.isEmpty()) {
                        System.out.println("No Mahasiswa/Dosen data available.");
                } else {
                        writer.println("Mahasiswa/Dosen data is available.");
                        writer.println("|=======================================================================================================|");
                        writer.println("|                                         Data Mahasiswa/Dosen                                          |");
                        writer.println("|=======================================================================================================|");
                        writer.printf("| %-8s | %-15s | %-10s | %-10s | %-10s | %-15s | %-6s | %-20s | %-10s |%n", "NIM/NIK",
                                "Nama", "Prodi", "Fakultas", "Posisi", "No HP", "Gender", "Username", "Password");
                        writer.println("|=======================================================================================================|");
                        for (Member member : listMember) {
                        writer.printf("| %-8s | %-15s | %-10s | %-10s | %-10s | %-15s | %-6s | %-20s | %-10s |%n",
                                        member.getIdMember(),
                                        member.getNama(),
                                        member.getProdi(),
                                        member.getFakultas(),
                                        member.getPosisi(),
                                        member.getNoHp(),
                                        member.getgender(),
                                        member.getUsernama(),
                                        member.getPassword());
                        }
                        writer.println("|=======================================================================================================|");

                                }
        }

        // input cd
        private static void inputCD(Scanner scans) {
                System.out.print("Masukkan ID CD: ");
                int idCD = scans.nextInt();
                System.out.print("Masukkan Stok CD: ");
                int stok = scans.nextInt();
                System.out.print("Masukkan Judul: ");
                String judul = scans.nextLine();
                System.out.print("Masukkan Tahun Terbit: ");
                int tahunTerbit = scans.nextInt();
                System.out.print("Masukkan Kategori: ");
                String kategori = scans.nextLine();
                System.out.print("Masukkan ID Pustakawan: ");
                int idPustakawan = scans.nextInt();

                CD newCD = new CD(idCD, stok, judul, tahunTerbit, kategori, idPustakawan);
                listCD.add(newCD);
                System.out.println("CD added successfully.");

                writer.println("|=======================================================================================================|");
                writer.println("|                                          CD Collection                                                |");
                writer.println("|=======================================================================================================|");
                writer.printf("| %-6s | %-4s | %-30s | %-6s | %-15s | %-12s |%n", "CD ID", "Stok", "Title", "Year", "Category", "Librarian ID");
                writer.println("|=======================================================================================================|");
                for (CD cd : listCD) {
                writer.printf("| %-6s | %-4s | %-30s | %-6s | %-15s | %-12s |%n", 
                                cd.getIdKoleksi(),
                                cd.getStok(),
                                cd.getJudul(),
                                cd.getTahunTerbit(),
                                cd.getKategori(), 
                                cd.getidPustakawan());
                }
                writer.println("|=======================================================================================================|");

        }

        // cek data cd
        private static void checkCD() {
                System.out.println("Checking CD data...");
                if (listCD.isEmpty()) {
                        System.out.println("No CD data available.");
                } else {
                        writer.println("CD data is available.");
                        writer.println("|=======================================================================================================|");
                        writer.println("|                                          CD Collection                                                |");
                        writer.println("|=======================================================================================================|");
                        writer.printf("| %-6s | %-4s | %-30s | %-6s | %-15s | %-12s |%n", "CD ID", "Stok", "Title", "Year", "Category", "Librarian ID");
                        writer.println("|=======================================================================================================|");
                        for (CD cd : listCD) {
                        writer.printf("| %-6s | %-4s | %-30s | %-6s | %-15s | %-12s |%n", 
                                        cd.getIdKoleksi(),
                                        cd.getStok(),
                                        cd.getJudul(),
                                        cd.getTahunTerbit(),
                                        cd.getKategori(), 
                                        cd.getidPustakawan());
                        }
                        writer.println("|=======================================================================================================|");
                }
        }

        // input buku
        private static void inputBuku(Scanner scans) {
                System.out.print("Masukkan ID Buku: ");
                int idBuku = scans.nextInt();
                System.out.print("Masukkan Stok Buku: ");
                int stok = scans.nextInt();
                System.out.print("Masukkan Judul: ");
                String judul = scans.nextLine();
                scans.nextLine();
                System.out.print("Enter Tahun Terbit: ");
                int tahunTerbit = scans.nextInt();
                System.out.print("Masukkan Kategori: ");
                String kategori = scans.nextLine();
                scans.nextLine();
                System.out.print("Masukkan ID Pustakawan: ");
                int idPus = scans.nextInt();
                System.out.print("Masukkan Edisi: ");
                String edisi = scans.nextLine();
                scans.nextLine();
                System.out.print("Masukkan Jenis Sampul: ");
                String jenisSampul = scans.nextLine();

                Buku newBuku = new Buku(idBuku, stok, judul, tahunTerbit, kategori, idPus, edisi, jenisSampul);
                listBuku.add(newBuku);
                System.out.println("Buku berhasil ditambahkan.");

                writer.println("|=======================================================================================================|");
                writer.println("|                                                Data Buku                                              |");
                writer.println("|=======================================================================================================|");
                writer.printf("| %-3s | %-4s | %-30s | %-12s | %-10s | %-12s | %-6s | %-12s |%n", "ID", "Stok", "Judul",
                        "Tahun Terbit", "Kategori", "ID Pustakawan", "Edisi", "Jenis Sampul");
                writer.println("|=======================================================================================================|");
                for (Buku buku : listBuku) {
                writer.printf("| %-3s | %-4s | %-30s | %-12s | %-10s | %-12s | %-6s | %-12s |%n",
                                buku.getIdKoleksi(),
                                buku.getStok(),
                                buku.getJudul(),
                                buku.getTahunTerbit(),
                                buku.getKategori(),
                                buku.getidPustakawan(),
                                buku.getEdisi(),
                                buku.getJenisSampul());
                }
                writer.println("|=======================================================================================================|");

        }

        // cek data buku
        private static void checkBuku() {
                System.out.println("Checking Buku data...");
                if (listBuku.isEmpty()) {
                        System.out.println("No Buku data available.");
                } else {
                        writer.println("|=======================================================================================================|");
                        writer.println("|                                                Data Buku                                              |");
                        writer.println("|=======================================================================================================|");
                        writer.printf("| %-3s | %-4s | %-30s | %-12s | %-10s | %-12s | %-6s | %-12s |%n", "ID", "Stok", "Judul",
                                "Tahun Terbit", "Kategori", "ID Pustakawan", "Edisi", "Jenis Sampul");
                        writer.println("|=======================================================================================================|");
                        for (Buku buku : listBuku) {
                        writer.printf("| %-3s | %-4s | %-30s | %-12s | %-10s | %-12s | %-6s | %-12s |%n",
                                        buku.getIdKoleksi(),
                                        buku.getStok(),
                                        buku.getJudul(),
                                        buku.getTahunTerbit(),
                                        buku.getKategori(),
                                        buku.getidPustakawan(),
                                        buku.getEdisi(),
                                        buku.getJenisSampul());
                        }
                        writer.println("|=======================================================================================================|");

                }
        }

        // input pengarang
        private static void inputPengarang(Scanner scans) {
                System.out.print("Masukkan ID Pengarang: ");
                int idPengarang = scans.nextInt();
                System.out.print("Masukkan Nama: ");
                String nama = scans.nextLine();
                System.out.print("Masukkan Alamat: ");
                String alamat = scans.nextLine();
                System.out.print("Masukkan No HP: ");
                int noHp = scans.nextInt();
                System.out.print("Masukkan Email: ");
                String email = scans.nextLine();

                Pengarang newPengarang = new Pengarang(idPengarang, nama, alamat, noHp, email);
                listPengarang.add(newPengarang);
                System.out.println("Pengarang berhasil ditambahkan.");

                writer.println("|=======================================================================================================|");
                writer.println("|                                                Data Pengarang                                         |");
                writer.println("|=======================================================================================================|");
                writer.printf("| %-3s | %-15s | %-25s | %-12s | %-20s |%n", "ID", "Nama", "Alamat", "No HP", "Email");
                writer.println("|=======================================================================================================|");
                for (Pengarang pengarang : listPengarang) {
                writer.printf("| %-3s | %-15s | %-25s | %-12s | %-20s |%n",
                                pengarang.getIdPengarang(),
                                pengarang.getNamaPengarang(),
                                pengarang.getAlamat(), 
                                pengarang.getNoHP(),
                                pengarang.getEmail());
                }
                writer.println("|=======================================================================================================|");


        }

        // input penerbit
        private static void inputPenerbit(Scanner scans) {
                System.out.print("Masukkan ID Penerbit: ");
                int idPenerbit = scans.nextInt();
                System.out.print("Masukkan Nama: ");
                String nama = scans.nextLine();
                System.out.print("Masukkan Alamat: ");
                String alamat = scans.nextLine();
                System.out.print("Masukkan No HP: ");
                int noHp = scans.nextInt();
                System.out.print("Masukkan Email: ");
                String email = scans.nextLine();

                Penerbit newPenerbit = new Penerbit(idPenerbit, nama, alamat, noHp, email);
                listPenerbit.add(newPenerbit);
                System.out.println("Penerbit berhasil ditambahkan.");

                writer.println("|=======================================================================================================|");
                writer.println("|                                                Data Penerbit                                          |");
                writer.println("|=======================================================================================================|");
                writer.printf("| %-3s | %-15s | %-25s | %-12s | %-20s |%n", "ID", "Nama", "Alamat", "No HP", "Email");
                writer.println("|=======================================================================================================|");
                for (Penerbit penerbit : listPenerbit) {
                    writer.printf("| %-3s | %-15s | %-25s | %-12s | %-20s |%n",
                                  penerbit.getIdPenerbit(),
                                  penerbit.getNama(),
                                  penerbit.getAlamat(),
                                  penerbit.getNoHP(),
                                  penerbit.getEmail());
                }
                writer.println("|=======================================================================================================|");
                
        }

        // input transaksi
        private static void inputTransaksi(Scanner scans) {
                System.out.print("Masukkan ID Transaksi: ");
                int idTransaksi = scans.nextInt();
                System.out.print("Masukkan ID Member: ");
                int idMember = scans.nextInt();
                System.out.print("Masukkan ID Pustakawan: ");
                int idPustakawan = scans.nextInt();
                System.out.print("Masukkan Jumlah Item: ");
                int jumlahItem = scans.nextInt();
                System.out.print("Masukkan Tanggal Pinjam: ");
                String tglPinjam = scans.nextLine();
                scans.nextLine();
                System.out.print("Masukkan Tanggal Kembali: ");
                String tglKembali = scans.nextLine();

                Transaksi newTransaksi = new Transaksi(idTransaksi, idMember, idPustakawan, jumlahItem, tglPinjam,
                                tglKembali);
                listTransaksi.add(newTransaksi);
                System.out.println("Transaksi berhasil ditambahkan.");

                writer.println("|=======================================================================================================|");
                writer.println("|                                              Data Transaksi                                           |");
                writer.println("|=======================================================================================================|");
                writer.printf("| %-3s | %-8s | %-12s | %-11s | %-10s | %-10s |%n", "ID", "ID Member", "ID Pustakawan",
                        "Jumlah Item", "Tgl Pinjam", "Tgl Kembali");
                writer.println("|=======================================================================================================|");
                for (Transaksi transaksi : listTransaksi) {
                writer.printf("| %-3s | %-8s | %-12s | %-11s | %-10s | %-10s |%n",
                                transaksi.getIdTransaksi(),
                                transaksi.getIdMember(),
                                transaksi.getPustakawan(),
                                transaksi.getJumlahItem(),
                                transaksi.getTglPeminjaman(),
                                transaksi.getTglPegembalian());
                }
                writer.println("|=======================================================================================================|");

        }

        // input peminjaman
        private static void inputPeminjaman(Scanner scans) {
                int idTransaksi;
                int idKoleksi;
                int jumlahPinjam;
                String tglPeminjaman;

                try {
                        System.out.print("Masukkan ID Transaksi: ");
                        idTransaksi = scans.nextInt();
                        System.out.print("Maskukkan ID Koleksi: ");
                        idKoleksi = scans.nextInt();
                        System.out.print("Masukkan Jumlah Pinjam: ");
                        jumlahPinjam = scans.nextInt();
                        System.out.print("Masukkan Tanggal Peminjaman: ");
                        tglPeminjaman = scans.nextLine();
                } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scans.nextLine(); // Consume the invalid input and prompt again
                        return; // Exit the method to avoid adding incorrect data
                }

                Peminjaman newPeminjaman = new Peminjaman(idTransaksi, idKoleksi, jumlahPinjam, tglPeminjaman);
                listPeminjaman.add(newPeminjaman);
                System.out.println("Peminjaman berhasil ditambahkan.");

                writer.println("|=======================================================================================================|");
                writer.println("|                                           Data Peminjaman                                             |");
                writer.println("|=======================================================================================================|");
                writer.printf("| %-15s | %-15s | %-20s | %-20s |%n", "ID Transaksi", "ID Koleksi", "Jumlah Peminjaman", "Tanggal Peminjaman");
                writer.println("|=======================================================================================================|");
                for (Peminjaman peminjaman : listPeminjaman) {
                writer.printf("| %-15s | %-15s | %-20s | %-20s |%n",
                        peminjaman.getIdTransaksi(),
                        peminjaman.getIdKoleksi(),
                        peminjaman.getJumlahPinjam(),
                        peminjaman.getTglPeminjaman());
                }
                writer.println("|=======================================================================================================|");

        }

        // input pengembalian
        private static void inputPengembalian(Scanner scans) {
                int idTransaksi;
                boolean isRusak = true;
                boolean isTelat = true;
                int dendaTelat;
                int dendaRusak;

                try {
                        System.out.print("Masukkan ID Transaksi: ");
                        idTransaksi = scans.nextInt();
                        System.out.print("Masukkan Status Rusak: ");
                        isRusak = scans.nextBoolean();
                        System.out.print("Masukkan Status Telat: ");
                        isTelat = scans.nextBoolean();
                        System.out.print("Masukkan Denda Telat: ");
                        dendaTelat = scans.nextInt();
                        System.out.print("Masukkan Denda Rusak: ");
                        dendaRusak = scans.nextInt();

                } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid integer.");
                        scans.nextLine(); // Consume the invalid input and prompt again
                        return; // Exit the method to avoid adding incorrect data
                }

                Pengembalian newPengembalian = new Pengembalian(idTransaksi, isRusak, isTelat, dendaTelat, dendaRusak);
                listPengembalian.add(newPengembalian);
                System.out.println("Pengembalian berhasil ditambahkan.");

                writer.println("|=======================================================================================================|");
                writer.println("|                                          Data Pengembalian                                            |");
                writer.println("|=======================================================================================================|");
                writer.printf("| %-15s | %-12s | %-12s | %-12s | %-12s |%n", "ID Transaksi", "Status Rusak", "Status Telat", "Denda Telat", "Denda Rusak");
                writer.println("|=======================================================================================================|");
                for (Pengembalian pengembalian : listPengembalian) {
                writer.printf("| %-15s | %-12s | %-12s | %-12s | %-12s |%n",
                                pengembalian.getIdTransaksi(),
                                pengembalian.isRusak(),
                                pengembalian.isTelat(),
                                pengembalian.getDendaTelat(),
                                pengembalian.getDendaRusak());
                }
                writer.println("|=======================================================================================================|");
        }
}