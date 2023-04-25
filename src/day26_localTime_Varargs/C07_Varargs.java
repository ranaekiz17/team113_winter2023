package day26_localTime_Varargs;

import org.w3c.dom.ls.LSOutput;

public class C07_Varargs {

    public static void main(String[] args) {

        // verilen iki sayiyi toplayip yazdiran bir metod olusturun

        topla(3, 9);  // 12
        topla(7, 3, 1); // 11


    }

    public static void topla(int a, int b) {

        System.out.println(a + b);
    }

    public static void topla(int a, int b, int c) {

        System.out.println(a + b + c);
    }

}