package day22_constructors;

public class C02_Hemsire {

     /*

          Ornegin bir hastane programinda hastanede calisacak hemsirelerin hangi bilgilerini tutmak istiyorsak,
          hangi methodlari hemsireler kullanmak istiyorsak
          bir hemsire class'i olusturup,
          tum bu ozellikleri( variable ve method'lari) o class' da olustururuz

          programda ne zaman bir hemsireye ihtiyac olsa
          hemsire cass'ında obje olustururuz
          boylece tum ozelliklere sahip olur

          Eger biz istedigimiz parametrelere sahip bir constructor olusturmazsak
          Java class'dan obje olusturulabilmesi icin
          class'a default bir constructor koyar

          Default constructor GORUNMEZ
          parametre yoktur,constructor body 'si bostur

          C02 Hemsire () {

          }


          Biz de istedigimiz parametrelere sahip,
          istedigimiz kadar constructor olusturabiliriz


          COK ONEMLİ :             Eger biz bir constructor olusturursak
                                   yani class'da  gozle gorunen bir constructor varsa
                                   Java default cont siler
                                   Bizim olusturdugumuz hicbir cont. 'a default cont. DENEMEZ
     */

    String isim= "isim atanmamis";
    String soyisim=" isim atanmamis";
    String telNo;
    String adress;
    int yas;
    boolean izindeMi;
    char evliMi;
    int mesaiSaati = 20;


    public int mesaiUcretiHesapla(int mesaiUcreti){

        return mesaiSaati*mesaiUcreti;

    }
}

