package day03_dataCasting;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        // Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini giriniz");

        // kullanicinin girdigi bilgiyi kaydedebilecek  data turunde bir variable olusturun
        // kullanıcıdan bilgi

        double yaricap = scan.nextDouble();

        // cevresini ve alanini yazdirin.

        System.out.println("Cemberin cevresi : " +  2*3.14 * yaricap);

        System.out.println("Dairenin  alani:" +3.14 * yaricap * yaricap );


    }
}
