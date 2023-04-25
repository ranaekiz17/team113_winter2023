package day16_scope_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String[] isimler = {"Nurefsan", "Berke", "Mustafa"};
        int[] sayilar = {3, 4, 5, 6, 5, 6, 3, 2, 4};
        char karakterler[]={'e','4'};


        // Array non-primitive data turlerindendir
        // Eger array'i liste seklinde olusturmayip
        // new keyword kullaniyorsak
        // UZUNLUGUNU yazmak zorundayiz


        String [] arr = new String[5];

        // Bir array tanimlanan uzaunluktan daha fazla veya daha az eleman alamaz

        // bir array ı yazdirmak istersek
        System.out.println(isimler); //[Ljava.lang.String;@58ceff1

        System.out.println(Arrays.toString(sayilar)); //  [3, 4, 5, 6, 5, 6, 3, 2, 4]

        System.out.println(Arrays.toString(arr)); // [null, null, null, null, null]

        int[] a = new int [7];
        System.out.println(Arrays.toString(a)); //   [0, 0, 0, 0, 0, 0, 0]

        // array daki elementlere nasil ulasiriz? index ile

        a[0] =  4 ;
        a[3] = 7 ;
       // a[7] = 8; ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(a)); //


        // sayilar array'inin 4.index'indeki elementiyazdirin

        System.out.println(sayilar[4]); // 5

        // isimler array'inin 1.index'indeki ismi yazdirin

        System.out.println(isimler[1]); // Berke


    }
}