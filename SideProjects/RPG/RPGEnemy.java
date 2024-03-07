package SideProjects;
public class RPGEnemy{
    private int HP;
    private int ATK;
    private int DEF;
    private String name;
    private String type;
    private static int goblinCount = 0;
    private static int orcCount;
    public RPGEnemy(String t){
        type = t;
        if(t == "Goblin"){
            name = ("Goblin" + (goblinCount + 1));
            HP = (int)((Math.random()*15)+1)
            ATK = (int)((Math.random()*15)+1)
            DEF = (int)((Math.random()*15)+1)
            goblinCount++;
        }
        if(t == "Orc"){
            name = ("Orc" + (goblinCount + 1));
            HP = (int)((Math.random()*25)+1)
            ATK = (int)((Math.random()*25)+1)
            DEF = (int)((Math.random()*25)+1)
            orcCount++;
        }
    }
}