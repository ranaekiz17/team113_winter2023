package day21_arrayList_forEachLoop;

import java.util.Arrays;

public class C05_istenenHarfAdediniBulma {

    public static void main(String[] args) {


        // Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        String cumle = "Yatin kalkin Java calisin";
        String istenenHarf = "x";

        String[] karakter = cumle.split("");


        System.out.println(Arrays.toString(karakter));

        //[Y, a, t, i, n,  , k, a, l, k, i, n,  , J, a, v, a,  , c, a, l, i, s, i, n]

        int sayac = 0;

        for (String each : karakter
        ) {
            if (each.equalsIgnoreCase(istenenHarf)) {
                sayac++;
            }
            }
            if (sayac == 0) {
                System.out.println("istenen harf yok");
            } else {
                System.out.println("istenen harf cümlede " + sayac + " kere kullanılmış.");

            }

        }
    }