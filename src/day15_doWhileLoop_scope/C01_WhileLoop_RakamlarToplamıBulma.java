package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C01_WhileLoop_RakamlarToplamıBulma {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Rakamlari toplanacak pozitif tam sayi giriniz");

        int girilenSayi = scan.nextInt();

        int sayi = girilenSayi;
        int birlerBasamagi= 0;
        int rakamlarToplami= 0;

        while (sayi>0){

            birlerBasamagi= sayi%10;
            rakamlarToplami+= birlerBasamagi;
            sayi /= 10;

        }

        System.out.println("Girilen "+ girilenSayi+"nin  rakamlar toplami"+ rakamlarToplami);


    }
}
