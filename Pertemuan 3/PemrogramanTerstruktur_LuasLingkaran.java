
package Pertemuan3;

public class PemrogramanTerstruktur_LuasLingkaran 
{
    static final double phi = 3.14;
    
    public static double hitungLuas(double jariJari){
        return phi * jariJari * jariJari;
    }
    
    public static void main(String[] args) {
        double r = 10.0;
        double luas = hitungLuas(r);
        
        System.out.println("Jari-jari lingkaran: " + r);
        System.out.println("Luas Lingkaran: "+ luas);
    }
    
}
