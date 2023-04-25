package day32_inheritance_dataTypeKullanimi;

public class CAvciKuslar extends BKuslar {

    String hareket = "ucarlar";
    String beslenme = "et yerler";
    String pence = "pencelidir";
    String gaga = "sivri gagali";


    public static void main(String[] args) {

        CAvciKuslar kartalAvci = new CAvciKuslar();
        System.out.println(kartalAvci.hareket);  // C classından ucarlar
        System.out.println(kartalAvci.beslenme);  // C classından et yerler
        System.out.println(kartalAvci.pence);  // C class pencelidir
        System.out.println(kartalAvci.gaga);   // c sivri gagali


        System.out.println(kartalAvci.kanat);  // B kanatlidir
        System.out.println(kartalAvci.solunum);  // B akciger
        System.out.println(kartalAvci.cogalma);  // B yumurtayla


        System.out.println(kartalAvci.omur);  //A yasar ve olurler


       BKuslar kartalKus = new CAvciKuslar();
        System.out.println(kartalKus.hareket);  // A hareket ederler
        System.out.println(kartalKus.beslenme);  // A beslenirler
        // System.out.println(kartalKus.pence);  // CTE
        System.out.println(kartalKus.gaga);   // B gagalari vardir


        System.out.println(kartalKus.kanat);  // B kanatlidir
        System.out.println(kartalKus.solunum);  // B akciger
        System.out.println(kartalKus.cogalma);  // B yumurtayla


        System.out.println(kartalKus.omur);  //A yasar ve olurler



        AHayvanlar kartalHayvani = new CAvciKuslar();

        System.out.println(kartalHayvani.hareket);  // C classından ucarlar
        System.out.println(kartalHayvani.beslenme);  // C classından et yerler
       // System.out.println(kartalHayvani.pence);  // CTE
       // System.out.println(kartalHayvani.gaga);   // CTE


       // System.out.println(kartalHayvani.kanat);  // CTE
        System.out.println(kartalHayvani.solunum);  // A nefes alirlar
        System.out.println(kartalHayvani.cogalma);  // A cogalirlar


        System.out.println(kartalHayvani.omur);  //A yasar ve olurler

        // Variable olarak ozellikleri olusturusak
        BKuslar kuslar = new BKuslar();
        BKuslar avciKuslar= new BKuslar();
        // bu iki obje arasinda bir fark goremeyiz



       /*
        Eger bir obje olusturulurken
        Data turu ile constructor ayni ise
        aradigimiz ozellikler icin direk o class'a gider
        ve o ozellikleri arariz


        Eger data turu ve constructor farkli ise
        variable ve metodlar farklı davranirlar

        Variable'lar  once  data  turunun oldugu
        class a bakar o variable'i bulursa degerini


        ozetle bir ozelliigi variable olarak olusturursaniz
        data  turu olan class ve parentlarndaki ortak ozellikleri

         **** eger ortak ozellikleri vermek istiyorsaniz variable olarak olusturmalisiniz..
        */

    }
}
