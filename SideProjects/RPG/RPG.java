package SideProjects.RPG;

public class RPG{
    // creates a roll object
    private static int roll = 0;
    //method that takes a character and a targeted enemy and uses a roll to determine whether an attack succeeds.
    public static void playerTurn(RPGCharacter ch, RPGEnemy en, String t){
        //gets the neccesary variables to do an attack
        int skillPoints = ch.getSP();
        roll = (int)((Math.random()*20) + 1);
        String attackType = t;
        //seperates the two attack types
        if(attackType == "normal"){
            /*checks to see if the roll was succesful.
            Reduces enemy/character HP based on the result and then prints out that HP change and the object's new HP*/
            if(roll >= 10){
                System.out.println("Your attack suceeded.");
                int tempHP = en.getHP();
                en.hpChange(((int)(en.getDEF())/10)*ch.getATK());
                System.out.println(en.getName()+" lost "+(tempHP-en.getHP())+" HP. It now has "+(en.getHP())+" HP");
                if(en.getHP() <= 0){
                    System.out.println("You have defeated " + en.getName());
                }
            }
            else{
                System.out.println("Your attack failed. The enemy attacks you.");
                int tempHP = ch.getHP();
                ch.hpChange(((int)(ch.getDEF())/10)*en.getATK());
                System.out.println("You lost "+(tempHP-ch.getHP())+" HP. You now have "+(ch.getHP())+" HP");
                if(ch.getHP() <= 0){
                    System.out.println("You have been defeated");
                }
            }
        }
        if(attackType == "skill"){
                        /*checks to see if the roll was succesful.
            Reduces enemy/character HP based on the result and then prints out that HP change and the object's new HP*/
            if(roll >= 10){
                System.out.println("Your attack suceeded.");
                int tempHP = en.getHP();
                en.hpChange(((int)(en.getDEF())/10)*ch.getATK());
                System.out.println(en.getName()+" lost "+(tempHP-en.getHP())+" HP. It now has "+(en.getHP())+" HP");
                ch.spChange(2);
            }
            else{
                System.out.println("Your attack failed. The enemy attacks you.");
                int tempHP = ch.getHP();
                ch.hpChange(((int)(ch.getDEF())/10)*en.getATK());
                System.out.println("You lost "+(tempHP-ch.getHP())+" HP. You now have "+(ch.getHP())+" HP");
                ch.spChange(2);
            }
        }
    }
    public static void main(String[] args) {
        RPGCharacter ex = new RPGCharacter("ex","Swordsman");
        RPGEnemy exen = new RPGEnemy("Goblin");
        System.out.println("You have " + ex.getHP() + " HP");
        System.out.println("Your enemy has " + exen.getHP() + " HP");
        RPG.playerTurn(ex, exen, "normal");
    }
}
