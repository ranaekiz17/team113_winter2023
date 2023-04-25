package day38_exceptions_garbageCollector;

import java.util.ArrayList;
import java.util.List;

public class C04_Iterator {

    public static void main(String[] args) {

        /*
        Java da Collections konusunda ogrenecegimiz set gibi bazı yapilar index desteklemez

        Bu durumda index olmadıgından eşlementleri yazdirmak istersek for-each loop kullanabiliriz
        AMA  elementler arasinda dolasmak,belirli sartlari saglayanlari
        uptdade etmek isterseniz for-each loop ile yapamazsiniz

        Hatta List' de istenmeyen elementleri silmek istedigimizde
        her sildigimiz element uzunlugu degistridigi icin
        kodlar saglıklı calısmaz

        Bu sorunları cozmek icin Java interfaceini olusturur
         */


        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(14);
        sayilar.add(4);
        sayilar.add(72);

        // cift olan sayilari silin

        for (int i = 0; i <sayilar.size() ; i++) {
            if(sayilar.get(i)%2 == 0){
                sayilar.remove(i);
            }
        }

        System.out.println(sayilar);
    }
}
