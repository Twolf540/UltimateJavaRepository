package Unit04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringLoopsTest {

    @Test
    void doubleChar() {
        assertEquals("TThhee", StringLoops.doubleChar("The"));
        assertEquals("AAAAbbbb", StringLoops.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", StringLoops.doubleChar("Hi-There"));
        assertEquals("WWoorrdd!!", StringLoops.doubleChar("Word!"));
        assertEquals("!!!!", StringLoops.doubleChar("!!"));
        assertEquals("", StringLoops.doubleChar(""));
        assertEquals("aa", StringLoops.doubleChar("a"));
        assertEquals("..", StringLoops.doubleChar("."));
        assertEquals("aaaa", StringLoops.doubleChar("aa"));
    }

    @Test
    void countCode() {
        assertEquals(1, StringLoops.countCode("aaacodebbb"));
        assertEquals(2, StringLoops.countCode("codexxcode"));
        assertEquals(2, StringLoops.countCode("cozexxcope"));
        assertEquals(1, StringLoops.countCode("cozfxxcope"));
        assertEquals(1, StringLoops.countCode("xxcozeyycop"));
        assertEquals(0, StringLoops.countCode("cozcop"));
        assertEquals(0, StringLoops.countCode("abcxyz"));
        assertEquals(1, StringLoops.countCode("code"));
        assertEquals(0, StringLoops.countCode("ode"));
        assertEquals(0, StringLoops.countCode("c"));
        assertEquals(0, StringLoops.countCode(""));
        assertEquals(3, StringLoops.countCode("AAcodeBBcoleCCccoreDD"));
        assertEquals(2, StringLoops.countCode("AAcodeBBcoleCCccorfDD"));
        assertEquals(3, StringLoops.countCode("coAcodeBcoleccoreDD"));
    }

    @Test
    void bobThere() {
        assertEquals(true, StringLoops.bobThere("abcbob"));
        assertEquals(true, StringLoops.bobThere("b9b"));
        assertEquals(false, StringLoops.bobThere("bac"));
        assertEquals(true, StringLoops.bobThere("bbb"));
        assertEquals(false, StringLoops.bobThere("abcdefb"));
        assertEquals(true, StringLoops.bobThere("123abcbcdbabxyz"));
        assertEquals(false, StringLoops.bobThere("b12"));
        assertEquals(true, StringLoops.bobThere("b1b"));
        assertEquals(true, StringLoops.bobThere("b12b1b"));
        assertEquals(false, StringLoops.bobThere("bbc"));
        assertEquals(true, StringLoops.bobThere("bbb"));
        assertEquals(false, StringLoops.bobThere("bb"));
        assertEquals(false, StringLoops.bobThere("b"));
    }

    @Test
    void prefixAgain() {
        assertEquals(true, StringLoops.prefixAgain("abXYabc", 1));
        assertEquals(true, StringLoops.prefixAgain("abXYabc", 2));
        assertEquals(false, StringLoops.prefixAgain("abXYabc", 3));
        assertEquals(true, StringLoops.prefixAgain("xyzxyxyxy", 2));
        assertEquals(false, StringLoops.prefixAgain("xyzxyxyxy", 3));
        assertEquals(true, StringLoops.prefixAgain("Hi12345Hi6789Hi10", 1));
        assertEquals(true, StringLoops.prefixAgain("Hi12345Hi6789Hi10", 2));
        assertEquals(true, StringLoops.prefixAgain("Hi12345Hi6789Hi10", 3));
        assertEquals(false, StringLoops.prefixAgain("Hi12345Hi6789Hi10", 4));
        assertEquals(false, StringLoops.prefixAgain("a", 1));
        assertEquals(true, StringLoops.prefixAgain("aa", 1));
        assertEquals(false, StringLoops.prefixAgain("ab", 1));
    }

    @Test
    void sameStarChar() {
        assertEquals(true, StringLoops.sameStarChar("xy*yzz"));
        assertEquals(false, StringLoops.sameStarChar("xy*zzz"));
        assertEquals(true, StringLoops.sameStarChar("*xa*az"));
        assertEquals(false, StringLoops.sameStarChar("*xa*bz"));
        assertEquals(true, StringLoops.sameStarChar("*xa*a*"));
        assertEquals(true, StringLoops.sameStarChar(""));
        assertEquals(true, StringLoops.sameStarChar("*xa*a*a"));
        assertEquals(false, StringLoops.sameStarChar("*xa*a*b"));
        assertEquals(true, StringLoops.sameStarChar("*12*2*2"));
        assertEquals(false, StringLoops.sameStarChar("12*2*3*"));
        assertEquals(true, StringLoops.sameStarChar("abcDEF"));
        assertEquals(false, StringLoops.sameStarChar("XY*YYYY*Z*"));
        assertEquals(true, StringLoops.sameStarChar("XY*YYYY*Y*"));
        assertEquals(false, StringLoops.sameStarChar("12*2*3*"));
        assertEquals(true, StringLoops.sameStarChar("*"));
        assertEquals(true, StringLoops.sameStarChar("**"));
    }

    @Test
    void starOut() {
        assertEquals("ad", StringLoops.starOut("ab*cd"));
        assertEquals("ad", StringLoops.starOut("ab**cd"));
        assertEquals("silly", StringLoops.starOut("sm*eilly"));
        assertEquals("siy", StringLoops.starOut("sm*eil*ly"));
        assertEquals("siy", StringLoops.starOut("sm**eil*ly"));
        assertEquals("siy", StringLoops.starOut("sm***eil*ly"));
        assertEquals("string", StringLoops.starOut("stringy*"));
        assertEquals("tringy", StringLoops.starOut("*stringy"));
        assertEquals("ty", StringLoops.starOut("*str*in*gy"));
        assertEquals("abc", StringLoops.starOut("abc"));
        assertEquals("c", StringLoops.starOut("a*bc"));
        assertEquals("ab", StringLoops.starOut("ab"));
        assertEquals("", StringLoops.starOut("a*b"));
        assertEquals("a", StringLoops.starOut("a"));
        assertEquals("", StringLoops.starOut("a*"));
        assertEquals("", StringLoops.starOut("*a"));
        assertEquals("", StringLoops.starOut("*"));
        assertEquals("", StringLoops.starOut(""));
    }

    @Test
    void countHi() {
        assertEquals(1, StringLoops.countHi("xxhixx"));
        assertEquals(2, StringLoops.countHi("xhixhix"));
        assertEquals(1, StringLoops.countHi("hi"));
        assertEquals(2, StringLoops.countHi("hihih"));
        assertEquals(0, StringLoops.countHi("h"));
        assertEquals(0, StringLoops.countHi(""));
        assertEquals(4, StringLoops.countHi("ihihihihih"));
        assertEquals(5, StringLoops.countHi("ihihihihihi"));
        assertEquals(3, StringLoops.countHi("hiAAhi12hi"));
        assertEquals(3, StringLoops.countHi("xhixhxihihhhih"));
        assertEquals(1, StringLoops.countHi("ship"));
    }

    @Test
    void endOther() {
        assertEquals(true, StringLoops.endOther("Hiabc", "abc"));
        assertEquals(true, StringLoops.endOther("AbC", "HiaBc"));
        assertEquals(true, StringLoops.endOther("abc", "abXabc"));
        assertEquals(false, StringLoops.endOther("Hiabc", "abcd"));
        assertEquals(true, StringLoops.endOther("Hiabc", "bc"));
        assertEquals(false, StringLoops.endOther("Hiabcx", "bc"));
        assertEquals(true, StringLoops.endOther("abc", "abc"));
        assertEquals(true, StringLoops.endOther("xyz", "12xyz"));
        assertEquals(false, StringLoops.endOther("yz", "12xz"));
        assertEquals(true, StringLoops.endOther("Z", "12xz"));
        assertEquals(true, StringLoops.endOther("12", "12"));
        assertEquals(false, StringLoops.endOther("abcXYZ", "abcDEF"));
        assertEquals(false, StringLoops.endOther("ab", "ab12"));
        assertEquals(true, StringLoops.endOther("ab", "12ab"));
    }

    @Test
    void xyBalance() {
        assertEquals(true, StringLoops.xyBalance("aaxbby"));
        assertEquals(false, StringLoops.xyBalance("aaxbb"));
        assertEquals(false, StringLoops.xyBalance("yaaxbb"));
        assertEquals(true, StringLoops.xyBalance("yaaxbby"));
        assertEquals(true, StringLoops.xyBalance("xaxxbby"));
        assertEquals(false, StringLoops.xyBalance("xaxxbbyx"));
        assertEquals(true, StringLoops.xyBalance("xxbxy"));
        assertEquals(false, StringLoops.xyBalance("xxbx"));
        assertEquals(true, StringLoops.xyBalance("bbb"));
        assertEquals(false, StringLoops.xyBalance("bxbb"));
        assertEquals(true, StringLoops.xyBalance("bxyb"));
        assertEquals(true, StringLoops.xyBalance("xy"));
        assertEquals(true, StringLoops.xyBalance("y"));
        assertEquals(false, StringLoops.xyBalance("x"));
        assertEquals(true, StringLoops.xyBalance(""));
        assertEquals(false, StringLoops.xyBalance("yxyxyxyx"));
        assertEquals(true, StringLoops.xyBalance("yxyxyxyxy"));
        assertEquals(true, StringLoops.xyBalance("12xabxxydxyxyzz"));
    }

    @Test
    void plusOut() {
        assertEquals("++xy++", StringLoops.plusOut("12xy34", "xy"));
        assertEquals("1+++++", StringLoops.plusOut("12xy34", "1"));
        assertEquals("++xy++xy+++xy", StringLoops.plusOut("12xy34xyabcxy", "xy"));
        assertEquals("ab++ab++++", StringLoops.plusOut("abXYabcXYZ", "ab"));
        assertEquals("++++abc+++", StringLoops.plusOut("abXYabcXYZ", "abc"));
        assertEquals("++XY+++XY+", StringLoops.plusOut("abXYabcXYZ", "XY"));
        assertEquals("+++++++XYZ", StringLoops.plusOut("abXYxyzXYZ", "XYZ"));
        assertEquals("++++++", StringLoops.plusOut("--++ab", "++"));
        assertEquals("++xxxx++", StringLoops.plusOut("aaxxxxbb", "xx"));
        assertEquals("++3++3", StringLoops.plusOut("123123", "3"));
    }

    @Test
    void catDog() {
        assertEquals(true, StringLoops.catDog("catdog"));
        assertEquals(false, StringLoops.catDog("catcat"));
        assertEquals(true, StringLoops.catDog("1cat1cadodog"));
        assertEquals(false, StringLoops.catDog("catxxdogxxxdog"));
        assertEquals(true, StringLoops.catDog("catxdogxdogxcat"));
        assertEquals(false, StringLoops.catDog("catxdogxdogxca"));
        assertEquals(false, StringLoops.catDog("dogdogcat"));
        assertEquals(true, StringLoops.catDog("dogogcat"));
        assertEquals(false, StringLoops.catDog("dog"));
        assertEquals(false, StringLoops.catDog("cat"));
        assertEquals(true, StringLoops.catDog("ca"));
        assertEquals(true, StringLoops.catDog("c"));
        assertEquals(true, StringLoops.catDog(""));
    }

    @Test
    void mixString() {
        assertEquals("axbycz", StringLoops.mixString("abc", "xyz"));
        assertEquals("HTihere", StringLoops.mixString("Hi", "There"));
        assertEquals("xTxhxexre", StringLoops.mixString("xxxx", "There"));
        assertEquals("xXxx", StringLoops.mixString("xxx", "X"));
        assertEquals("22/7 around", StringLoops.mixString("2/", "27 around"));
        assertEquals("Hello", StringLoops.mixString("", "Hello"));
        assertEquals("Abc", StringLoops.mixString("Abc", ""));
        assertEquals("", StringLoops.mixString("", ""));
        assertEquals("ab", StringLoops.mixString("a", "b"));
        assertEquals("abx", StringLoops.mixString("ax", "b"));
        assertEquals("abx", StringLoops.mixString("a", "bx"));
        assertEquals("SLoong", StringLoops.mixString("So", "Long"));
        assertEquals("LSoong", StringLoops.mixString("Long", "So"));
    }

    @Test
    void repeatSeparator() {
        assertEquals("WordXWordXWord", StringLoops.repeatSeparator("Word", "X", 3));
        assertEquals("ThisAndThis", StringLoops.repeatSeparator("This", "And", 2));
        assertEquals("This", StringLoops.repeatSeparator("This", "And", 1));
        assertEquals("Hi-n-Hi", StringLoops.repeatSeparator("Hi", "-n-", 2));
        assertEquals("AAA", StringLoops.repeatSeparator("AAA", "", 1));
        assertEquals("", StringLoops.repeatSeparator("AAA", "", 0));
        assertEquals("ABABABABA", StringLoops.repeatSeparator("A", "B", 5));
        assertEquals("abcXXabcXXabc", StringLoops.repeatSeparator("abc", "XX", 3));
        assertEquals("abcXXabc", StringLoops.repeatSeparator("abc", "XX", 2));
        assertEquals("abc", StringLoops.repeatSeparator("abc", "XX", 1));
        assertEquals("XYZaXYZ", StringLoops.repeatSeparator("XYZ", "a", 2));
    }
}