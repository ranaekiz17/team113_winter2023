package day14_MethodOverloading_whiLELoop;

public class C03_Overloading {

    public static void main(String[] args) {

        /*
            Bir class'da ayni isme sahip
            farkli islem yapan method'lar olabilir
            Java bu method'lardan hangisinin calisacagina
            parametrelere gore karar verir
            Bir class'da ismi ayni, parametreleri farkli method'lar olmasina
            Method OVERLOADING denir.
         */



        String str = "Bu is olacak";
        System.out.println(str.replace("Bu is", "Java guzel")); // Java guzel olacak
        System.out.println(str.replace('u', 'e')); // Be is olacak


        String str2 = "Bu is guzel olacak";

        System.out.println(str.replace("",""));
        System.out.println(str.replace("",""));

        // tamam anladım tesekkür ederim :) rica ederim kolay gelsin

    }
}
