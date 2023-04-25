package day32_inheritance_dataTypeKullanimi;

public class HAvciKuslar extends GKuslar {


    public void hareket(){
        System.out.println("ucarlar");
    }
    public void beslenme(){
        System.out.println("et yerler");
    }
    public void pence(){
        System.out.println("pencelidir");
    }
    public void gaga(){
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        HAvciKuslar kartalAvci = new HAvciKuslar();
        kartalAvci.hareket();  // H ucarlar
        kartalAvci.beslenme(); // H et yerler
        kartalAvci.pence();    // H pencelidir
        kartalAvci.gaga();     // H sivri gagali

        kartalAvci.kanat();  // G kanatlidir
        kartalAvci.solunum();  //  G akciger
        kartalAvci.cogalma();  //  G yumurta

        kartalAvci.omur();   //  F yasar ve olur

        GKuslar kuslar = new GKuslar();
        kuslar.hareket();  // F hareket ederler
        kuslar.beslenme(); // F beslenirler
        // kuslar.pence();    // CTE
        kuslar.gaga();     // G gagalari vardir

        kuslar.kanat();  // G kanatlidir
        kuslar.solunum();  //  G akciger
        kuslar.cogalma();  //  G yumurta

        kuslar.omur();   //  F yasar ve olur


        GKuslar kartalKus = new HAvciKuslar();
        kartalKus.hareket();  // H ucarlar
        kartalKus.beslenme(); // H et yerler
        // kartalKus.pence();    // CTE
        kartalKus.gaga();     // H sivri gagali

        kartalKus.kanat();  // G kanatlidir
        kartalKus.solunum();  //  G akciger
        kartalKus.cogalma();  //  G yumurta

        kartalKus.omur();   //  F yasar ve olurler

        FHayvanlar hayvanlar = new FHayvanlar();
       hayvanlar.hareket();  // F hareket ederler
        hayvanlar.beslenme(); // F beslenirler
        // hayvanlar.pence();    // CTE
        // hayvanlar.gaga();     //CTE
        //hayvanlar.kanat();  // CTE

        hayvanlar.solunum();  //  F solunum yaparlar
        hayvanlar.cogalma();  //  F cogalirlar

        hayvanlar.omur();   //  F yasar ve olur

        FHayvanlar kartalHayvani = new HAvciKuslar();
        kartalHayvani.hareket();  // H ucarlar
        kartalHayvani.beslenme(); // H et yerler
        // kartalHayvani.pence();    // CTE
        // kartalHayvani.gaga();     // CTE

        // kartalHayvani.kanat();  // CTE
        kartalHayvani.solunum();  //  G akciger
        kartalHayvani.cogalma();  //  G yumurta

        kartalHayvani.omur();   //  F yasar ve olur




        /*
          Ozellikler method olarak olusturulmus ise

          Data turu ve constructor  AYNI ise
          o classtan almaya baslarim buldugum ilk degeri kullanirim

          DATA turu ve constructor FARKLI ise

          data turu olan class'tan aramaya baslar
          o class veya parent class larinda
          bulamazsa CTE verir

          o class veya parent class larinda bulursa override
          edilmis mi kontrol eder ve en guncel bilgiyi ( en son olan )
          bulup yazdirir
         */


    }
}
