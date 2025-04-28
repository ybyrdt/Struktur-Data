
package Pertemuan4;


public class MethodFungsi 
{
    public static void main(String[] args) {
        MethodFungsi rata_rata = new MethodFungsi();
        double nilai = rata_rata.rata_rata();
        System.out.println("Rata Rata Nilai dari fungsi = " + nilai);
    }
    
    // fungsi untuk menghitung nilai rata rata 
    public double rata_rata(){   
        int ipa = 85;
        int mtk = 90;
        int bindo = 95;
        
        int[] semua_nilai = {ipa, mtk, bindo};
        double jumblah = 0;
        double rata2;
        for(int i = 0; i<semua_nilai.length; i++){
            jumblah += semua_nilai[i];
        }
        rata2 = jumblah/semua_nilai.length;
        return rata2;
    }
}
