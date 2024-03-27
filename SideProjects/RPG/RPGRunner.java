package SideProjects.RPG;
import java.util.Scanner;
public class RPGRunner{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String ch1Name = scan.next();
        System.out.println("What is your class: Swordsman, Archer");
        String ch1Class = scan.next();
        RPGCharacter ex = new RPGCharacter(ch1Name, ch1Class);
        int decideEnemy = (int) ((Math.random()*2) + 1);
        RPGEnemy exen;
        if(decideEnemy == 1){
            exen = new RPGEnemy("Goblin");    
        }
        else{
            exen = new RPGEnemy("Orc");    
        }
        System.out.println("You have " + ex.getHP() + " HP");
        System.out.println("Your enemy has " + exen.getHP() + " HP");
        RPG.playerTurn(ex, exen, "normal attack");
    }
}