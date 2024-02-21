package Unit04;

public class testFRQ {
    public static void longestStreak(String str){
        int count1 = 0;
        int count2 = 0;
        String letter = ("");
        String streak = ("");
        for(int x = 0; x <= (str.length() - 1); x++){
            letter = str.substring(x , x + 1);
            if(letter.equals(str.substring(x + 1, x + 2)) && count1 == 0){
                for(int i = x; i <= (str.length() - 1);  i++){
                    if(letter.equals(str.substring(i, i + 1))){
                        count1++;
                    }
                    else{
                        i = (str.length() + 1);
                        streak = (letter + " " + count1);
                    }
                }
            }
            if(letter.equals(str.substring(x + 1, x + 2)) && count1 > 0){
                for(int i = x; i <= (str.length() - 1);  i++){
                    if(letter.equals(str.substring(i, i + 1))){
                        count2++;
                    }
                    else{
                        i = (str.length() + 1);
                        if(count2 > count1){
                        streak = (letter + " " + count2);
                        }
                    }
                }
            }
        }
    System.out.println(streak);
    }

    public static void main(String[] args) {
        longestStreak("heeeelllllllllloo");
    }
}
