import java.util.Scanner;

public class Tugas2MahasiswaInfo {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan data
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jurusan: ");
        String jurusan = scanner.nextLine();

        System.out.print("Masukkan Fakultas: ");
        String fakultas = scanner.nextLine();

        // Menampilkan data yang dimasukkan
        System.out.println("\nData Mahasiswa:");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);

        // Menutup scanner
        scanner.close();
    }
}
