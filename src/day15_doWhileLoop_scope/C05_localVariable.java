package day15_doWhileLoop_scope;

public class C05_localVariable {

    public static void main(String[] args) {

        /*
         1- Bir method icerisinde olusturulan variable in scopu o method dur
         baska bir method dan kullanilamaz
         bu variblelara Local variable denir

         2- Her ne kadar bir method icinde olsalar da loop ların da arı bir scoope'u vardır
         Loop icerisinde olusturulan variable'lar
         Loop disinda kullanılamazlar

         3- local variable lara deger atamadan olusturabiliriz
         ancak deger atamadan kullanamayiz
         */

        String isim = "Ali Can";
        int sayi;
        // System.out.println(sayi);

        for (int i = 0; i < 10; i++) {
            int j = i + 1;

            System.out.println(i);
            System.out.println(j);

        }


    }

        public static void baskaMethod() {

        // System.out.println(isim);
        int sayi = 5;
    }

}