package day08_nestedifElse.dayo6_bagimsizIfCumleleri;

import java.util.Scanner;

public class C08_iFElseStatements {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir karekter isteyin,
        //        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //        yoksa girilen karekteri yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char krk = scan.next().charAt(0);

        if ('a' <= krk && krk <= 'z'){

            System.out.println(Character.toUpperCase(krk));
        }
        else {
            System.out.println(krk);  // A , N

        }



    }
}
