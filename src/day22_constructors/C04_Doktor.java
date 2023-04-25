package day22_constructors;

public class C04_Doktor {


    C04_Doktor() {
        System.out.println("parametresiz constructor calisti");


    }

    String isim = "isim atanmamis";
    String soyisim = " isim atanmamis";
    String telNo;
    String adress;
    int yas;
    boolean izindeMi;
    char evliMi;
    int mesaiSaati = 30;

    public int mesaiUcretiHesapla(int mesaiUcreti) {

        return mesaiSaati * mesaiUcreti;
    }
}

