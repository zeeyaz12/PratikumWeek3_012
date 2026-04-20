//package: berbeda, bukan subclass - class Main

import Base.Elektronik;
import Base.Makanan;
import Base.Minuman;
import Base.Produk;

public class Main{
    public static void main(String[] args) {
        Produk produk = new Produk("Laptop", 15000000, 10);
        produk.tampilkanInfo();

        System.out.println(produk.getHarga());
        System.out.println(produk.getStok());

        Elektronik elektronik = new Elektronik("Mesin Cuci", 10000000, 5);

        elektronik.setGaransi(12);
        elektronik.tampilData();

        Makanan makanan = new Makanan("Aldi's Burger", 5000, 100, 1);
        makanan.setExpired(2);
        makanan.tampilData();

        Minuman minuman = new Minuman("Iced Matcha", 12000, 50, 1);
        minuman.setExpired(2);
        minuman.tampilkanData();
    }

}

