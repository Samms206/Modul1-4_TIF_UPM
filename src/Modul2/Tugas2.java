package Modul2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nasywa
 */
public class Tugas2 {
     private static String namaUniversitas;

    public static void setNamaUniversitas(String nama) {
        namaUniversitas = nama;
    }

    public static String getNamaUniversitas() {
        return namaUniversitas;
    }
}

class Mahasiswa extends Tugas2 {
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;

    public Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJurusan() {
        return jurusan;
    }

    public static Mahasiswa inputMahasiswa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukkan Jurusan (541/542/543): ");
        String jurusan = scanner.nextLine();

        return new Mahasiswa(nim, nama, alamat, jurusan);
    }
}

class AplikasiDataMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();
        Tugas2.setNamaUniversitas(namaUniversitas);

        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        String inputLagi;
        while (true) {
            Mahasiswa mahasiswa = Mahasiswa.inputMahasiswa();
            daftarMahasiswa.add(mahasiswa);

            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            inputLagi = scanner.nextLine();

            if (!inputLagi.equalsIgnoreCase("Y")) {
                break;
            }
        }
        
        System.out.println("\nDaftar Mahasiswa " + Tugas2.getNamaUniversitas() + ":");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Alamat: " + mahasiswa.getAlamat());
            System.out.println("Jurusan: " + mahasiswa.getJurusan());
            System.out.println();
        }
    }
}
