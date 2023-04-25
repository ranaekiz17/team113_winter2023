package day08_nestedifElse.dayo6_bagimsizIfCumleleri;

import java.util.Scanner;

public class C05_iFElseStatements {

    public static void main(String[] args) {


        /*
         Eger bir olay icin sadece 2 olaslık varsa ve
         ve bu olasiliklardan birisi mutlaka calısacaksa
         İF ELSE Statements kullaniriz


         If
         */



        //Soru 5- Kullanicidan notunu alin
        //        50 veya daha buyukse ”Sinifi Gectin”,
        //        50’den kucukse “Maalesef kaldin” yazdirin.


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if(not >= 50 && not <= 100 ){
            System.out.println("Sinifi gectin");
        }
        else  {
            System.out.println("Maalesef kaldin");

        }




        // Kullanicidan pozitif bir tamsayi alin
        //  sayinin tek veya cift sayi oldugunu yazdirin

        System.out.println("pozitif bir tam sayi giriniz");

        int sayi = scan.nextInt();


        if (sayi % 2 ==  0) {
            System.out.println("Girilen sayi cift sayi");
            }
        else {
            System.out.println("Girilen tek sayi");
        }



        // Kullanicidan pozitif bir tam sayi alin
        // 5 ile bolunup bolunmedigini yazdirin


        if (sayi %5 == 0 ){
            System.out.println("sayi 5 ile tam bolunemez");
        }
        else {
            System.out.println("sayi 5 ile tam bolunebilirse");

        }





    }
}
