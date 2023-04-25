package day28_accessModifier_encapsulation;

public class C01 {


    String str; // class level'daki her class uyesinin access modifier'i olur
                // eger access modifier gorunmuyorsa Java o class uyesini default access modifier olarak

    public int sayi ;

    static String s;
    public static  int a;
    private  int b ;
    private static int c ;
    public int d ;



    public static void main(String[] args) {

      int sayi = 10;

      //

       // System.out.println(b);  static den dolayi
        System.out.println(c);
    }


    void method1(){



    }
    static void method2(){


    }

    public void method3(){


    }
}
