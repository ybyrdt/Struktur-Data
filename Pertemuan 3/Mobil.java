
package Pertemuan3;


public class Mobil 
{
    public static void main(String[] args) {
        Main_Mobil Avanza = new Main_Mobil();
        Avanza.characteristic = "Economical, Spacious, Low Maintenance Costs";
        Avanza.carBrand = "Toyota";
        Avanza.yearProduction = "2022";
        
        System.out.println("1. Toyota Avanza");
        System.out.println("Characteristic : " + Avanza.characteristic);
        System.out.println("Brand          : " + Avanza.carBrand);
        System.out.println("Production     : " + Avanza.yearProduction);
        
        Avanza.moving("slow");
        Avanza.moving("normal");
        Avanza.moving("fast");
        Avanza.stopped();
        
        Main_Mobil Civic = new Main_Mobil();
        Civic.characteristic = " Sporty, Economical, Elegant";
        Civic.carBrand = "Honda";
        Civic.yearProduction = "2022";
        
        System.out.println("2. Honda Civic");
        System.out.println("Karateristik : " + Civic.characteristic);
        System.out.println("Merek        : " + Civic.carBrand);
        System.out.println("Keluaran     : " + Civic.yearProduction);
        
        Civic.moving("slow");
        Civic.moving("normal");
        Civic.moving("fast");
        Civic.stopped();
    }
}
