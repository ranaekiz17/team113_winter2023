package day21_arrayList_forEachLoop;

public class C02_ForEachLoop {

    public static void main(String[] args) {

        /*

        Bizden istenen gorevde siralama onemsiz ise asil amaclanan
        tum elementleri elden gecirmek ise for loop yerine for each loop
        tercih edilir

        for each loop da
        -index yok
        -baslangıc degeri yok


         */


        int [] arr = {3,5,7,3,5,8,9,2,3,5,7,};


        // arr'in tum elementlerinin toplamini yazdirin

         int toplam = 0;
         for (int each:arr
             ) {
             toplam += each;

        }

        System.out.println("Elementler toplamı :" + toplam);

         // arr'in elementlerinden 3 ile bolunebilenleri yazdirin

        for (int each: arr
             ) {
            if (each%3 == 0) ;
            System.out.println(each+ " ");
            }


        System.out.println(" ");

        //


        }










    }
