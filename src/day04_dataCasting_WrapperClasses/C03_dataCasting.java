package day04_dataCasting_WrapperClasses;

public class C03_dataCasting {

    public static void main(String[] args) {

        int a = 20 ;
        int b = 6 ;

        System.out.println(a/b); // 3

        //

        double c = 6;

        System.out.println(a/c); // 20/6 = 3.33333333335

        // bolunen sayilarin data turleri farkli ise sonucu daha genis olanin cinsinden verir

        float d= 6f;

        System.out.println(a/d); //20 / 6 = 3.3333333

        // a/b isleminin sonucunu ondalikli olarak nasil yazdirabiliriz ?

        System.out.println((double) (a/b) ); // 3.0

        // islem onceligi
        // Java oncelikle once a/b islemini yapar ve sonucu 3 bulur
        // sonra (double) oldugundan 3 'u double' a cast eder 3.0 bulur

        // bolme islenminin sonucunun double olması icin
        // isleme girenlerin birisi double olmalidir.

        System.out.println((double) a/b); //3.3333333335

        System.out.println(a/(double)b);  //3.3333333335


        int e = 1467;

        System.out.println(e = e /10 );// 146

        System.out.println(e); // 146

        e = e/10;

        System.out.println(e); // 14

        e = e/10;
        System.out.println(e); // 1

        e = e/10;
        System.out.println(e); // 0


    }
}
