
package Pertemuan3;


public class BangunDatar 
{
      public static void main(String[] args) {
        Main_BangunDatar Lingkaran = new Main_BangunDatar();
        Lingkaran.luas = Lingkaran.phi*Lingkaran.r*Lingkaran.r;
        System.out.println("Luas Lingkaran dari jari jari : " + Lingkaran.r + " Adalah " + Lingkaran.luas);
        
        Main_BangunDatar Segitiga = new Main_BangunDatar();
        Segitiga.luasSGT = (1.0/2)*Segitiga.alas*Segitiga.tinggi;
        System.out.println("Luas Segitiga Dengan Tinggi : " + Segitiga.tinggi + "dan Alas : " + Segitiga.alas + " Adalah " + Segitiga.luasSGT);
        
    }
}
