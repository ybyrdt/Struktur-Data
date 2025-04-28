
package Pertemuan2;


public class Percabangan_SWITCHCASE {
    public static void main(String[] args) {
        
        char kamar = '5';
        System.out.println("Jenis Kamar Hotel:");
        System.out.println("1. Standard Room");
        System.out.println("2. Deluxe Room");
        System.out.println("3. Superior Room");
        System.out.println("4. Executive Room");
        System.out.println("5. Presidential Suite Room");
        System.out.println("Terima Kasih telah memilih kamar no:" + kamar);
        
        switch(kamar)
        {
            case '1':
                System.out.println("Pilihan Anda :"+ kamar +". Standard Room (Rp. 500.000,00)");
            break;
            case '2':
                System.out.println("Pilihan Anda :"+ kamar+ ". Deluxe Room (Rp. 1.000.000,00)");
            break;
            case '3':
                System.out.println("Pilihan Anda :"+ kamar +". Superior Room (Rp. 2.000.000,00)");
            break;
            case '4':
                System.out.println("Pilihan Anda :"+ kamar +". Executive Room (Rp. 3.500.000,00)");
            break;
            case '5':
                System.out.println("Pilihan Anda :"+ kamar +". Presidential Suite Room (Rp. 10.000.000,00)");
            break;
        }
    }
}
