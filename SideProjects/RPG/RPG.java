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
    public static String playerTurn(RPGCharacter ch, RPGEnemy en, String t){
        //gets the neccesary variables to do an attack
        int skillPoints = ch.getSP();
        chRoll = (int)((Math.random()*20) + 1);
        enRoll = (int)((Math.random()*20) + 1);
        String attackType = t;
        //seperates the two attack types
        if(attackType.equals("Normal")){
            /*checks to see if the roll was succesful.
            Reduces enemy/character HP based on the result and then prints out that HP change and the object's new HP\
            If either you or the enemy was reduced to 0 or less HP, prints out a defeat message*/
            if(chRoll >= 10){
                int tempHP = en.getHP();
                en.hpChange(((int)(en.getDEF())/10)*ch.getATK());
                if(en.getHP() <= 0){
                   return (ch.getName() + "'s attack suceeded. " + en.getName()+" lost "+(tempHP-en.getHP())+" HP. " + ch.getName() + " defeated " + en.getName());
                }
                return (ch.getName() + "'s attack suceeded. " + en.getName()+" lost "+(tempHP-en.getHP())+" HP.");
            }
            else{
                int tempHP = ch.getHP();
                ch.hpChange(((int)(ch.getDEF())/10)*en.getATK());
                if(ch.getHP() <= 0){
                    return (ch.getName() + "'s attack failed. " + en.getName() + " attacks " + ch.getName() + ". " + ch.getName() +" lost "+(tempHP-ch.getHP())+" HP. "+ ch.getName() + " has been defeated");
                }
                return (ch.getName() + "'s attack failed. " + en.getName() + " attacks " + ch.getName() + ". " + ch.getName() +" lost "+(tempHP-ch.getHP())+" HP. "+ ch.getName() + " has been defeated");
            }
        }
        if(attackType.equals("Skill")){
                        /*checks to see if the roll was succesful.
            Reduces enemy/character HP based on the result and then prints out that HP change and the object's new HP*/
            if(skillPoints>=2){
                if(chRoll >= 10){
                    int tempHP = en.getHP();
                    en.hpChange(((int)(en.getDEF())/10)*ch.getATK());
                    ch.spChange(2);
                    skillPoints-=2;
                    if(en.getHP() <= 0){
                        return (ch.getName() + "'s skill suceeded. " + en.getName()+" lost "+(tempHP-en.getHP())+" HP. " + ch.getName() + " defeated " + en.getName());
                    } 
                    return (ch.getName() + "'s skill suceeded. " + en.getName()+" lost "+(tempHP-en.getHP())+" HP.");
                }
                else{
                    int tempHP = ch.getHP();
                    ch.hpChange(((int)(ch.getDEF())/10)*en.getATK());
                    ch.spChange(2);
                    skillPoints-=2;
                    if(ch.getHP() <= 0){
                        return (ch.getName() + "'s skill failed. " + en.getName() + " attacks " + ch.getName() + ". " + ch.getName() +" lost "+(tempHP-ch.getHP())+" HP. "+ ch.getName() + " has been defeated");
                    }
                    return (ch.getName() + "'s skill failed. " + en.getName() + " attacks " + ch.getName() + ". " + ch.getName() +" lost "+(tempHP-ch.getHP())+" HP. ");
                }
            }
            return ("You do not have enough skill points. Please choose another move.");
        }
        if(attackType.equals("Defend")){
            /*checks to see if the roll was succesful.
            If the roll succeeded, rolls another die to check to see whether the player gets hit or counterattacks. 
            If the second roll succeeds, you get hit for reduced HP. If the initial player roll fails, the player is attack normally by the enemy*/
            if(chRoll >= 10){
                if(enRoll >= 10){
                    int tempHP = ch.getHP();
                    ch.hpChange(((int)(en.getDEF() + 10)/10)*en.getATK());
                    if(ch.getHP() <= 0){
                        return (ch.getName() + "'s defense suceeded. " + ch.getName() + " lost "+(tempHP-ch.getHP())+" HP. "+ ch.getName() + " has been defeated");
                    }
                    return (ch.getName() + "'s defense suceeded. " + ch.getName() + " lost "+(tempHP-ch.getHP())+" HP.");
                }
                else{
                    int tempHP = en.getHP();
                    en.hpChange(((int)(en.getDEF())/10)*(ch.getATK() + 10));
                    if(en.getHP() <= 0){
                        return (ch.getName() + "'s defense suceeded. " + en.getName() + "'s attack failed. " + ch.getName() + " counterattacks.\n" +  en.getName()+" lost "+(tempHP-en.getHP())+" HP. " + ch.getName() + " defeated " + en.getName());
                    }
                    return (ch.getName() + "'s defense suceeded. " + en.getName() + "'s attack failed. " + ch.getName() + " counterattacks.\n" + en.getName()+" lost "+(tempHP-en.getHP())+" HP.");

                }
            }
            else{
                int tempHP = ch.getHP();
                ch.hpChange(((int)(en.getDEF())/10)*en.getATK());
                if(ch.getHP() <= 0){
                    return (ch.getName() + "'s defense failed. " + ch.getName() + " lost "+(tempHP-ch.getHP())+" HP. "+ ch.getName() + " has been defeated");
                }
                return (ch.getName() + "'s defense failed. " + ch.getName() + " lost "+(tempHP-ch.getHP())+" HP.");
            }
        }
        if(attackType.equals("special defend")){
            /*checks to see if the roll was succesful.
            Reduces enemy/character HP based on the result and then prints out that HP change and the object's new HP\
            If either you or the enemy was reduced to 0 or less HP, prints out a defeat message*/
            if(skillPoints>=2){
                if(chRoll >= 10){
                    if(enRoll >= 10){
                        int tempHP = ch.getHP();
                        ch.hpChange(((int)(en.getDEF() + 10)/15)*en.getATK());
                        ch.spChange(2);
                        skillPoints-=2;
                        if(ch.getHP() <= 0){
                            return (ch.getName() + "'s defense suceeded. " + ch.getName() + " lost "+(tempHP-ch.getHP())+" HP. "+ ch.getName() + " has been defeated");
                        }
                        return (ch.getName() + "'s defense suceeded. " + ch.getName() + " lost "+(tempHP-ch.getHP())+" HP.");
                    }
                    else{
                        int tempHP = en.getHP();
                        en.hpChange(((int)(en.getDEF())/10)*(ch.getATK() + 15));
                        ch.spChange(2);
                        skillPoints-=2;
                        if(en.getHP() <= 0){
                            return (ch.getName() + "'s defense suceeded. " + en.getName() + "'s attack failed. " + ch.getName() + " counterattacks.\n" + en.getName()+" lost "+(tempHP-en.getHP())+" HP. " + ch.getName() + " defeated " + en.getName());
                        }
                        return (ch.getName() + "'s defense suceeded. " + en.getName() + "'s attack failed. " + ch.getName() + " counterattacks.\n" + en.getName()+" lost "+(tempHP-en.getHP())+" HP.");
                    }
                }
                else{
                    int tempHP = ch.getHP();
                    ch.hpChange(((int)(ch.getDEF())/10)*en.getATK());
                    ch.spChange(2);
                    if(ch.getHP() <= 0){
                        return (ch.getName() + "'s defense failed. " + ch.getName() + " lost "+(tempHP-ch.getHP())+" HP. "+ ch.getName() + " has been defeated");
                    }
                    return (ch.getName() + "'s defense failed. " + ch.getName() + " lost "+(tempHP-ch.getHP())+" HP.");
                }
            }
            else{
                return ("You do not have enough skill points. Please choose another move.");
            }
        }
        return null;
    }
}
