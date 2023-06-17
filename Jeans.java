class Jeans extends Baju {
    private String ukuran;

    public Jeans(double hargaS, double hargaM, double hargaL) {
        super("Jeans", hargaS, hargaM, hargaL);
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