package day42_collections;

import java.util.AbstractSet;
import java.util.Set;
import java.util.TreeSet;

public class C03_Set {

    // hizliset istiyorsak hashset kullanirirz
    // Set unique bakiyor
    // Set index yapisini desteklemez
    public static void main(String[] args) {

        Set<String> ogrenciler = new TreeSet<>();
        ogrenciler.add("Emre");
        ogrenciler.add("Kerem");
        ogrenciler.add("Duygu");
        ogrenciler.add("Burcu");

        System.out.println(ogrenciler); // [Burcu,Duygu,Emre,Kerem]

        ogrenciler.add("Ahmet");
        System.out.println(ogrenciler); //[Ahmet,Burcu,Duygu,Emre,Kerem]
        ogrenciler.add("Kerem");
        System.out.println(ogrenciler); //[Ahmet,Burcu,Duygu,Emre,Kerem]  // eski Kerem'i sildi yeni Kemal'i getirdi

        }
    }

