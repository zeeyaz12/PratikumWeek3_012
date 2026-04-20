package Base;
public class Elektronik extends Produk {
    private int masaGaransi;

    public Elektronik(String nama, double harga, int stok) {
        super(nama, harga, stok);
        this.masaGaransi = masaGaransi;
    }

    public void tampilData(){
        tampilkanInfo();
        System.out.println("masa garansi: " +  masaGaransi);
    }
    
    public void setGaransi(int masaGaransi){
        this.masaGaransi = masaGaransi;
    
    }
}
