
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int tiket, totalTiket = 0;

        double harga,diskon=0,totalHarga = 0;

        int i = 1;
        do {
            System.out.print("Masukkan jumlah tiket pelanggan ke- "+i+" (0 untuk keluar): ");
            tiket = sc.nextInt();

            if (tiket < 0) {
                System.out.println("Input tidak valid! Silakan input ulang.");
                continue; 
            }

            harga = tiket * hargaTiket;
            if (tiket > 10) {
                diskon = harga * 0.15;
            } else if (tiket > 4) {
                diskon = harga * 0.10;
            }

            totalTiket += tiket;
            totalHarga += harga - diskon;
            i++;

        }while(tiket !=0);
        System.out.println("Total tiket : " + totalTiket);
        System.out.println("Total harga : " + totalHarga);

        sc.close();
    }
}