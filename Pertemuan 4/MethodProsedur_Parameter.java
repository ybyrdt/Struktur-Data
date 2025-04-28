
package Pertemuan4;


public class MethodProsedur_Parameter 
{
    public static void main(String[] args) {
        MethodProsedur_Parameter mahasiswa = new MethodProsedur_Parameter();
        mahasiswa.simpan_nilai("Jason", 90, 80, 100);
        mahasiswa.simpan_nilai("Ilya", 89, 90, 100);
        mahasiswa.simpan_nilai("Nira", 96, 50, 100);
    }
    
    public void simpan_nilai(String nama, int ipa, int mtk, int struktur_data){
        int[] kumpulan_nilai = {ipa, mtk, struktur_data};
        String[] matkul = {"IPA ", "MTK ", "Struktur Data "};
        for(int i=0; i<matkul.length; i++){
          System.out.println("Nilai " +  matkul[i] + nama + " : " + kumpulan_nilai[i]);
        }
        System.out.println("\n");
    }
}
