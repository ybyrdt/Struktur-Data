/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;
/**
 *
 * @author ACER
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue_studikasus {
    public static void main(String[] args) {
        // Menggunakan Queue dari LinkedList
        Queue<String> antrianNasabah = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU PELAYANAN ANTRIAN BANK ===");
            System.out.println("1. Tambah nasabah ke antrian");
            System.out.println("2. Proses nasabah dari antrian");
            System.out.println("3. Lihat antrian saat ini");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama nasabah: ");
                    String namaNasabah = scanner.nextLine();
                    antrianNasabah.add(namaNasabah);
                    System.out.println(namaNasabah + " telah ditambahkan ke antrian.");
                    break;

                case 2:
                    if (!antrianNasabah.isEmpty()) {
                        String nasabahDiproses = antrianNasabah.poll();  // Ambil dan hapus nasabah pertama
                        System.out.println(nasabahDiproses + " sedang diproses di loket.");
                    } else {
                        System.out.println("Antrian kosong. Tidak ada nasabah untuk diproses.");
                    }
                    break;

                case 3:
                    System.out.println("Daftar antrian saat ini:");
                    if (antrianNasabah.isEmpty()) {
                        System.out.println("Antrian masih kosong.");
                    } else {
                        for (String nasabah : antrianNasabah) {
                            System.out.println("- " + nasabah);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
