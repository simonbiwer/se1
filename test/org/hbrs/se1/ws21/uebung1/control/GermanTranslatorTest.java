package org.hbrs.se1.ws21.uebung1.control;

import org.hbrs.se1.ws21.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws21.uebung1.control.Translator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GermanTranslatorTest {
    Translator gerTr;
    @BeforeEach
    void setUp(){
        gerTr = new GermanTranslator();
    }
    @Test
    void testCase1(){
        assertEquals("Übersetzung der Zahl " + "11" +  " nicht möglich" + " (" + Translator.version + ")", gerTr.translateNumber(11));
    }
    @Test
    void testCase2(){
        assertEquals("drei", gerTr.translateNumber(3));
    }
    @Test
    void testCase3(){
        assertEquals("zehn", gerTr.translateNumber(10));
    }
    @Test
    void testCase4(){
        assertEquals("Übersetzung der Zahl " + "0" +  " nicht möglich" + " (" + Translator.version + ")", gerTr.translateNumber(0));
    }
    @Test
    void testCase5(){
        assertEquals("Übersetzung der Zahl " + "-3" +  " nicht möglich" + " (" + Translator.version + ")", gerTr.translateNumber(-3));
    }
}
