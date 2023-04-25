package day22_constructors;

import day21_arrayList_forEachLoop.C04_KareleriToplami;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_constructors {

    public static void main(String[] args) {


        /*

          Bir obje ancak bir  class'tan olusturulabilir.
          Bir objeyi olusturdugumuz class ayni zamanda o objenin data turudur.

          Her obje olusturuldugu class'in ozelliklerini tasir.

          Eger bir proramda ortak ozelliklere sahip objeler uretmek uzere tasarladıgınız bir class varsa main Method
          olması SART DEGILDIR.
          Bu class lar kalıphane gibi calisir.
          Yani o class'dan ayni ozelliklere sahip objeler uretmemizi saglar
         */

        Scanner scanner = new Scanner(System.in);       // data turu Scanner

        List <String> isimler = new ArrayList<>();

        C04_KareleriToplami Obje = new C04_KareleriToplami();

        Random rnd = new Random();

        // bunlarin ortak  ozelligi

        String str = new String("Ali");


        C02_Hemsire hemsire1 = new C02_Hemsire();
        System.out.println(hemsire1.mesaiUcretiHesapla(5));

        String str2;
        Random rnd2;
        List<String> isimler2;




    }
}
