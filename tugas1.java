
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int HARGA_TIKET = 50000;
        int tiket, totalTiket = 0;

        double harga,diskon=0,totalHarga = 0;

        String pesan = "ya";

        while (pesan.equalsIgnoreCase("ya")) {
            System.out.print("Masukkan jumlah tiket: ");
            tiket = sc.nextInt();

            if (tiket <= 0) {
                System.out.println("Input tidak valid! Silakan input ulang.");
                continue; 
            }

            harga = tiket * HARGA_TIKET;
            if (tiket > 10) {
                diskon = harga * 0.15;
            } else if (tiket > 4) {
                diskon = harga * 0.10;
            }

            totalTiket += tiket;
            totalHarga += harga - diskon;

            System.out.print("Apakah masih ada tiket yang dimasukkan? (ya/tidak) : ");
            pesan = sc.next();
        }

        System.out.println("Total tiket : " + totalTiket);
        System.out.println("Total harga : " + totalHarga);

        sc.close();
    }
}