class Kaos extends Baju {
    private String ukuran;

    public Kaos(double hargaS, double hargaM, double hargaL) {
        super("Kaos", hargaS, hargaM, hargaL);
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