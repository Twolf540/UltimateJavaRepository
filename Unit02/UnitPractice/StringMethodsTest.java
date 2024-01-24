package Unit02.UnitPractice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringMethodsTest {

    @Test
    void helloName() {
        assertEquals("Hello Bob!", StringMethods.helloName("Bob"));
        assertEquals("Hello Alice!", StringMethods.helloName("Alice"));
        assertEquals("Hello X!", StringMethods.helloName("X"));
        assertEquals("Hello Dolly!", StringMethods.helloName("Dolly"));
        assertEquals("Hello Alpha!", StringMethods.helloName("Alpha"));
        assertEquals("Hello Omega!", StringMethods.helloName("Omega"));
        assertEquals("Hello Goodbye!", StringMethods.helloName("Goodbye"));
        assertEquals("Hello ho ho ho!", StringMethods.helloName("ho ho ho"));
        assertEquals("Hello xyz!!", StringMethods.helloName("xyz!"));
        assertEquals("Hello Hello!", StringMethods.helloName("Hello"));
    }

    @Test
    void firstHalf() {
        assertEquals("Woo", StringMethods.firstHalf("WooHoo"));
        assertEquals("Hello", StringMethods.firstHalf("HelloThere"));
        assertEquals("abc", StringMethods.firstHalf("abcdef"));
        assertEquals("a", StringMethods.firstHalf("ab"));
        assertEquals("", StringMethods.firstHalf(""));
        assertEquals("01234", StringMethods.firstHalf("0123456789"));
        assertEquals("kit", StringMethods.firstHalf("kitten"));
    }

    @Test
    void endsLy() {
        assertTrue(StringMethods.endsLy("oddly"));
        assertFalse(StringMethods.endsLy("oddy"));
        assertFalse(StringMethods.endsLy("oddl"));
        assertTrue(StringMethods.endsLy("ly"));
        assertFalse(StringMethods.endsLy("falsey"));
        assertTrue(StringMethods.endsLy("evenly"));

    }

    @Test
    void makeAbba() {
        assertEquals("HiByeByeHi", StringMethods.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", StringMethods.makeAbba("Yo", "Alice"));
        assertEquals("WhatUpUpWhat", StringMethods.makeAbba("What", "Up"));
        assertEquals("aaabbbbbbaaa", StringMethods.makeAbba("aaa", "bbb"));
        assertEquals("xyyx", StringMethods.makeAbba("x", "y"));
        assertEquals("xx", StringMethods.makeAbba("x", ""));
        assertEquals("yy", StringMethods.makeAbba("", "y"));
        assertEquals("BoYaYaBo", StringMethods.makeAbba("Bo", "Ya"));
        assertEquals("YaYaYaYa", StringMethods.makeAbba("Ya", "Ya"));
    }

    @Test
    void withoutEnd() {
        assertEquals("ell", StringMethods.withoutEnd("Hello"));
        assertEquals("av", StringMethods.withoutEnd("java"));
        assertEquals("odin", StringMethods.withoutEnd("coding"));
        assertEquals("od", StringMethods.withoutEnd("code"));
        assertEquals("", StringMethods.withoutEnd("ab"));
        assertEquals("hocolate", StringMethods.withoutEnd("Chocolate!"));
        assertEquals("itte", StringMethods.withoutEnd("kitten"));
        assertEquals("ooho", StringMethods.withoutEnd("woohoo"));
    }

    @Test
    void nTwice() {
        assertEquals("Helo", StringMethods.nTwice("Hello", 2));
        assertEquals("Choate", StringMethods.nTwice("Chocolate", 3));
        assertEquals("Ce", StringMethods.nTwice("Chocolate", 1));
        assertEquals("", StringMethods.nTwice("Chocolate", 0));
        assertEquals("Hellello", StringMethods.nTwice("Hello", 4));
        assertEquals("CodeCode", StringMethods.nTwice("Code", 4));
        assertEquals("Code", StringMethods.nTwice("Code", 2));
    }

    @Test
    void makeTags() {
        assertEquals("<i>Yay</i>", StringMethods.makeTags("i", "Yay"));
        assertEquals("<i>Hello</i>", StringMethods.makeTags("i", "Hello"));
        assertEquals("<cite>Yay</cite>", StringMethods.makeTags("cite", "Yay"));
        assertEquals("<address>here</address>", StringMethods.makeTags("address", "here"));
        assertEquals("<body>Heart</body>", StringMethods.makeTags("body", "Heart"));
        assertEquals("<i>i</i>", StringMethods.makeTags("i", "i"));
        assertEquals("<i></i>", StringMethods.makeTags("i", ""));
    }

    @Test
    void middleTwo() {
        assertEquals("ri", StringMethods.middleTwo("string"));
        assertEquals("od", StringMethods.middleTwo("code"));
        assertEquals("ct", StringMethods.middleTwo("Practice"));
        assertEquals("ab", StringMethods.middleTwo("ab"));
        assertEquals("45", StringMethods.middleTwo("0123456789"));

    }
}