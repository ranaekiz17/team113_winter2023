package day03_dataCasting;

import java.util.Scanner;

public class CO2_Scanner {
    public static void main(String[] args) {

       // Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //    girilen bilgiler : J Doe, 44

        Scanner scan = new Scanner (System.in);

        // isterseniz tek bir aciklama ile 3 bilgiyi de alabilirsiniz.

        System.out.print("Lutfen isminizi,soyisminizi ve yasinizi " +
                "\n Her bilgiden sonra ENTER'a basiniz");
    }
    Scanner scan = new Scanner (System.in);

    char isimIlkHarf= scan.nextLine( ).charAt (0);


    /*


     */

    String soyisim = scan.nextLine();
    double yas= scan.nextDouble();

    //    girilen bilgiler : J Doe, 44





}
