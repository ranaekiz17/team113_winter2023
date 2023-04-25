package day26_localTime_Varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

    public static void main(String[] args) {

        /* Java tarih ve zamani kendi formatinda olusturur ancak


        Format olustururken
        GUN
        d : basta 0 varsa onu yazmadan gun numarasi
        dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
        DDD : yilin kacinci gunu oldugunu yazar
        E, EE, EEE : gun isminin ilk 3 harfi
        EEEE : gun isminin tamamini
        AY (Ay icin M, dakika icin m kullanilir)
        M : basta 0 varsa onu yazmadan ay numarasi
        MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
        MMM : Ay isminin ilk 3 harfi
        MMMM : Ay isminin tamami
        YY : yilin son iki rakamini
        YYYY : Yilin tamamini
        Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)
        HH : saatin tamami, tek rakamli saat olursa 02 gibi
        H  : tek rakamli saat olursa sadece saati
        a yazarsak AM veya PM degerini yazar

         */

        LocalDateTime ltd = LocalDateTime.now();
        System.out.println(ltd);  // 2023-03-09T20:04:22.232685100

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d / MMM / yyyy");

        System.out.println(ltd.format(dtf));  // 9 / Mar / 2023

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd.MM.yy");

        System.out.println(ltd.format(dtf2));  // 09.03.23

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH : mm");  //

        System.out.println(ltd.format(dtf3)); // 20 : 14

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("EEEE hh : mm a");

        System.out.println(ltd.format(dtf4));  // Perşembe 08 : 17 ÖS






    }


}
