package day43_Collections;

import java.util.*;

public class C02_mixset {

    public static void main(String[] args) {

        Set<Object> mixset = new HashSet<>();

        mixset.add(12);
        mixset.add("Java");
        mixset.add('S');
        mixset.add(true);

        int[] arr = new int [3];
        arr[2]= 34;
        arr[1]= 30;


        List<Object> mixlist = new ArrayList<>();
        mixlist.add("Hava");
        mixlist.add(24);

        mixset.add(mixlist);

        System.out.println(mixlist); //[Hava, 24]
        System.out.println(mixset);  //[Java, [Hava, 24], [I@7c30a502, S, 12, true]

        // Collections objeleri birarada tutan yapilardir.

        System.out.println(mixset.size()); //6
        System.out.println(mixset.contains(24)); // false
        System.out.println(mixset.contains(12)); // true
        System.out.println(Arrays.toString(arr)); // [0, 30, 34]

        //Data turu olarak object secilirse icine her data turunddn element konulabilir
        //Ancak elementlere ulasmamiz ya da update etmek gibi islemleri yapmamiz
        //mumkun olmayabilir ya da cok zor  olabilir
    }
}
