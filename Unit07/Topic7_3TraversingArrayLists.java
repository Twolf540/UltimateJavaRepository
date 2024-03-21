package Unit07;
import java.util.ArrayList;
public class Topic7_3TraversingArrayLists {
    // public static void main(String[] args) {
    //     ArrayList<String> roster = new ArrayList<String>();
    //     int sum = 0;
    //     for (int i = 0; i <= roster.size() - 1; i++){
    //         sum = sum + roster.get(i).length();
    //     }
    //     System.out.println(sum);
    // }
    // public static void main(String[] args) {
    //     ArrayList<Double> grades = new ArrayList<Double>();
    //     for (int i = 0; i <= grades.size() - 1; i++){
    //         if(grades.get(i) < 70.0){
    //             grades.remove(i);
    //             i--;
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     ArrayList<String> roster = new ArrayList<String>();
    //     int sum = 0;
    //     for(String t : roster){
    //         sum += t.length();
    //     }
    //     System.out.println("You need" + sum + " characters");
    // }
    // public static void swapConsecutive(ArrayList<Double> myList){
    //     for(int i = 0; i <= myList.size() - 1; i = i + 2){
    //         double u = myList.get(i);
    //         myList.set(i, myList.get(i + 1));
    //         myList.set(i + 1, u);
    //     }
    // }
    // public static void display(ArrayList<String> myList){
    //     System.out.println(myList);
    // }
    public static ArrayList<Integer> duplicate(ArrayList<Integer> myList, int n){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++){
            for(int u = 0; u <= myList.size(); u++){
                temp.add(myList.get(u));
            }
        }
        return temp;
    }
}
