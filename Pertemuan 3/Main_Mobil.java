
package Pertemuan3;


public class Main_Mobil 
{
    String characteristic = "";
    String carBrand = "";
    String yearProduction = "";
    
    void moving(String fast){
        if(fast == "normal"){
            System.out.println("The car is running at 45 KMH");
        }
        if(fast == "slow"){
            System.out.println("The car is running at 20 KMH");
        }
        if(fast == "fast"){
            System.out.println("The car is running at 100 KMH");
        }
    }
     void stopped(){
        System.out.println("Car is has been stopped.");
    }
}
