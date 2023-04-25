package day03_dataCasting;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        // Soru-3  Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi girin");

        String isim= scan.nextLine();

        System.out.println("lutfen yasinizi giriniz");

        double yas= scan.nextDouble();

        System.out.println("isminiz :"+ isim);
        System.out.println();
        System.out.println("yasiniz:"+ yas);
        System.out.println("Kaydiniz basariyla tamamlanmıstir.");



    }
}
