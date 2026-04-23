package Base;

public class Produk {
    private String nama;
    String kategori;
    protected double harga;
    public int stok;

    public Produk (String nama, double harga, int stok, String kategori){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
    }
    public String getNama(){
        return nama;
    }
    public int getStok(){
        return stok;
    }
    public double getHarga(){
        return harga;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
    public void setStok(int Stok){
        this.stok = stok;
    }


    public void tampilkanInfo(){
        System.out.println("Produk: " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
         System.out.println("-------------");

    }
}
