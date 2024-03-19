package SideProjects.RPG;

public class RPGCharacter{
    //stats for the character
    private int HP;
    private int SP;
    private int ATK;
    private int DEF;
    private String name;
    private String classCh;
    // Creates a character w/ a name, class, SP, and randomly assigned values for ATK, DEf, HP, and MP based on the class
    public RPGCharacter(String n, String c){
        name = n;
        classCh = c;
        SP = 30;
        //Swordsman: High DEF, Low ATK
        if(c == "Swordsman"){
            HP = (int)(Math.random()*41) + 10;
            ATK = (int)(Math.random()*11) + 10;
            DEF = (int)(Math.random()*31) + 20;
        }
        //Archer: Low DEF, High ATK
        if(c == "Archer"){
            HP = (int)(Math.random()*41) + 10;
            ATK = (int)(Math.random()*31) + 20;
            DEF = (int)(Math.random()*11) + 10;
        }
    }
    public int getHP(){
        return HP;
    }
    public int getSP(){
        return SP;
    }
    public int getATK(){
        return ATK;
    }
    public int getDEF(){
        return DEF;
    }
    public void hpChange(int d){
        HP -= d;
    }
    public void spChange(int d){
        SP -= d;
    }
}