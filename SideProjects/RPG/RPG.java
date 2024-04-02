package SideProjects.RPG;

public class RPG{
    public static int NORMAL_ATTACK = 1;
    public static int SKILL_ATTACK = 2;

    public static enum Action {
        NORMAL, SKILL, DEFEND, SPECIAL_DEFEND;
    }


    // creates a roll object
    private static int chRoll = 0;
    private static int enRoll = 0;
    //method that takes a character and a targeted enemy and uses a roll to determine whether an attack succeeds.
    public static void playerTurn(RPGCharacter ch, RPGEnemy en, String t){
        //gets the neccesary variables to do an attack
        int skillPoints = ch.getSP();
        chRoll = (int)((Math.random()*20) + 1);
        enRoll = (int)((Math.random()*20) + 1);
        String attackType = t;
        //seperates the two attack types
        if(attackType == "normal attack"){
            /*checks to see if the roll was succesful.
            Reduces enemy/character HP based on the result and then prints out that HP change and the object's new HP\
            If either you or the enemy was reduced to 0 or less HP, prints out a defeat message*/
            if(chRoll >= 10){
                System.out.println(ch.getName() + "'s attack suceeded.");
                int tempHP = en.getHP();
                en.hpChange(((int)(en.getDEF())/10)*ch.getATK());
                System.out.println(en.getName()+" lost "+(tempHP-en.getHP())+" HP. It now has "+(en.getHP())+" HP");
                if(en.getHP() <= 0){
                    System.out.println(ch.getName() + " defeated " + en.getName());
                }
            }
            else{
                System.out.println(ch.getName() + "'s attack failed. " + en.getName() + " attacks " + ch.getName() + ".");
                int tempHP = ch.getHP();
                ch.hpChange(((int)(ch.getDEF())/10)*en.getATK());
                System.out.println(ch.getName() +" lost "+(tempHP-ch.getHP())+" HP. " +ch.getName() + " now has "+(ch.getHP())+" HP");
                if(ch.getHP() <= 0){
                    System.out.println(ch.getName() + " has been defeated");
                }
            }
        }
        if(attackType == "skill"){
                        /*checks to see if the roll was succesful.
            Reduces enemy/character HP based on the result and then prints out that HP change and the object's new HP*/
            if(chRoll >= 10){
                System.out.println(ch.getName() + "'s attack suceeded.");
                int tempHP = en.getHP();
                en.hpChange(((int)(en.getDEF())/10)*ch.getATK());
                System.out.println(en.getName()+" lost "+(tempHP-en.getHP())+" HP. It now has "+(en.getHP())+" HP");
                ch.spChange(2);
            }
            else{
                System.out.println(ch.getName() + "'s attack failed. " + en.getName() + " attacks " + ch.getName() + ".");
                int tempHP = ch.getHP();
                ch.hpChange(((int)(ch.getDEF())/10)*en.getATK());
                System.out.println(ch.getName() +" lost "+(tempHP-ch.getHP())+" HP. " + ch.getName() + " now has "+(ch.getHP())+" HP");
                ch.spChange(2);
            }
        }
        if(attackType == "defend"){
            /*checks to see if the roll was succesful.
            If the roll succeeded, rolls another die to check to see whether the player gets hit or counterattacks. 
            If the second roll succeeds, you get hit for reduced HP. If the initial player roll fails, the player is attack normally by the enemy*/
            if(chRoll >= 10){
                System.out.println(ch.getName() + "'s defense suceeded.");
                if(enRoll >= 10){
                    int tempHP = ch.getHP();
                    ch.hpChange(((int)(en.getDEF() + 10)/10)*en.getATK());
                    System.out.println(ch.getName() +" lost "+(tempHP-ch.getHP())+" HP. " + ch.getName() + " now has "+(ch.getHP())+" HP");
                    if(ch.getHP() <= 0){
                        System.out.println(ch.getName() + " has been defeated");
                    }
                }
                else{
                    System.out.println(en.getName() + "'s attack failed. " + ch.getName() + " counterattacks");
                    int tempHP = en.getHP();
                    en.hpChange(((int)(en.getDEF())/10)*(ch.getATK() + 10));
                    System.out.println(en.getName()+" lost "+(tempHP-en.getHP())+" HP. It now has "+(en.getHP())+" HP");
                    if(en.getHP() <= 0){
                        System.out.println(ch.getName() + " defeated " + en.getName());
                }

                }
            }
            else{
                System.out.println(ch.getName() + "'s defense failed. " + en.getName() + " attacks " + ch.getName() + ".");
                int tempHP = ch.getHP();
                ch.hpChange(((int)(en.getDEF())/10)*en.getATK());
                System.out.println(ch.getName() +" lost "+(tempHP-ch.getHP())+" HP. " + ch.getName() + " now has "+(ch.getHP())+" HP");
                if(ch.getHP() <= 0){
                    System.out.println(ch.getName() + " has been defeated");
                }
            }
        }
        if(attackType == "special defend"){
            /*checks to see if the roll was succesful.
            Reduces enemy/character HP based on the result and then prints out that HP change and the object's new HP\
            If either you or the enemy was reduced to 0 or less HP, prints out a defeat message*/
            if(chRoll >= 10){
                System.out.println(ch.getName() + "'s defense suceeded.");
                if(enRoll >= 10){
                    int tempHP = ch.getHP();
                    ch.hpChange(((int)(en.getDEF() + 10)/15)*en.getATK());
                    System.out.println(ch.getName() +" lost "+(tempHP-ch.getHP())+" HP. " + ch.getName() + " now has "+(ch.getHP())+" HP");
                    if(ch.getHP() <= 0){
                        System.out.println(ch.getName() + " has been defeated");
                    }
                    ch.spChange(2);
                }
                else{
                    System.out.println(en.getName() + "'s attack failed. " + ch.getName() + " counterattacks");
                    int tempHP = en.getHP();
                    en.hpChange(((int)(en.getDEF())/10)*(ch.getATK() + 15));
                    System.out.println(en.getName()+" lost "+(tempHP-en.getHP())+" HP. It now has "+(en.getHP())+" HP");
                    if(en.getHP() <= 0){
                        System.out.println(ch.getName() + " defeated " + en.getName());
                    }
                    ch.spChange(2);
                }
            }
            else{
                System.out.println(ch.getName() + "'s defense failed. " + en.getName() + " attacks " + ch.getName() + ".");
                int tempHP = ch.getHP();
                ch.hpChange(((int)(ch.getDEF())/10)*en.getATK());
                System.out.println(ch.getName() +" lost "+(tempHP-ch.getHP())+" HP. " + ch.getName() + " now has "+(ch.getHP())+" HP");
                if(ch.getHP() <= 0){
                    System.out.println(ch.getName() + " has been defeated");
                }
                ch.spChange(2);
            }
        }
    }
    public static void main(String[] args) {
        RPGCharacter ex = new RPGCharacter("ex","Swordsman");
        RPGEnemy exen = new RPGEnemy("Goblin");
        System.out.println(ex.getName() + " has " + ex.getHP() + " HP");
        System.out.println(exen.getName()+ " has " + exen.getHP() + " HP");
        RPG.playerTurn(ex, exen, "normal");
    }
}
