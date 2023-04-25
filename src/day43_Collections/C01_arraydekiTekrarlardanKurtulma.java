package day43_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_arraydekiTekrarlardanKurtulma {
    public static void main(String[] args) {

         /*
         Soru: verilen bir array'deki tekrar eden elementleri sadece bir
         kere yazdiracak array'i kısaltan bir kod yaziniz
         Hint:SET kullaniniz.
        */

        int[] arr = {1, 2, 1, 3, 4, 5, 1, 2, 6, 2, 3, 4, 5, 1, 3, 2, 6, 5, 7};

        Set<Integer> benzersizSet = new HashSet<>();

        // Array'deki tüm elementleri olusturdugumuz set'e ekleyelim
        for (int each:arr
             ) {
            benzersizSet.add(each);

        }
        System.out.println(benzersizSet); //[1, 2, 3, 4, 5, 6, 7]
        System.out.println(Arrays.toString(arr)); // [1, 2, 1, 3, 4, 5, 1, 2, 6, 2, 3, 4, 5, 1, 3, 2, 6, 5, 7]
        arr = new int[benzersizSet.size()]; //[0,0,0,0,0,0,0]

        int index = 0;
        for (int each :benzersizSet
             ) {
            arr[index] = each;
            index++;
        }
        System.out.println("array'in son hali:"  + Arrays.toString(arr)); //array'in son hali:[1, 2, 3, 4, 5, 6, 7]

    }
}