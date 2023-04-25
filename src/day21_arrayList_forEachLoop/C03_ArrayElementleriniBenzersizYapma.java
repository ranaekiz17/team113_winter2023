package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayElementleriniBenzersizYapma {

    public static void main(String[] args) {

       // Soru 1- Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip, tum elemanlardan sadece 1 tane yapip
        // eski array’e yeni halini atayip yazdirin.

        int [] arr = {3,5,7,3,5,8,9,2,3,5,7,};

        List<Integer> benzersizelementlistesi= new ArrayList<>();

        // array deki her bir elementi kontrol edelim
        // Liste yoksa ekleyelim, varsa eklemeyelim

        for (int each: arr

             ) {
            if ( !benzersizelementlistesi.contains(each));
            benzersizelementlistesi.add(each);


        }
        System.out.println(benzersizelementlistesi); // [3, 5, 7, 3, 5, 8, 9, 2, 3, 5, 7]

        arr = new int[benzersizelementlistesi.size()];

        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = benzersizelementlistesi.get(i);
        }
        System.out.println(Arrays.toString(arr));// [3, 5, 7, 3, 5, 8, 9, 2, 3, 5, 7]


    }
}
