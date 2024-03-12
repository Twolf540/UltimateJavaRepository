package SideProjects;
public class RPGEnemy{
    //stats for the enemy
    private int HP;
    private int ATK;
    private int DEF;
    private String name;
    private String type;
    private static int goblinCount = 0;
    private static int orcCount = 0;
    public RPGEnemy(String t){
        type = t;
        //skeletons, slimes, witch
        //creates a name and stats for the enemy based on its type
        if(t == "Goblin"){
            name = ("Goblin" + (goblinCount + 1));
            HP = (int)((Math.random()*15)+10);
            ATK = (int)((Math.random()*15)+10);
            DEF = (int)((Math.random()*15)+10);
            goblinCount++;
        }
        if(t == "Orc"){
            name = ("Orc" + (goblinCount + 1));
            HP = (int)((Math.random()*25)+10);
            ATK = (int)((Math.random()*25)+10);
            DEF = (int)((Math.random()*25)+10);
            orcCount++;
        }
    }
    public int getHP(){
        return HP;
    }
    public int getATK(){
        return ATK;
    }
    public int getDEF(){
        return DEF;
    }
    public String getName(){
        return name;
    }
    public void hpChange(int d){
        HP -= d;
    }
}