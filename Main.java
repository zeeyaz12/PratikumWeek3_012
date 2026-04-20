//package: berbeda, bukan subclass - class Main

import toko.Produk;

public class Main{
    public static void main(String[] args) {
        Produk p = new Produk("Indomie Goreng", 3500, "Makanan", 100);

        System.out.println(p.stok); // public - boleh
        // System.out.println(p.harga); // ERROR - proctected, bukan subclass
        // System.out.println(p.kategori); //ERROR - default, beda package
        // System.out.println(p.nama); //ERROR - private

        p.tampilkanInfo(); // public method - boleh
    }

}

