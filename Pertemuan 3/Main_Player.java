
package Pertemuan3;


public class Main_Player 
{
    
    
    String name;
    int speed;
    int health;
    
    
    void run(){
        System.out.println("Welcome!");
        System.out.println(name +"is running...");
        System.out.println(name +"Speed:"+ speed);
        System.out.println(name +"health: "+ health);
    }
    
    
    boolean canRun(){
       return health > 0;
    }
    
    
    boolean  isDead(){
        return health <= 0;
    }
}
