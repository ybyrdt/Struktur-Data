
package Pertemuan3;


public class Player 
{
    public static void main(String[] args) {
        
        Main_Player Radittt = new Main_Player();
        
        
        Radittt.name = "Radittt ";
        Radittt.speed = 69;
        Radittt.health = 55;
        
        Radittt.run();
        
        if (Radittt.canRun()){
            System.out.println(Radittt.name + "Still Run.");
        } else {
            System.out.println(Radittt.name + "Can't run anymore.");
        }
        
        if (Radittt.isDead()){
            System.out.println(Radittt.name +"Game Over!!");
        } else {
            System.out.println(Radittt.name +"ALIVEE!!!");
        }
    }
}
