package day22_constructors;

public class C03_hemsireRunner {

    public static void main(String[] args) {

        /*
        bir obje olusturuken parmetre olarak hicbir deger girilmezse olusturulan obje
        olusturuldugu class'daki variable lara atanan degerleri alir,
        eger bir obje olusturulan class'da deger atama yoksa Java default degerleri atar
         */

        C02_Hemsire hemsire1= new C02_Hemsire();

        System.out.println(hemsire1.isim);   //null

        System.out.println(hemsire1.evliMi); //hiclik

        System.out.println(hemsire1.yas); // 0

        System.out.println(hemsire1.izindeMi); // false

        hemsire1.isim = "Tuba";
        hemsire1.yas= 29;

        System.out.println(hemsire1.isim); //Tuba
        System.out.println(hemsire1.yas);  //29
    }
}
