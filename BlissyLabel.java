import java.util.ArrayList;
import java.util.Scanner;

public class BlissyLabel {
    public static void main(String[] args) {
        String title = "Selamat Datang di Blissy Label";

        int totalWidth = 40;
        int titleLength = title.length();
        int sideWidth = (totalWidth - titleLength) / 2;

        String line = repeatSymbol("~", totalWidth);
        String spaces = repeatSymbol(" ", sideWidth);

        System.out.println(line);
        System.out.println(spaces + title + spaces);
        System.out.println(line);

        System.out.println("Best Items in Blissy Label: Dress, Kaos, Jeans, Rok, Tanktop");
        System.out.printf("+------------+---------+---------+---------+%n");
        System.out.printf("| Items      |   S     |   M     |   L     |%n");
        System.out.printf("+------------+---------+---------+---------+%n");
        System.out.printf("| Dress      | 250.000 | 255.000 | 300.000 |%n");
        System.out.printf("| Kaos       |  80.000 |  82.000 |  85.000 |%n");
        System.out.printf("| Jeans      | 250.000 | 260.000 | 275.000 |%n");
        System.out.printf("| Rok        | 180.000 | 182.000 | 187.000 |%n");
        System.out.printf("| Tank Top   | Harga sama untuk semua ukuran |%n");
        System.out.printf("+------------+---------+---------+---------+%n");
        System.out.println("Available Size: S, M, L");

        ArrayList<Baju> keranjangBaju = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean isLanjut = true;

        while (isLanjut) {
            System.out.print("Masukkan pilihan baju: ");
            String pilihanBaju = sc.nextLine();

            Baju baju = null;

            if (pilihanBaju.equalsIgnoreCase("Dress")) {
                baju = new Dress(250000.0, 255000.0, 300000.0);
            } else if (pilihanBaju.equalsIgnoreCase("Kaos")) {
                baju = new Kaos(80000.0, 82000.0, 85000.0);
            } else if (pilihanBaju.equalsIgnoreCase("Jeans")) {
                baju = new Jeans(250000.0, 260000.0, 275000.0);
            } else if (pilihanBaju.equalsIgnoreCase("Rok")) {
                baju = new Rok(180000.0, 182000.0, 187000.0);
            } else if (pilihanBaju.equalsIgnoreCase("Tank Top")) {
                baju = new TankTop(50000.0);
            } else {
                System.out.println("Pilihan baju tidak valid.");
                continue;
            }

            System.out.print("Pilih Sizenya: ");
            String ukuran = sc.nextLine();
            baju.setUkuran(ukuran);
            keranjangBaju.add(baju);

            System.out.print("Apakah Anda ingin memilih baju lain? (ya/tidak): ");
            String pilihanLanjut = sc.nextLine();
            if (pilihanLanjut.equalsIgnoreCase("tidak")) {
                isLanjut = false;
            }
        }

        System.out.println("Baju yang telah dipilih:");
        System.out.println("+------------+---------+---------+---------+");
        System.out.println("|    Items   | Ukuran  |  Harga  |         |");
        System.out.println("+------------+---------+---------+---------+");
        for (Baju baju : keranjangBaju) {
            System.out.println(baju);
        }
        System.out.println("+------------+---------+---------+---------+");

        double totalHarga = 0.0;
        for (Baju baju : keranjangBaju) {
            totalHarga += baju.hitungTotalHarga();
        }

        System.out.println("Total Harga Baju yang dipilih: " + formatHarga(totalHarga));
    }

    private static String formatHarga(double harga) {
        return String.format("Rp%.2f", harga);
    }

    private static String repeatSymbol(String symbol, int count) {
        String repeatedSymbol = "";
        for (int i = 0; i < count; i++) {
            repeatedSymbol += symbol;
        }
        return repeatedSymbol;
    }
} 

