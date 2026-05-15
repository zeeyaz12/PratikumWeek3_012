public class Elektronik extends Produk {
    private int garansi;
    public static final double PPN = 0.11;

    public Elektronik(String nama, double harga, int stok, String kategori, int garansi) {
        super(nama, harga, stok, kategori);
        this.garansi = garansi;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Elektronik");

        System.out.println("Masa Expired: " + garansi + " Hari");
    }

    // Overloading hitungPajak
    // versi 1 - pajak standar PPN 11%
    public double hitungDiskon(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli) * PPN;
    }

    // versi 2 - pajak dengan presentase costum
    public double hitungDiskon(int jumlahBeli, double persenPajak){
        return hitungTotalHarga(jumlahBeli) * (persenPajak / 100);
    }

    public double hitungHargaSetelahDiskon(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli) + hitungPajak(jumlahBeli);
    }

    @Override
    public double hitungPajak(double harga){
        return harga * 0.20;
    }

    public void setGaransi(int garansi) {
        if (garansi < 1) {
            System.out.println("Masa Expired Tidak Boleh Negatif");
        } else {
            this.garansi = garansi;
        }
    }
}
