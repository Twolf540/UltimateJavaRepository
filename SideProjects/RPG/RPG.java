package SideProjects;

public class RPG{
    // creates a roll object
    private static int roll = 0;
    //method that takes a character and a targeted enemy and uses a roll to determine whether an attack succeeds.
    public static void playerTurn(RPGCharacter ch, RPGEnemy en){
        int health = ch.getHP();
        int skillPoints = ch.getSP();
        roll1 = ((Math.random()*20) + 1);
        rollNum++;
        if(roll1 >= 10){
            System.out.println("Your attack suceeded");
            //add code to hurt enemy here
        }
        else{
            System.out.println("Your attack failed.");
        }
    }
    }
}