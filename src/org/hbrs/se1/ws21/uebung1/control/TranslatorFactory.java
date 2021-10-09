package org.hbrs.se1.ws21.uebung1.control;

public class TranslatorFactory {
    public static Translator createGermanTranslator(){      //strenge Implementierung gegen das Interface
        return new GermanTranslator();
    }
}
