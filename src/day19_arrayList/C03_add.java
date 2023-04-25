package day19_arrayList;

import java.util.*;

public class C03_add {

    public static void main(String[] args) {


        /*
        List data turu primitive kabul etmez
         */

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar); // [3, 5, 2]

        // 3 ile 5 arasina element olarak 7 ekleyin

        sayilar.add(1,7);

        System.out.println(sayilar); // [3, 7, 5, 2]

        List<Integer> ekler = new ArrayList<>();

        ekler.add(2);
        ekler.add(5);

        System.out.println(ekler); // [2, 5]

        sayilar.addAll(ekler);

        System.out.println(sayilar);// [3, 7, 5, 2, 2, 5]


        // 7 ile 5 arasina ekleri eklerin

        sayilar.addAll(2,ekler);

        System.out.println(sayilar); //[3, 7, 2, 5, 5, 2, 2, 5]



    }
}
