package day09_switch_stringManipulation;

import java.util.Locale;

public class C03_toUppercase {

    public static void main(String[] args) {

        String str = "java Candir";

        // str i buyuk harf olarak yazdirin

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candir

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        System.out.println(str.toLowerCase()); // java candir

        //str' i turkce karakter goz onunda bulundurarak kucuk harfe cevirin

        str= str.toLowerCase(Locale.forLanguageTag("TR"));

        System.out.println(str); // java candir





    }
}
