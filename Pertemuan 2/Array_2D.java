
package Pertemuan2;


public class Array_2D 
{
    public static void main(String[] args) {
        String[][] buah = {
            {"Apel", "Merah"},
            {"Pisang", "Kuning"},
            {"Anggur", "Ungu"},
            {"Jeruk", "Oranye"},
            {"Semangka", "Hijau"}
        };

        System.out.println("Daftar Buah dan Warnanya:");
        for (int i = 0; i < buah.length; i++) {
            System.out.println((i + 1) + ". " + buah[i][0] + " - Warna: " + buah[i][1]);
        }
    }
}
