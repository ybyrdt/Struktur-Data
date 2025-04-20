
package Pertemuan2;


public class Perulangan_DOWHILE 
{
     public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1, c = 0;

        System.out.println("Deret Fibonacci:");

       
        do {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        } while (a <= n);
    }
}
