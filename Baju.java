abstract class Baju implements TotalHarga {
    protected String jenisBaju;
    protected double hargaS;
    protected double hargaM;
    protected double hargaL;

    public Baju(String jenisBaju, double hargaS, double hargaM, double hargaL) {
        this.jenisBaju = jenisBaju;
        this.hargaS = hargaS;
        this.hargaM = hargaM;
        this.hargaL = hargaL;
    }

    public abstract void setUkuran(String ukuran);

    public abstract String getUkuran();

    @Override
    public String toString() {
        return String.format("| %-10s | %-7s | Rp%-6.2f |         |", jenisBaju, "Ukuran: " + getUkuran() , hitungTotalHarga());
    }

    protected double hitungHarga() {
        double harga = 0.0;
        String ukuran = getUkuran();
        if (ukuran.equalsIgnoreCase("S")) {
            harga = hargaS;
        } else if (ukuran.equalsIgnoreCase("M")) {
            harga = hargaM;
        } else if (ukuran.equalsIgnoreCase("L")) {
            harga = hargaL;
        }
        return harga;
    }

    public abstract double hitungTotalHarga();

}