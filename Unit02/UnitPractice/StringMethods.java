package Unit02.UnitPractice;

public class StringMethods {

    public static String helloName(String name) {
        String helloName = new String(name);
        return ("Hello " + helloName + "!");
    }

    public static String firstHalf(String str) {
        int stringLength = str.length();
        int halfLength = (stringLength / 2);
        String half1 = str.substring(0,halfLength);
        return half1;
    }

    public static boolean endsLy(String str) {
        int adverbLength = str.length();
        String adverbLy = str.substring((adverbLength - 2));
        boolean hasLy = adverbLy.equals("ly");
        return hasLy;
    }

    public static String makeAbba(String a, String b) {
        String stringA = new String(a);
        String stringB = new String(b);
        return (stringA + stringB + stringB + stringA);
    }

    public static String withoutEnd(String str) {
        String ended = new String(str);
        int endedLength = ended.length();
        String endless = ended.substring(1,(endedLength-1));
        return endless;
    }

    public static String nTwice(String str, int n) {
        int stringLength = str.length();
        String strFirstHalf = new String(str.substring(0, n));
        String strSecondHalf = new String(str.substring(stringLength - n));
        return (strFirstHalf + strSecondHalf);
    }

    public static String makeTags(String tag, String word) {
        return ("<" + tag + ">" + word + "</" + tag + ">");
    }

    public static String middleTwo(String str) {
        int halfString = (str.length() / 2);
        return str.substring((halfString - 1), (halfString + 1));
    }

    public static void main(String[] args) {
        // You can test your methods for specific inputs here. For example:
        System.out.println("helloName(\"Bella\") -> " + helloName("Bella"));
    }
}
