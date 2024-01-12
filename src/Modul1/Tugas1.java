
package Modul1;

/**
 *
 * @author nasywa
 */
public class Tugas1 {
    private String nama;
    private int stok;
    private double hargaSatuan;
    private double hargaTotal;
    
    public Tugas1(String nama, int stok, double hargaSatuan) {
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
        Tugas1 bolpoint = new Tugas1("Bolpoint", 10, 2000);
        bolpoint.setTotalHarga();
        Tugas1 pensil = new Tugas1("Pensil", 10, 1000);
        pensil.setTotalHarga();
        Tugas1 penghapus = new Tugas1("Penghapus", 10, 500);
        penghapus.setTotalHarga();

        System.out.println("Data");
        System.out.println("==Bolpoint=="
                + "\nNama: " + bolpoint.getNama()
                + "\nStok: " + bolpoint.getStok()
                + "\nHarga Satuan: " + bolpoint.getHargaSatuan()
                + "\nHarga Total: " + bolpoint.getHargaTotal());
        System.out.println("\n==Pensil=="
                + "\nNama: " + pensil.getNama()
                + "\nStok: " + pensil.getStok()
                + "\nHarga Satuan: " + pensil.getHargaSatuan() 
                + "\nHarga Total: " + pensil.getHargaTotal());
        System.out.println("\n==Penghapus=="
                + "\nNama: " + penghapus.getNama() 
                + "\nStok: " + penghapus.getStok() 
                + "\nHarga Satuan: " + penghapus.getHargaSatuan() 
                + "\nHarga Total: " + penghapus.getHargaTotal());

        double totalHargaSemua = bolpoint.getHargaTotal() + pensil.getHargaTotal() + penghapus.getHargaTotal();
        System.out.println("\nTotal Harga Jika Semua Terjual: " + totalHargaSemua);
    }
}
