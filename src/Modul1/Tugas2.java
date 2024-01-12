package Modul1;

/**
 *
 * @author nasywa
 */
public class Tugas2 {
    private String nama;
    private int stok;
    private double hargaSatuan;
    private double hargaTotal;
    
    public Tugas2(String nama, int stok, double hargaSatuan) {
        this.nama = nama;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
        this.hargaTotal = stok * this.hargaSatuan;
    }

    public void setHargaSatuan(double hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
        this.hargaTotal = this.stok * hargaSatuan;
    }

    public String getNama() {
        return this.nama;
    }

    public int getStok() {
        return this.stok;
    }

    public double getHargaSatuan() {
        return this.hargaSatuan;
    }

    public double getHargaTotal() {
        return this.hargaTotal;
    }

    public void setTotalHarga() {
        this.hargaTotal = this.stok * this.hargaSatuan;
    }

    public double getTotalHarga() {
        return this.hargaTotal;
    }

    public static void main(String[] args) {
        Tugas2 semangka = new Tugas2("Semangka", 15, 10000);
        semangka.setTotalHarga();
        Tugas2 melon = new Tugas2("Melon", 15, 12000);
        melon.setTotalHarga();
        Tugas2 nanas = new Tugas2("Nanas", 15, 5000);
        nanas.setTotalHarga();

        System.out.println("Data");
        System.out.println("==Semangka=="
                + "\nNama: " + semangka.getNama()
                + "\nStok: " + semangka.getStok()
                + "\nHarga Satuan: " + semangka.getHargaSatuan()
                + "\nHarga Total: " + semangka.getHargaTotal());
        System.out.println("\n==Melon=="
                + "\nNama: " + melon.getNama()
                + "\nStok: " + melon.getStok()
                + "\nHarga Satuan: " + melon.getHargaSatuan() 
                + "\nHarga Total: " + melon.getHargaTotal());
        System.out.println("\n==Nanas=="
                + "\nNama: " + nanas.getNama() 
                + "\nStok: " + nanas.getStok() 
                + "\nHarga Satuan: " + nanas.getHargaSatuan() 
                + "\nHarga Total: " + nanas.getHargaTotal());

        double totalHargaSemua = semangka.getHargaTotal() + melon.getHargaTotal() + nanas.getHargaTotal();
        System.out.println("\nTotal Harga Jika Semua Terjual: " + totalHargaSemua);
    }
}
