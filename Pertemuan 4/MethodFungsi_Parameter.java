
package Pertemuan4;


public class MethodFungsi_Parameter 
{
     public static void main(String[] args) {
        MethodFungsi_Parameter mahasiswa = new MethodFungsi_Parameter();
        mahasiswa.simpan_nilai("Bambang", 90, 78, 100);
        mahasiswa.simpan_nilai("Andi", 80, 40, 100); 
        
        MethodFungsi_Parameter Kalkulator = new MethodFungsi_Parameter();
        double rata2_Bambang = Kalkulator.hitung_rata2("Bambang", 90, 78, 100);
        System.out.println("Nilai Rata Rata nya Adalah " + rata2_Bambang + "\n");
        
        double rata2_Andi = Kalkulator.hitung_rata2("Andi", 80, 40, 100);
        System.out.println("Nilai Rata Rata nya Adalah " + rata2_Andi + "\n");
        
    }
    
    public void simpan_nilai(String nama, int ipa, int mtk, int struktur_data){
        int[] kumpulan_nilai = {ipa, mtk, struktur_data};
        String[] matkul = {"IPA ", "MTK ", "Struktuk Data "};
        for(int i=0; i<matkul.length; i++){
          System.out.println("Nilai " +  matkul[i] + nama + " : " + kumpulan_nilai[i]);
        }
        System.out.println("\n");
    }
    
    public double hitung_rata2 (String nama, int ipa, int mtk, int struktur_data){
        int[] kumpulan_nilai = {ipa, mtk, struktur_data};
        double jumblah = 0;
        double rata2;
        for(int i = 0; i<kumpulan_nilai.length; i++){
            jumblah += kumpulan_nilai[i];
        }
        rata2 = jumblah/kumpulan_nilai.length;
        System.out.println("Nama : " + nama);;
        return rata2;
    }
}
