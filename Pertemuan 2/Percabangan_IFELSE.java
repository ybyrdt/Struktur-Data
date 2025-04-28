
package Pertemuan2;


public class Percabangan_IFELSE 
{
    public static void main(String[] args) {
        int kecepatanKendaraan = 70;
        String kategoriKecepatan;
        
        if (kecepatanKendaraan >= 120) {
            kategoriKecepatan = "Sangat Cepat";
        } 
            else if (kecepatanKendaraan >= 90) {
            kategoriKecepatan = "Cepat";
        } 
            else if (kecepatanKendaraan >= 60) {
            kategoriKecepatan = "Sedang";
        } 
            else if (kecepatanKendaraan >= 30) {
            kategoriKecepatan = "Lambat";
        } 
            else {
            kategoriKecepatan = "Sangat Lambat";
        }

        System.out.println("Kecepatan kendaraan: " + kecepatanKendaraan + " km/jam");
        System.out.println("Kategori kecepatan: " + kategoriKecepatan);
    }
}
