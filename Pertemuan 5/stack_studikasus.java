/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author ACER
 */
import java.util.Stack;

public class stack_studikasus {
    private Stack<String> aktivitas;

    // Konstruktor
    public stack_studikasus() {
        aktivitas = new Stack<>();
    }

    // Menambahkan aktivitas ke stack
    public void tambahAktivitas(String act) {
        aktivitas.push(act);
        System.out.println("Aktivitas ditambahkan: " + act);
    }

    // Melihat aktivitas terakhir tanpa menghapus
    public String lihatAktivitasTerakhir() {
        if (!aktivitas.isEmpty()) {
            return aktivitas.peek();
        } else {
            return "Tidak ada aktivitas.";
        }
    }

    // Menghapus aktivitas terakhir
    public String hapusAktivitasTerakhir() {
        if (!aktivitas.isEmpty()) {
            return aktivitas.pop();
        } else {
            return "Stack kosong, tidak ada aktivitas untuk dihapus.";
        }
    }

    // Menampilkan semua aktivitas
    public void tampilkanSemuaAktivitas() {
        if (aktivitas.isEmpty()) {
            System.out.println("Belum ada aktivitas.");
        } else {
            System.out.println("Riwayat aktivitas:");
            for (int i = aktivitas.size() - 1; i >= 0; i--) {
                System.out.println("- " + aktivitas.get(i));
            }
        }
    }

    // Main untuk uji coba
    public static void main(String[] args) {
        stack_studikasus riwayat = new stack_studikasus();

        riwayat.tambahAktivitas("Login");
        riwayat.tambahAktivitas("Melihat Profil");
        riwayat.tambahAktivitas("Mengubah Password");

        System.out.println("Aktivitas terakhir: " + riwayat.lihatAktivitasTerakhir());

        riwayat.tampilkanSemuaAktivitas();

        System.out.println("Menghapus aktivitas terakhir: " + riwayat.hapusAktivitasTerakhir());

        riwayat.tampilkanSemuaAktivitas();
    }
}
