package day24_staticKeyword;

public class C01_staticBlocks {

     C01_staticBlocks(){
         System.out.println("Constructor calisti");
     }


    public static void main(String[] args) {

        System.out.println("Main Method calisti");

        System.out.println(" ========= ");
        C01_staticBlocks obj1 = new C01_staticBlocks();
    }

     static {
         System.out.println("static block calışti");

         /*
          static block'lar  class ilk calismaya basladiginda calisir
          genel olarak class icin gerekli on ayarlamalari yapmak icin kullanilir

          birden fazla static blok varsa
          yukaridan asagi dogru  sirali olarak calisir
          */
     }
     static {
         System.out.println("Alttaki static block calisti ");
     }

    {
        /*
        static olmayan block'lar ise obje olusturulurken
        constructor'dan once calisir
        obje icin yapilmasi gereken on ayarlamalari yapmak icin kullanilirr
         */
        System.out.println("static olmayan block calisti");
    }
}
