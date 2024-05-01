package SideProjects.RPG;
import java.util.Scanner;
public class RPGRunner{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String ch1Name = scan.next();
        System.out.println("What is your class? (Swordsman, Archer)");
        String ch1Class = scan.next();
        RPGCharacter ex = new RPGCharacter(ch1Name, ch1Class);
        RPGEnemy exen;
        exen = new RPGEnemy("Goblin");        
        System.out.println("You have " + ex.getHP() + " HP");
        System.out.println("Your enemy has " + exen.getHP() + " HP");
        while(ex.getHP() > 0 && exen.getHP() > 0){
            System.out.println("What kind of move would you like to make?");
            String attack = scan.next();
            RPG.playerTurn(ex, exen, attack);
        }
        scan.close();
    }
}