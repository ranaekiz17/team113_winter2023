package day02_dataTurleri_Scanner;

public class C02_dATAtURLERİ {

    public static void main(String[] args) {

        char ilkHarf = '8';  // tek tirnak icinde tek karakter (harf,sayi,ozel karakter ...)



        byte OgrenciYasi1 = 15;  // en dogru karar ,hafiza kullanımını optimize etmek icin yeterlidir.
        short OgrenciYasi2 = 16;
        int ogrYasi3 = 14;


        double sayi1= 2.474729752457204;
        // virgulden sonra 16 basamak alir, ama cok kucuk sayilara  indigi icin ondalik
        // kısmın sonunda hatalar olabilir.
        // 15 / 3 = 4.999999999999
        System.out.println(sayi1); // 2.474729752457204

        float sayi2 = 45.4542545453453543F;
        // float sayi tanımladıgınızda double dan farkli oldugunu belirtmek icin sonunda
        // f veya F yazmak zorundayiz.

        System.out.println(sayi2); // 45.4542545

        // biz dersler boyunca tam sayilar icin int, ondalıklı sayilar icin double kullacagiz.



    }
}
