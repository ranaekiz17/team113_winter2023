package day03_dataCasting;

public class C05_dataCasting {

    public static void main(String[] args) {


        /* bazı primitive data turleri baaska hicbir data turundan deger kabul etmez
        bazı primitive data turleri ozel sartlar
         */

        boolean bl = false ;

        bl = true;

        char ch = 't';
        ch= '&';

        int sayi1= 20;

        short sayi2= 15;

        double sayi3 = 24;

        sayi1= sayi2;
        //sayi1 = sayi3 kabul etmez
        //sayi2= sayi1 kabul etmez

        sayi3= sayi1;
        sayi3= sayi2;

        sayi1= ch;
        //sayi2 = ch; kabul etmez



    }
}
