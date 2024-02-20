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
        for (int charNum = 0; charNum <= (str.length() - 1); charNum++) {
            String nextChar = (str.substring(charNum, charNum + 1));
            dosString += (nextChar + nextChar);
        }
        return dosString;
    }

    public static int countCode(String str) {
        int codeInstance = 0;
        for (int x = 0; x <= (str.length() - 4); x++) {
            String strFrom = str.substring(x, x + 2);
            if (strFrom.equals("co")) {
                String strFrom2 = str.substring((x + 3), (x + 4));
                if (strFrom2.equals("e")) {
                    codeInstance++;
                }
            }
        }
        return codeInstance;
    }

    public static boolean bobThere(String str) {
        boolean bobInstance = false;
        for (int x = 0; x <= (str.length() - 3); x++) {
            if (str.substring(x, x + 1).equals("b")) {
                if (str.substring(x + 2, x + 3).equals("b")) {
                    bobInstance = true;
                    x = (str.length());
                }
            }
        }
        return bobInstance;
    }

    public static boolean prefixAgain(String str, int n) {
        String preString = str.substring(0, n);
        boolean prefixInstance = false;
        for (int x = n; x <= (str.length() - n); x++) {
            if (str.substring(x, x + n).equals(preString)) {
                prefixInstance = true;
            }
        }
        return prefixInstance;
    }

    public static boolean sameStarChar(String str) {
        int starCount = 0;
        int starInstance = 0;
        boolean isStar = false;
        if (str.length() > 0) {
            for (int x = 0; x <= (str.length() - 3); x++) {
                if (str.substring(x + 1, x + 2).equals("*")) {
                    starCount++;
                    if (str.substring(x, x + 1).equals(str.substring(x + 2, x + 3))) {
                        starInstance++;
                    }
                }
            }
            if (starCount == starInstance) {
                isStar = true;
            }
        } else {
            isStar = true;
        }
        return isStar;
    }

    public static String starOut(String str) {
        String starOutString = "";
        if (str.length() > 2) {
            for (int x = 0; x <= (str.length() - 1); x++) {
                if (x > 0 && x < (str.length() - 1)) {
                    if (!(str.substring(x - 1, x).equals("*"))
                        && !(str.substring(x, x + 1).equals("*"))
                        && !(str.substring(x + 1, x + 2).equals("*"))) {
                            starOutString += (str.substring(x, x + 1));
                    }
                } else if (x == 0) {
                    if (!(str.substring(x + 1, x + 2).equals("*"))
                        && !(str.substring(x, x + 1).equals("*"))) {
                            starOutString += (str.substring(x, x + 1));
                    }
                } else if (x == (str.length() - 1)) {
                    if (!(str.substring(x - 1, x).equals("*"))
                        && !(str.substring(x, x + 1).equals("*"))) {
                            starOutString += (str.substring(x, x + 1));
                    }
                }
            }
            return starOutString;
        } 
        else if(str.length() == 2){
            if (!(str.substring(0, 1).equals("*"))
                && !(str.substring(1 , 2).equals("*"))) {
                    starOutString = str;
            }
            return starOutString;
        }
        else if (str.length() == 1 && !str.substring(0, 1).equals("*")) {
            return str;
        } 
        else if (str.length() == 0) {
            return "";
        } 
        else {
            return "";
        }
    }
    
    public static int countHi(String str) {
        int count = 0;
        String part = "";
        if (str.length() >= 2){
            for(int x = 0; x <= (str.length() - 2); x++){
                part = str.substring(x , x + 2);
                if(part.equals("hi")){
                    count++;
                }
            }
        }
        else{
            count = 0;
        }
        return count;
    }

    public static boolean endOther(String a, String b) {
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();
        boolean abEqual = false;
        if(a.length() > b.length()){
            String aEnd = aLower.substring(aLower.length()-bLower.length());
            if(aEnd.equals(bLower)){
                abEqual = true;
            }
        }
        else if(b.length() > a.length()){  
            String bEnd = bLower.substring(bLower.length()-aLower.length());
            if(bEnd.equals(aLower)){
                abEqual = true;
            }
        }
        else if(a.length() == b.length()){
            if(aLower.equals(bLower)){
                abEqual = true;
            }
        }
        return abEqual;
    }

    public static boolean xyBalance(String str) {
        boolean isBalanced = true;
        if(str.length() >= 2){
            for(int x = 0; x <= str.length()-1; x++){
                if(str.substring(x , x + 1).equals("x")){
                    isBalanced = false;
                }
                if(str.substring(x , x + 1).equals("y")){
                    isBalanced = true;
                }
            }
        }
        else if(str.length() == 1 && str.equals("x")){
            isBalanced = false;
        }
        else if(str.length() == 0){
            isBalanced = true;
        }
        return isBalanced;
    }

    public static String plusOut(String str, String word) {
        String plusStr = "";
        int i = 0;
        for(int x = 0; x <= (str.length() - word.length()); x++){
            if(!(str.substring(x , (x + word.length())).equals(word))){
                plusStr += "+";
            }
            if((str.substring(x , (x + word.length())).equals(word))){
                plusStr += word;
                x += (word.length()- 1);
            }
            i = x;
        }
        for (int y = i; y < (str.length() - 1); y++){
                plusStr += "+";
            }
        return plusStr;
    }

    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        boolean dogCatEqual = false;
        for(int x = 0; x <= (str.length() - 3); x++){
            if(str.substring(x, x + 3).equals("dog")){
                dogCount++;
            }
            if(str.substring(x, x + 3).equals("cat")){
                catCount++;
            }
        }
        if(dogCount == catCount){
            dogCatEqual = true;
        }
        return dogCatEqual;
    }

    public static String mixString(String a, String b) {
        String combinedString = "";
        int longLength = Math.max(a.length(), b.length());
        for(int x = 0; x <= (longLength - 1); x++){
            if (x <= (a.length() - 1)){
                combinedString += a.substring(x, x + 1);
            }
            if (x <= (b.length() - 1)){
                combinedString += b.substring(x, x + 1);
            }
        }
        return combinedString;
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String repeated = "";
        for(int x = 1; x <= count; x++){
            repeated += (word);
            if(x < count){
                repeated += (sep);
            }
        }
        return repeated;
    }

    public static void main(String[] args) {
        System.out.println(starOut("ab**cd"));
    }
}
