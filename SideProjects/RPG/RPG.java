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
            System.out.println("Your attack suceeded.");
            int tempHP = en.getHP;
            en.hpChange(((int)(en.getDEF())/10)*ch.getATK());
            System.out.println(en.getName()+" lost "+(tempHP-en.getHP)+" HP. It now has now have "+(en.getHP)+" HP");
        }
        else{
            System.out.println("Your attack failed. The enemy attacks you.");
            int tempHP = ch.getHP;
            ch.hpChange(((int)(ch.getDEF())/10)*en.getATK());
            System.out.println("You lost "+(tempHP-ch.getHP)+" HP. You now have "+(ch.getHP)+" HP");
        }
    }
    }
}