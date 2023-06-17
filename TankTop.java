class TankTop extends Baju {
   private String ukuran;

    public TankTop(double harga) {
        super("Tank Top", harga, harga, harga);
    }

    @Override
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public String getUkuran() {
        return ukuran;
    }

    @Override
    public double hitungTotalHarga() {
        return hitungHarga();
    }
}