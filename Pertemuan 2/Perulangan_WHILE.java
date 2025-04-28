
package Pertemuan2;


public class Perulangan_WHILE 
{
    public static void main(String[] args) {
        int n = 10;

        System.out.println("Pola Segitiga Terbalik dengan Simbol @/at:");

        while (n > 0) {
            int i = 0;
            while (i < n) {
                System.out.print("@");
                i++;
            }
            System.out.println();
            n--;
        }
    }
}
