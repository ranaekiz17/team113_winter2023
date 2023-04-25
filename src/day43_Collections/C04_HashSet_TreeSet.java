package day43_Collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_HashSet_TreeSet {
    public static void main(String[] args) {

        /*
        bir hasheset olusturalim bir treeset olusturalim
        bir loop ile iclerine 150000 eleman ekleyelim
        islem surelerini kiyaslayalim
         */

        Random rbd = new Random();
        int sayi;
        Set<Integer> hashset = new HashSet<>();
        Set<Integer> treeset = new TreeSet<>();

        Long hashStart=System.currentTimeMillis();
        for (int i = 0; i < 150000; i++) {
            sayi=rbd.nextInt(1250000);
            hashset.add(sayi);

        }
        Long hashFinish=System.currentTimeMillis();
        Long treeStart=System.currentTimeMillis();
        for (int i = 0; i <150000 ; i++) {
            sayi=rbd.nextInt(1250000);
            treeset.add(sayi);

        }
        Long treeFinish=System.currentTimeMillis();

        System.out.println("hash islem suresi:" + (hashFinish-hashStart));
        System.out.println("tree islem suresi: " +(treeFinish-treeStart));

       // hash islem suresi:84
       // tree islem suresi:274

    }
}
