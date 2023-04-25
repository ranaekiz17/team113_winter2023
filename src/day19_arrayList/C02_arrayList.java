package day19_arrayList;

import day17_arrays.C06_ArrayElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_arrayList {

    public static void main(String[] args) {

       /*

       ArrayList, uzunlugu esnek bir listedir
       Array altyapisini kullanir ancak ekleme ve silme gibi islemlerde daha avantajlıdır

       ArrayList'in tek dejavantaji var
       O da elementleri tek tek eklememiz gerekmesi
        */

        int [] arr = {3,4};

        arr = C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr,5);

        System.out.println(Arrays.toString(arr)); // [3, 4, 5]

        arr = C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr,15);

        System.out.println(Arrays.toString(arr)); // [3, 4, 5, 15]



        ArrayList<String> harfler= new ArrayList<>();  // bos bir list olustur

        System.out.println(harfler); // []

        harfler.add("s");
        harfler.add("l");
        harfler.add("a");

        System.out.println(harfler); // [s, l, a]


    }
}
