package day14_MethodOverloading_whiLELoop;

public class C01_Asalsayi {

    public static void main(String[] args) {

        // Verilen pozitif bir tam sayininin
        // asal sayi olup olmadıgını yazdiran bir metod olusturun
    }




    public static void asalMiYazdir( int sayi) {             //yazdirma oldugu icin void yaptık

        int flag = 0 ;

        for (int i = 2; i < sayi ; i++ ) {

            if (sayi % i == 0 ) {
                 flag ++ ;
                 break;


            }
        }

        if (flag ==0 ){
            System.out.println("Girilen" + sayi +"sayisi ASAL bir sayidir");
        } else {
            System.out.println("Girilen" + sayi + "sayisi ASAL bir sayi degildir");
        }

    }
}
