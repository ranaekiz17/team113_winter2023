package day08_nestedifElse.dayo6_bagimsizIfCumleleri;

import java.util.Scanner;

public class C04_ıFStatements {

    public static void main(String[] args) {


        //Soru 5- Kullanicidan notunu alin
        // 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.


        /* if statements2' da sart parantezinden sonra suslu parantez kullanmazsak
        Java ilk noktali virgul olan kismi if body olarak kabul eder

           if body zaten bir satir ise sorun olmaz
           ama if body 1 satirdan coksa,ilk satirdan sonrasi
           her durumda calısır
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if(not >= 50 && not <= 100 ){
            System.out.println("Sinifi gectin");
        }
        if (not < 50 ){
            System.out.println("Maalesef kaldin");
        }




    }
}
