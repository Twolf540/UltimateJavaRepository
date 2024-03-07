package SideProjects;

public class RPGCharacter{
    private int HP;
    private int SP;
    private int ATK;
    private int DEF;
    private String name;
    private String class;
    // Creates a character w/ a name, class, SP, and randomly assigned values for ATK, DEf, HP, and MP based on the class
    public RPGCharacter(String n, String c){
        name = n;
        class = c;
        SP = 30;
        if(c == "Swordsman"){
            HP = (int)(Math.random()*41) + 10
            ATK = (int)(Math.random()*11) + 10
            DEF = (int)(Math.random()*31) + 20
        }
        if(c == "Archer"){
            HP = (int)(Math.random()*41) + 10
            ATK = (int)(Math.random()*31) + 20
            DEF = (int)(Math.random()*11) + 10
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