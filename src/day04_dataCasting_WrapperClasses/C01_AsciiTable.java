package day04_dataCasting_WrapperClasses;

public class C01_AsciiTable {

    public static void main(String[] args) {

        /*

        24 ==> 11000
        a ==> 97 ==> 1010000010

        ahmet


         */

       // char data turundeki variable ve degerler sayisal data turlerine atanırsa veya
        // sayisal data turundeki datalarla ieleme sokulursa
        // ASCII table'daki degerleri ile isleme girer

        System.out.println(5+ 'a'); // 5+ 97 = 102

        char ilkHarf= 101;

        System.out.println(ilkHarf); // e

        // kullaninin verdigi harften bir sonraki harfi yazdirin.

        char girilenChar= 'f';

        System.out.println(girilenChar+1); // 103

        // biz 103'u degil, 103'un karsiligi olan char ifadeyi yazdirmak istersek explicit casting yapmamiz lazim

        System.out.println("Girilen harfin bir sonrası:"+ (char) (girilenChar+1) );

        // verilen bir harften 2 onceki harfi yazdirin

        girilenChar ='M';


        System.out.println(girilenChar- 2 );// 77-2 = 75

        System.out.println((char) (girilenChar-2)); // K







    }
}
