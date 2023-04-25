package day05_incrementDecrement_Concatenation;

public class C01_IncrementDecrement {

    public static void main(String[] args) {

        int a = 20 ;

        // a nin degerini 3 arttirin ve yeni degerini olusturacaginiz b variable'ina atayın

        // a= a+3
        a += 3;


        int b = a;

        System.out.println("a:"+a +",b:"+ b); // a: 23,  b: 23


        a= 20 ;

        //a'nın degerini b'ye atayın, sonra a'nın degerini 3 arttirin

        b= a;
        a += 3;

        System.out.println("a:"+a+",b :"+b ); // a:23, b:20

        System.out.println("==============");




    }
}
