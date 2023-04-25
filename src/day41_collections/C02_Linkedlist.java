package day41_collections;

import java.util.LinkedList;
import java.util.List;

public class C02_Linkedlist {

    public static void main(String[] args) {

        /*
        List data turunde bir LinkedList olusturalim
         */

        List<String > harfler = new LinkedList<>();
        harfler.add("K");
        harfler.add("H");
        harfler.add("L");
        harfler.add("M");

        System.out.println(harfler); //[K, H, L, M]

        harfler.add("B");

        System.out.println(harfler); // [K, H, L, M, B]

        harfler.add(3,"T");

        System.out.println(harfler); //[K, H, L, T, M, B]

        harfler.set(3,"R");
        System.out.println(harfler); //[K, H, L, R, M, B]

        List<String> semboller  = new LinkedList<>();
        semboller.add("*");
        semboller.add("B");
        semboller.add("%");
        semboller.add("&");

        System.out.println(semboller); //[*, B, %, &]

        System.out.println(harfler.retainAll(semboller)); // true
        System.out.println(semboller);// [*, B, %, &]
        System.out.println(harfler); // [B]
        harfler.addAll(semboller);
        System.out.println(harfler); //[B, *, B, %, &]
        System.out.println(harfler.removeAll(semboller)); // true
        System.out.println(harfler); // []

    }
}
