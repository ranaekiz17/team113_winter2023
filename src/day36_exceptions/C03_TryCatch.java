package day36_exceptions;

public class C03_TryCatch {

    public static void main(String[] args) {

        int sayi1=  20;
        int sayi2= 5;

       System.out.println(sayi1/sayi2);

       try {

           System.out.println(sayi1/sayi1);
           System.out.println("deneme 1");
           System.out.println("deneme 2");
           System.out.println("deneme 3");

       } catch (ArithmeticException e) {

           System.out.println("Bolen sifir  olmamali");

       }

       /*
            Bir try blogunda exception olusursa
            o satirdan catch satirina kadar aradaki tum kodlar IGNORE edilir

            eger try blogunda exception olusmazsa
            catch devreye girmez
            (if - else gibi)

        */


    }
}
