import java.util.Scanner;
import java.util.InputMismatchException;

public class Tugas2KonversiWaktu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah detik: ");
            int detik = scanner.nextInt();

            int jam, menit, detikSisa;

            // Konversi detik menjadi jam, menit, dan detik
            jam = detik / 3600;
            detikSisa = detik % 3600;
            menit = detikSisa / 60;
            detikSisa = detikSisa % 60;

            System.out.println("Waktu yang diconvert:");
            System.out.printf("%02d:%02d:%02d%n", jam, menit, detikSisa);
        } catch (InputMismatchException e) {
            System.out.println("Masukkan harus berupa bilangan bulat.");
        } finally {
            scanner.close();
        }
    }
}
