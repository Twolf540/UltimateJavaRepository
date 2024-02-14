package Unit04;

public class StringLoops {

    public static boolean xyzThere(String str) {

        for (int i = 0; i <= str.length() - 3; i++) {
            // found an "xyz"
            if (str.substring(i, i + 3).equals("xyz")) {
                // if it's a ".xyz"
                if (i > 0 && str.substring(i - 1, i).equals(".")) {
                    // do nothing
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static String zipZap(String str) {
        String result = "";

        for (int i = 0; i <= str.length() - 3; i++) {
            // if I find zip, zap, zsp, etc
            if (str.substring(i, i + 1).equals("z") &&
                    str.substring(i + 2, i + 3).equals("p")) {
                result += "zp";
                i += 2;
            } else {
                result += str.substring(i, i + 1);
            }
        }

        if (str.length() < 3) {
            result += str;
        } else if (str.substring(str.length() - 3, str.length() - 2).equals("z") &&
                str.substring(str.length() - 1).equals("p")) {
            // do nothing
        } else {
            result += str.substring(str.length() - 2);
        }

        return result;
    }

    public static String doubleChar(String str) {
        String dosString = "";
        for(int charNum = 0; charNum <= (str.length() - 1); charNum++){
            String nextChar = (str.substring(charNum, charNum + 1)); 
            dosString += (nextChar + nextChar);
        }
        return dosString;
    }

    public static int countCode(String str) {
        int codeInstance = 0;
        for(int x = 0; x <= (str.length() - 4); x++){
            String strFrom = str.substring(x , x + 2);
            if (strFrom.equals("co")){
                String strFrom2 = str.substring((x + 3), (x + 4));
                if(strFrom2.equals("e")){
                    codeInstance++;
                }
            }
        }
        return codeInstance;
    }

    public static boolean bobThere(String str) {
        boolean bobInstance = false;
        for(int x = 0; x <= (str.length() - 3); x++){
            if(str.substring(x, x + 1).equals("b")){
                if(str.substring(x + 2, x + 3).equals("b")){
                    bobInstance = true;
                    x = (str.length());
                }
            }
        }
        return bobInstance;
    }

    public static boolean prefixAgain(String str, int n) {
        String preString = str.substring(0 , n);
        boolean prefixInstance = false;
        for(int x = n; x <= (str.length() - n); x++){
            if(str.substring(x , x + n).equals(preString)){
                prefixInstance = true;
            }
        }
        return prefixInstance;
    }

    public static boolean sameStarChar(String str) {
        int starCount = 0;
        int starInstance = 0;
        boolean isStar = false;
        if(str.length() > 0){
            for(int x = 0; x <= (str.length() - 3); x++){
                if(str.substring(x + 1, x + 2).equals("*")){
                    starCount++;
                    if(str.substring(x, x + 1).equals(str.substring(x + 2, x+3))){
                        starInstance++;
                    }
                }
            }
            if(starCount == starInstance){
                isStar = true;
            }
        }
        else{
            isStar = true;
        }
        return isStar;
    }

    public static String starOut(String str) {
        String starOutString = "";
        for(int x = 0; x <= (str.length() - 2); x++){
            if(!str.substring(x + 1, x + 2).equals("*")){
                starOutString += (str.substring(x, x + 1));
            }
            else{
                x += 2;
            }
        }
        starOutString += str.substring(str.length() - 1);
        return starOutString;
    }

    public static int countHi(String str) {
        return 0;
    }

    public static boolean endOther(String a, String b) {
        return false;
    }

    public static boolean xyBalance(String str) {
        return false;
    }

    public static String plusOut(String str, String word) {
        return "";
    }

    public static boolean catDog(String str) {
        return false;
    }

    public static String mixString(String a, String b) {
        return "";
    }

    public static String repeatSeparator(String word, String sep, int count) {
        return "";
    }
    public static void main(String[] args) {
        System.out.println(starOut("ab**cd"));
    }
}
