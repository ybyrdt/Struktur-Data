
package Pertemuan4;


public class MethodProsedur 
{
     public static void main(String[] args) {
        MethodProsedur rata_rata = new MethodProsedur();
        rata_rata.rata_rata();
    }
    
    // prosedur menghitutung rata-rata
    public void rata_rata (){
        int ipa = 75;
        int mtk = 94;
        int bindo = 87;
        
        int[] semua_nilai = {ipa, mtk, bindo};
        double jumlah = 0;
        double rata2;
        for(int i = 0; i<semua_nilai.length; i++){
            jumlah += semua_nilai[i];
        }
        rata2 = jumlah/semua_nilai.length;
        System.out.println("Rata Rata Nilai = " + rata2);
    }
}
