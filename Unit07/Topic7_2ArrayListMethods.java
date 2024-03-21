package Unit07;
import java.util.ArrayList;
public class Topic7_2ArrayListMethods {
    private static ArrayList<String> a1 = new ArrayList<String>(24);
    public ArrayList<String> getDelimitersList (String[] tokens){
        ArrayList<String> d = new ArrayList<String>();
        for(String str: tokens){
            d.add(str);
        }
        return d;
    }
    public static void main(String args[]){
    //     System.out.println(a1.size());
    //     ArrayList<String> a1 = new ArrayList<String>(2);
    //     a1.add("str");
    //     a1.add("str");
    //     String a = a1.remove(2);
    a1.add("he");
    a1.add("he");
    System.out.println(a1);
    }
}     