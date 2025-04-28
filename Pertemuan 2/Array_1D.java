
package Pertemuan2;


public class Array_1D 
{
   public static void main(String[] args) {
        String[] laguFavorit = {
            "Somebody's Pleasure - Aziz Hedra",
            "Tampar - Juicy Luicy",
            "About You - The 1975",
            "Supernova - AESPA",
            "Open Arms - SZA",
            "Kenangan Manis - Pamungkas"
        };

        System.out.println("Daftar Lagu Favorit Saya:");
        for (int i = 0; i < laguFavorit.length; i++) {
            System.out.println((i + 1) + ". " + laguFavorit[i]);
        }
    }  
}
