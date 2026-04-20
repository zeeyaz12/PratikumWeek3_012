package Base;
public class Produk {
    private String nama;
    protected double harga;
    public int stok;

    public Produk (String nama, double harga, int stok){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        
    }

    public void tampilkanInfo(){
        System.out.println("Produk: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
        System.out.println("-------------");

    }
}
