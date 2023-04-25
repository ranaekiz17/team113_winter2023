package day26_localTime_Varargs;

import java.time.LocalTime;

public class C01_LocalTime {

    public static void main(String[] args) {

        LocalTime saat1 = LocalTime.of(20,15);
        System.out.println(saat1); // 20:15

        LocalTime saat2 = LocalTime.now();
        System.out.println(saat2);//18:53:36.396747300


        /*
        LocalTime objesi olan saat variable'i canli bir saat degildir
        olusturuldugu andaki localtime'i sistemden alip kaydettigiimiz
        sabit bir degerdir
        kodun  ilerleyen kisminda ne kadar sure
         */

        System.out.println(saat2.getHour()); // 18

        // get metodleri  localTime objesinin saat, dakika,saniye ve nana degerlerini bize  getirir

        System.out.println(saat2.plusHours(2));  //21:00:06.783141600
        saat2.minusMinutes(10).minusSeconds(10);
        saat2.withSecond(10).withNano(20);
      //System.out.println(saat1.compareTo(saat2);
        System.out.println(saat2.isAfter(saat1));  //
        System.out.println(saat2.isBefore(saat1)); //
    }
}