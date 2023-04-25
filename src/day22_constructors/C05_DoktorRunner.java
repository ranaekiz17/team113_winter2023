package day22_constructors;

public class C05_DoktorRunner {

    public static void main(String[] args) {

        C04_Doktor doktor1 = new C04_Doktor();
        doktor1.isim = "Kemal";
        doktor1.yas= 40;


        System.out.println(doktor1.soyisim);  //  isim atanmamıs
        System.out.println(doktor1.yas);      // 40


        C04_Doktor doktor2 = new C04_Doktor();


        C04_Doktor doktor3;

       //  System.out.println(doktor3.yas);
        // constructor calismadan bir obje olusturulup deger atamasi mumkun degildir

        System.out.println("variable'a atanmayan obje icin yas" + new C04_Doktor().yas);


    }
}
