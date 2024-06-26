package SideProjects.RPG;

public class RPGCharacter{
    //stats for the character
    private int HP;
    private int DEF;
    private int ATK;
    private int SP;
    private String name;
    private String classCh;
    // Creates a character w/ a name, class, SP, and randomly assigned values for ATK, DEf, HP, and MP based on the class
    public RPGCharacter(String n, String c){
        name = n;
        classCh = c;
        SP = 30;
        //Swordsman: High DEF, Low ATK
        if(c.equals("Swordsman")){
            HP = (int)(Math.random()*41) + 10;
            ATK = (int)(Math.random()*11) + 10;
            DEF = (int)(Math.random()*31) + 20;
        }
        //Archer: Low DEF, High ATK
        if(c.equals("Archer")){
            HP = (int)(Math.random()*41) + 10;
            ATK = (int)(Math.random()*31) + 20;
            DEF = (int)(Math.random()*11) + 10;
        }
    }
    public int getHP(){
        return HP;
    }
    public int getDEF(){
        return DEF;
    }
    public int getATK(){
        return ATK;
    }
    public int getSP(){
        return SP;
    }
    public String getName(){
        return name;
    }
    public String getClassCh(){
        return classCh;
    }
    public void hpChange(int d){
        HP -= d;
    }
    public void spChange(int d){
        SP -= d;
    }
    public boolean alive(){
        return this.HP > 0;
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(classCh);
        System.out.println("HP: " + HP + ", ATK: " + ATK + ", DEF: " + DEF);
    }

}