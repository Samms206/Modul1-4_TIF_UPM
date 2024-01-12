package Modul2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nasywa
 */
public class Tugas {
    protected String judul;
    protected String aktor;
    protected String sutradara;
    protected String publisher;
    protected String kategori;
    protected int stok;

    public Tugas(String judul, String aktor, String sutradara, String publisher, String kategori, int stok) {
        this.judul = judul;
        this.aktor = aktor;
        this.sutradara = sutradara;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Aktor: " + aktor);
        System.out.println("Sutradara: " + sutradara);
        System.out.println("Publisher: " + publisher);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println();
    }
}

class VCDFilm extends Tugas {
    public VCDFilm(String judul, String aktor, String sutradara, String publisher, String kategori, int stok) {
        super(judul, aktor, sutradara, publisher, kategori, stok);
    }
}

 class AplikasiRentalVCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tugas> daftarVCD = new ArrayList<>();

        System.out.print("Masukkan jumlah VCD yang akan diinput: ");
        int jumlahVCD = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahVCD; i++) {
            System.out.println("\nMasukkan data VCD ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Aktor: ");
            String aktor = scanner.nextLine();
            System.out.print("Sutradara: ");
            String sutradara = scanner.nextLine();
            System.out.print("Publisher: ");
            String publisher = scanner.nextLine();
            System.out.print("Kategori (SU/D/R/A): ");
            String kategori = scanner.nextLine();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            scanner.nextLine();

            Tugas vcd = new VCDFilm(judul, aktor, sutradara, publisher, kategori, stok);
            daftarVCD.add(vcd);
        }

        System.out.println("\nDaftar VCD yang Telah Diinput:");
        for (Tugas vcd : daftarVCD) {
            vcd.tampilkanInfo();
        }
    }
}
