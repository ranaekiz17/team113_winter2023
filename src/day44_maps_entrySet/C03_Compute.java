package day44_maps_entrySet;

import java.util.Map;
import java.util.TreeMap;

import static javax.print.attribute.standard.MediaSizeName.A;

public class C03_Compute {

    public static void main(String[] args) {

       // verilen bir String array’de her bir sayinin kacar defa kullanildigini yazdirin
        // Ornek : String[] arr = {“A”,“C”,“B”,“N”,“A”,“N”,“A”}
        //              / Output : A=3, B=1, C=1, N=2
        String[] arr = {"A","C","B","N","A","N","A"};

        Map<String,Integer> kullanimMiktalari = new TreeMap<>();

        // contains () kullanarak yapalim

        // arr'deki her bir elementi ele alalim

        for (String each: arr

             ) {
                // eger ele aldıgım element map'de yoksa
                //map'e element,1 eklerim

            if (! kullanimMiktalari.containsKey(each)){
                kullanimMiktalari.put(each,1);
            }else {
                // eger o element daha once map'de varsa
                // o zaman value'yu bir arttirmamiz lazim

                int elementinEskiKullanimMiktari = kullanimMiktalari.get(each);
                kullanimMiktalari.put(each,elementinEskiKullanimMiktari+1);
            }
        }
        System.out.println(kullanimMiktalari);

        //compute methodlari kullanrak da yapabiliriz

        Map<String,Integer> kullanim2 = new TreeMap<>();

        for (String aechHarf: arr
             ) {

            // eger o element daha once map'de varsa
            // o zaman value'yu bir arttirmamiz lazim

            kullanim2.computeIfPresent(aechHarf,(k,v) -> v+1);

            // eger ele aldıgım element map'de yoksa
            //map'e element,1 eklerim

            kullanim2.putIfAbsent(aechHarf,1);


        }
        System.out.println(kullanim2);
    }
}
