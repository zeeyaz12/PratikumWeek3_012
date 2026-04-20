package toko;

// package: elektronik (berbeda) - subclass dari produk
class Pemasukkan extends Produk{
    private double totalPemasukkan;
    public Pemasukkan(String nama, double harga, int stok, String kategori){
        super(nama, harga, kategori, stok);
        this.totalPemasukkan = 0;
    }

    void tambahPemasukkan(int jumlah){
        if ( jumlah <= stok){
            totalPemasukkan += jumlah * harga;
            stok -= jumlah; // public - boleh 
        } else {
            System.out.println("Stok tidak cukup!");
        }
    }
}

